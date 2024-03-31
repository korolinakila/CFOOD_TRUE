package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greeting, offer;
    Button  switcher;

    CheckBox milk, alco, soy, fish, fruit, vegetables, chocolate, gluten, egg, nut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greeting = findViewById(R.id.greeting);
        offer = findViewById(R.id.offer);
        milk = findViewById(R.id.milk);
        chocolate = findViewById(R.id.chocolate);
        alco = findViewById(R.id.alco);
        egg = findViewById(R.id.egg);
        soy = findViewById(R.id.soy);
        vegetables = findViewById(R.id.vegetables);
        fruit = findViewById(R.id.fruit);
        gluten = findViewById(R.id.gluten);
        fish = findViewById(R.id.fish);
        nut = findViewById(R.id.nut);
        switcher = findViewById(R.id.button2);
        Intent intent = new Intent(this, SecondMain.class);
        milk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("milk", true);

                }
            }
        });
        alco.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("alco", true);

                }
            }
        });
        soy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("soy", true);

                }
            }
        });
        fish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("fish", true);

                }
            }
        });
        fruit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("fruit", true);

                }
            }
        });
        vegetables.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("vegetables", true);

                }
            }
        });
        chocolate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("chocolate", true);

                }
            }
        });
        gluten.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("gluten", true);

                }
            }
        });
        egg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("egg", true);

                }
            }
        });
        nut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    intent.putExtra("nut", true);

                }
            }
        });
        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perehod(intent);
            }
        });

    }
    public void Perehod(Intent intent){

        startActivity(intent);
    }
}