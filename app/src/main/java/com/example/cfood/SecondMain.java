package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondMain extends AppCompatActivity {
    TextView textView;
    Button button, switcher2;
    EditText inputText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        textView =  findViewById(R.id.textView);
        button =  findViewById(R.id.button);
        inputText = findViewById(R.id.inputText);
        switcher2 = findViewById(R.id.switcher2);
        Intent intent = getIntent();
        boolean milk = intent.getBooleanExtra("milk", false);
        boolean alco = intent.getBooleanExtra("alco", false);
        boolean soy = intent.getBooleanExtra("soy", false);
        boolean fish = intent.getBooleanExtra("fish", false);
        boolean fruit = intent.getBooleanExtra("fruit", false);
        boolean vegetables = intent.getBooleanExtra("vegetables", false);
        boolean chocolate = intent.getBooleanExtra("chocolate", false);
        boolean gluten = intent.getBooleanExtra("gluten", false);
        boolean egg = intent.getBooleanExtra("egg", false);
        boolean nut = intent.getBooleanExtra("nut", false);
        Random random = new Random();

        HashMap<String, Double> zavtrak_f = new HashMap<>();
        // Добавление элементов в словарь
        zavtrak_f.put("oatmeal", 69.6);
        zavtrak_f.put("pancakes", 230.7);
        zavtrak_f.put("cereals", 369.6);


        HashMap<String, Double> zavtrak_s = new HashMap<>();
        // Добавление элементов в словарь
        zavtrak_s.put("yogurt", 64.2);
        zavtrak_s.put("sandwich", 269.5);
        zavtrak_s.put("banana", 89.4);


        HashMap<String, Double> zavtrak_t = new HashMap<>();
        // Добавление элементов в словарь
        zavtrak_t.put("juice", 53.7);
        zavtrak_t.put("smoothie", 79.7);
        zavtrak_t.put("milk", 51.3);


        HashMap<String, Double> obed_f = new HashMap<>();
        // Добавление элементов в словарь
        obed_f.put("new england clam chowder", 80.5);
        obed_f.put("noodle soup", 25.1);
        obed_f.put("chicken tortilla soup", 52.4);


        HashMap<String, Double> obed_s = new HashMap<>();
        // Добавление элементов в словарь
        obed_s.put("pasta", 156.);
        obed_s.put("rice", 127.4);
        obed_s.put("pelmeni", 208.7);


        HashMap<String, Double> obed_t = new HashMap<>();
        // Добавление элементов в словарь
        obed_t.put("tomato juice", 17.3);
        obed_t.put("salad", 23.6);
        obed_t.put("ice cream", 207.1);


        HashMap<String, Double> dinner_f = new HashMap<>();
        // Добавление элементов в словарь
        dinner_f.put("curry", 101.);
        dinner_f.put("lasagna", 157.7);
        dinner_f.put("ratatouille", 58.3);


        HashMap<String, Double> dinner_s = new HashMap<>();
        // Добавление элементов в словарь
        dinner_s.put("steak", 273.4);
        dinner_s.put("baked potato", 94.8);
        dinner_s.put("tacos", 205.5);


        HashMap<String, Double> dinner_t = new HashMap<>();
        // Добавление элементов в словарь
        dinner_t.put("hot chocolate", 54.2);
        dinner_t.put("lemonade", 38.9);
        dinner_t.put("red wine", 87.3);




        if (milk){
            zavtrak_f.remove("cereals",369.6);
            zavtrak_s.remove("yogurt", 64.2);
            zavtrak_t.remove("milk", 51.3);
            obed_t.remove("ice cream", 207.1);

        }
        if (alco){
            dinner_t.remove("red wine", 87.3);
        }
        if (fruit){
            zavtrak_s.remove("banana", 89.4);
            zavtrak_t.remove("juice", 53.7);

        }
        if (vegetables){

            obed_f.remove("new england clam chowder", 80.5);
            obed_f.remove("noodle soup", 25.1);

            obed_t.remove("tomato juice", 17.3);


            dinner_f.remove("ratatouille", 58.3);
            dinner_s.remove("baked potato", 94.8);

        }
        if(chocolate){
            dinner_t.remove("hot chocolate", 54.2);
        }
        if (gluten){
            dinner_s.remove("tacos", 205.5);
            zavtrak_f.remove("pancakes", 230.7);
        }

        if (nut){
            dinner_f.remove("curry", 101.);
        }

        List<String> keys_z_f = new ArrayList<>(zavtrak_f.keySet());
        int randomIndex_z_f = random.nextInt(keys_z_f.size());
        String randomKey_z_f = keys_z_f.get(randomIndex_z_f);
        double randomValue_z_f = zavtrak_f.get(randomKey_z_f);

        List<String> keys_z_s = new ArrayList<>(zavtrak_s.keySet());
        int randomIndex_z_s = random.nextInt(keys_z_s.size());
        String randomKey_z_s = keys_z_s.get(randomIndex_z_s);
        double randomValue_z_s = zavtrak_s.get(randomKey_z_s);

        List<String> keys_z_t = new ArrayList<>(zavtrak_t.keySet());
        int randomIndex_z_t = random.nextInt(keys_z_t.size());
        String randomKey_z_t = keys_z_t.get(randomIndex_z_t);
        double randomValue_z_t = zavtrak_t.get(randomKey_z_t);

        List<String> keys_o_f = new ArrayList<>(obed_f.keySet());
        int randomIndex_o_f = random.nextInt(keys_o_f.size());
        String randomKey_o_f = keys_o_f.get(randomIndex_o_f);
        double randomValue_o_f = obed_f.get(randomKey_o_f);

        List<String> keys_o_s = new ArrayList<>(obed_s.keySet());
        int randomIndex_o_s = random.nextInt(keys_o_s.size());
        String randomKey_o_s = keys_o_s.get(randomIndex_o_s);
        double randomValue_o_s = obed_s.get(randomKey_o_s);

        List<String> keys_o_t = new ArrayList<>(obed_t.keySet());
        int randomIndex_o_t = random.nextInt(keys_o_t.size());
        String randomKey_o_t = keys_o_t.get(randomIndex_o_t);
        double randomValue_o_t = obed_t.get(randomKey_o_t);

        List<String> keys_d_f = new ArrayList<>(dinner_f.keySet());
        int randomIndex_d_f = random.nextInt(keys_d_f.size());
        String randomKey_d_f = keys_d_f.get(randomIndex_d_f);
        double randomValue_d_f = dinner_f.get(randomKey_d_f);

        List<String> keys_d_s = new ArrayList<>(dinner_s.keySet());
        int randomIndex_d_s = random.nextInt(keys_d_s.size());
        String randomKey_d_s = keys_d_s.get(randomIndex_d_s);
        double randomValue_d_s = dinner_s.get(randomKey_d_s);

        List<String> keys_d_t = new ArrayList<>(dinner_t.keySet());
        int randomIndex_d_t = random.nextInt(keys_d_t.size());
        String randomKey_d_t = keys_d_t.get(randomIndex_d_t);
        double randomValue_d_t = dinner_t.get(randomKey_d_t);


        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {

                try {


                    try {

                            setOnClick(button, randomValue_z_f, randomKey_z_f, randomValue_z_s, randomKey_z_s, randomValue_z_t, randomKey_z_t, randomValue_o_f, randomKey_o_f, randomValue_o_s, randomKey_o_s, randomValue_o_t, randomKey_o_t, randomValue_d_f, randomKey_d_f, randomValue_d_s, randomKey_d_s, randomValue_d_t, randomKey_d_t);


                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();


    }




    public int Path_fivty(double food, int mass){ //возвращает кол-во грамм для 50% от заданного кол-ва каллорий
        double path_mass = mass*0.55;
        double path_forty = (100*path_mass)/food;
        return (int) Math.round(path_forty);
    }

    public int Path_thirty(double food, int mass){ //возвращает кол-во грамм для 40% от заданного кол-ва каллорий
        double path_mass = mass*0.35;
        double path_thirty = (100*path_mass)/food;
        return (int) Math.round(path_thirty);
    }

    public int Path_ten(double food, int mass){ //возвращает кол-во грамм для 40% от заданного кол-ва каллорий
        double path_mass = mass*0.10;
        double path_fifteen = (100*path_mass)/food;
        return (int) Math.round(path_fifteen);
    }
    private void setOnClick(final Button button, final double calories1, String name_1, final double calories2, String name_2, final double calories3, String name_3, final double calories4, String name_4, final double calories5, String name_5, final double calories6, String name_6, final double calories7, String name_7, final double calories8, String name_8, final double calories9, String name_9){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soccer = Integer.parseInt(inputText.getText().toString());

                textView.setText("Количество калорий:"+soccer);
                System.out.println(soccer + "ffffff");
                setOnClick_switch(Path_fivty(calories1, soccer), name_1, Path_thirty(calories2, soccer), name_2, Path_ten(calories3, soccer), name_3, Path_fivty(calories4, soccer), name_4, Path_thirty(calories5, soccer), name_5, Path_ten(calories6, soccer), name_6, Path_fivty(calories7, soccer), name_7, Path_thirty(calories8, soccer), name_8, Path_ten(calories9, soccer), name_9);


            }
        });


    }

    private void setOnClick_switch(int cl1, String name1, int cl2, String name2, int cl3, String name3, int cl4, String name4, int cl5, String name5, int cl6, String name6, int cl7, String name7, int cl8, String name8, int cl9, String name9){
        switcher2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perehod(cl1, name1, cl2, name2, cl3, name3, cl4, name4, cl5, name5, cl6, name6, cl7, name7, cl8, name8, cl9, name9);
            }
        });
    }

    public void Perehod(int cl1, String name1, int cl2, String name2, int cl3, String name3, int cl4, String name4, int cl5, String name5, int cl6, String name6, int cl7, String name7, int cl8, String name8, int cl9, String name9){
        Intent intent = new Intent(this, ThirdMain.class);
        String fin_str1 = name1 + ": "+cl1;
        String fin_str2 = name2 + ": "+cl2;
        String fin_str3 = name3 + ": "+cl3;
        String fin_str4 = name4 + ": "+cl4;
        String fin_str5 = name5 + ": "+cl5;
        String fin_str6 = name6 + ": "+cl6;
        String fin_str7 = name7 + ": "+cl4;
        String fin_str8 = name8 + ": "+cl5;
        String fin_str9 = name9 + ": "+cl6;
        intent.putExtra("z_f", fin_str1);
        intent.putExtra("z_s", fin_str2);
        intent.putExtra("z_t", fin_str3);
        intent.putExtra("o_f", fin_str4);
        intent.putExtra("o_s", fin_str5);
        intent.putExtra("o_t", fin_str6);
        intent.putExtra("d_f", fin_str7);
        intent.putExtra("d_s", fin_str8);
        intent.putExtra("d_t", fin_str9);
        startActivity(intent);
    }


}