package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdMain extends AppCompatActivity {
    TextView zavtrak, first_z, second_z, third_z, obed, first_o, second_o, third_o, first_d, second_d, third_d, link1, link2, link3, link4, link5, link6, link7, link8, link9;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_main);
        zavtrak = findViewById(R.id.zavtrak);
        first_z = findViewById(R.id.first_z);
        second_z = findViewById(R.id.second_z);
        third_z = findViewById(R.id.third_z);
        obed = findViewById(R.id.obed);
        first_o = findViewById(R.id.first_o);
        second_o = findViewById(R.id.second_o);
        third_o = findViewById(R.id.third_o);
        first_d = findViewById(R.id.first_d);
        second_d = findViewById(R.id.second_d);
        third_d = findViewById(R.id.third_d);
        link1 = findViewById(R.id.link1);
        link2 = findViewById(R.id.link2);
        link3 = findViewById(R.id.link3);
        link4 = findViewById(R.id.link4);
        link5 = findViewById(R.id.link5);
        link6 = findViewById(R.id.link6);
        link7 = findViewById(R.id.link7);
        link8 = findViewById(R.id.link8);
        link9 = findViewById(R.id.link9);



        Intent intent = getIntent();
        String z_f = intent.getStringExtra("z_f");
        String z_s = intent.getStringExtra("z_s");
        String z_t = intent.getStringExtra("z_t");
        String o_f = intent.getStringExtra("o_f");
        String o_s = intent.getStringExtra("o_s");
        String o_t = intent.getStringExtra("o_t");
        String d_f = intent.getStringExtra("d_f");
        String d_s = intent.getStringExtra("d_s");
        String d_t = intent.getStringExtra("d_t");
        System.out.println("start");
        System.out.println(z_f);
        System.out.println(Word(z_f));
        switch (Word(z_f)) {
            case "Овсянка":
                link1.setText("https://www.povarenok.ru/recipes/show/41496/");

                break;
            case "Блины":
                link1.setText("https://www.povarenok.ru/recipes/show/52956/");
                break;
            case "Омлет по-французски":
                link1.setText("https://www.povarenok.ru/recipes/show/115815/");
                break;
            case "Картофельное пюре":
                link1.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link1.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }

        switch (Word(z_s)) {
            case "Йогурт":
                link2.setText("https://www.povarenok.ru/recipes/show/58852/");
                break;
            case "Сэндвич":
                link2.setText("https://www.povarenok.ru/recipes/show/81135/");
                break;
            case "Банан":
                link2.setText("Продается на рынке");

                break;
            case "Картофельное пюре":
                link2.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link2.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }

        switch (Word(z_t)) {
            case "Сок":
                link3.setText("https://www.povarenok.ru/recipes/show/112265/");
                break;
            case "Бананово-клубничный смузи":
                link3.setText("https://www.povarenok.ru/recipes/show/64746/");
                break;
            case "Молоко":
                link3.setText("Продается на рынке");

                break;
            case "Картофельное пюре":
                link3.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link3.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }

        switch (Word(o_f)) {
            case "Суп-пюре Пармантье":
                link4.setText("https://www.povarenok.ru/recipes/show/51437/");
                break;
            case "Суп с лапшой":
                link4.setText("https://www.povarenok.ru/recipes/show/159653/");
                break;
            case "Суп торговца скота из Тапеи":
                link4.setText("https://www.povarenok.ru/recipes/show/43754/");
                break;
            case "Картофельное пюре":
                link4.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link4.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }
        switch (Word(o_s)) {
            case "Макароны с сыром":
                link5.setText("https://www.povarenok.ru/recipes/show/113360/");
                break;
            case "Плов":
                link5.setText("https://www.povarenok.ru/recipes/show/26049/");
                break;
            case "Пельмени":
                link5.setText("https://www.povarenok.ru/recipes/show/75234/");
                break;
            case "Картофельное пюре":
                link5.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link5.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }
        switch (Word(o_t)) {
            case "Компот из сухофруктов":
                link6.setText("https://www.povarenok.ru/recipes/show/100770/");
                break;
            case "Салат Глехурад":
                link6.setText("https://www.povarenok.ru/recipes/show/91200/");
                break;
            case "Мороженое крем-брюле":
                link6.setText("https://www.povarenok.ru/recipes/show/57956/");
                break;
            case "Картофельное пюре":
                link6.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link6.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }
        switch (Word(d_f)) {
            case "Цыплeнок-карри":
                link7.setText("https://www.povarenok.ru/recipes/show/51375/");
                break;
            case "Лазанья":
                link7.setText("https://www.povarenok.ru/recipes/show/14005/");
                break;
            case "Рататуй":
                link7.setText("https://www.povarenok.ru/recipes/show/168078/");
                break;
            case "Картофельное пюре":
                link7.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link7.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }
        switch (Word(d_s)) {
            case "Стэйк":
                link8.setText("https://www.povarenok.ru/recipes/show/138773/");
                break;
            case "Картофель по деревенски":
                link8.setText("https://www.povarenok.ru/recipes/show/46837/");
                break;
            case "Тако с морепродуктами":
                link8.setText("https://www.povarenok.ru/recipes/show/63998/");
                break;
            case "Картофельное пюре":
                link8.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link8.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }
        switch (Word(d_t)) {
            case "Пряный горячий шоколад":
                link9.setText("https://www.povarenok.ru/recipes/show/154467/");
                break;
            case "Лимонад":
                link9.setText("https://www.povarenok.ru/recipes/show/57853/");
                break;
            case "Красное вино":
                link9.setText("Продается в алкомаркетах");
                break;
            case "Картофельное пюре":
                link9.setText("https://www.povarenok.ru/recipes/show/145494/");
                break;
            case "Похлебка по-деревенски":
                link9.setText("https://www.povarenok.ru/recipes/show/97254/");
                break;
        }


        System.out.println("fin");
        second_z.setText(z_s+ "гр");
        first_z.setText(z_f+ "гр");
        third_z.setText(z_t+ "гр");
        second_o.setText(o_s+ "гр");
        first_o.setText(o_f+ "гр");
        third_o.setText(o_t+ "гр");
        second_d.setText(d_s+ "гр");
        first_d.setText(d_f+ "гр");
        third_d.setText(d_t+ "гр");


    }
    public String Word(String str){
        int index = str.indexOf(":");
        String substringBeforeColon = str.substring(0, index);
        return substringBeforeColon;
    }

}