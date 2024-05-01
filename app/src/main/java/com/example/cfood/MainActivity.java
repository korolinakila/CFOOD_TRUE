package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greeting, offer;
    Button  switcher;

    CheckBox milk, alco, soy, fish, fruit, vegetables, chocolate, gluten, hot, nut;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greeting = findViewById(R.id.greeting);
        offer = findViewById(R.id.offer);
        milk = findViewById(R.id.milk);
        chocolate = findViewById(R.id.chocolate);
        alco = findViewById(R.id.alco);
        hot = findViewById(R.id.hot);
        soy = findViewById(R.id.soy);
        vegetables = findViewById(R.id.vegetables);
        fruit = findViewById(R.id.fruit);
        gluten = findViewById(R.id.gluten);
        fish = findViewById(R.id.fish);
        nut = findViewById(R.id.nut);
        switcher = findViewById(R.id.button2);
        Intent intent = new Intent(this, SecondMain.class);


        switcher.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Perehod(intent);
            }
        });

    }
    public void Perehod(Intent intent){


        if (milk.isChecked()) {
            intent.putExtra("milk", true);
        }
        else{
            if (intent.hasExtra("milk")) {
                intent.removeExtra("milk");
            }
        }

        if (alco.isChecked()) {
            intent.putExtra("alco", true);
        }
        else{
            if (intent.hasExtra("alco")) {
                intent.removeExtra("alco");
            }
        }
        if (soy.isChecked()) {
            intent.putExtra("soy", true);
        }
        else{
            if (intent.hasExtra("soy")) {
                intent.removeExtra("soy");
            }
        }
        if (fish.isChecked()) {
            intent.putExtra("fish", true);
        }
        else{
            if (intent.hasExtra("fish")) {
                intent.removeExtra("fish");
            }
        }
        if (fruit.isChecked()) {
            intent.putExtra("fruit", true);
        }
        else{
            if (intent.hasExtra("fruit")) {
                intent.removeExtra("fruit");
            }
        }
        if (vegetables.isChecked()) {
            intent.putExtra("vegetables", true);
        }
        else{
            if (intent.hasExtra("vegetables")) {
                intent.removeExtra("vegetables");
            }
        }
        if (chocolate.isChecked()) {
            intent.putExtra("chocolate", true);
        }
        else{
            if (intent.hasExtra("chocolate")) {
                intent.removeExtra("chocolate");
            }
        }
        if (gluten.isChecked()) {
            intent.putExtra("gluten", true);
        }
        else{
            if (intent.hasExtra("gluten")) {
                intent.removeExtra("gluten");
            }
        }
        if (hot.isChecked()) {
            intent.putExtra("hot", true);
        }
        else{
            if (intent.hasExtra("hot")) {
                intent.removeExtra("hot");
            }
        }
        if (nut.isChecked()) {
            intent.putExtra("nut", true);
        }
        else{
            if (intent.hasExtra("nut")) {
                intent.removeExtra("nut");
            }
        }
        System.out.println("end");
        startActivity(intent);

    }
}