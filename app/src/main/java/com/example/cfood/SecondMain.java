package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
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
        boolean hot = intent.getBooleanExtra("hot", false);
        boolean nut = intent.getBooleanExtra("nut", false);
        Random random = new Random();


        List<HashMap<String, Double>> listOfDictionaries = new ArrayList<>();


        HashMap<String, Double> zavtrak_f = new HashMap<>();
        // Добавление элементов в словарь
        zavtrak_f.put("Овсянка", 64.);//https://www.povarenok.ru/recipes/show/41496/
        zavtrak_f.put("Блины", 123.1);//https://www.povarenok.ru/recipes/show/52956/
        zavtrak_f.put("Омлет по-французски", 132.2);//https://www.povarenok.ru/recipes/show/115815/
        listOfDictionaries.add(zavtrak_f);


        HashMap<String, Double> zavtrak_s = new HashMap<>();
        // Добавление элементов в словарь
        zavtrak_s.put("Йогурт", 197.4);//https://www.povarenok.ru/recipes/show/58852/
        zavtrak_s.put("Сэндвич", 185.5);//https://www.povarenok.ru/recipes/show/81135/
        zavtrak_s.put("Банан", 121.4);//
        listOfDictionaries.add(zavtrak_s);


        HashMap<String, Double> zavtrak_t = new HashMap<>();
        // Добавление элементов в словарь
        zavtrak_t.put("Сок", 95.);//https://www.povarenok.ru/recipes/show/112265/
        zavtrak_t.put("Бананово-клубничный смузи", 70.5);//https://www.povarenok.ru/recipes/show/64746/
        zavtrak_t.put("Молоко", 64.3);//
        listOfDictionaries.add(zavtrak_t);


        HashMap<String, Double> obed_f = new HashMap<>();
        // Добавление элементов в словарь
        obed_f.put("Суп-пюре Пармантье",151.3);//https://www.povarenok.ru/recipes/show/51437/
        obed_f.put("Суп с лапшой", 119.7); //https://www.povarenok.ru/recipes/show/159653/
        obed_f.put("Суп торговца скота из Тапеи", 142.9); //https://www.povarenok.ru/recipes/show/43754/
        listOfDictionaries.add(obed_f);


        HashMap<String, Double> obed_s = new HashMap<>();
        // Добавление элементов в словарь
        obed_s.put("Макароны с сыром", 150.4);//https://www.povarenok.ru/recipes/show/113360/
        obed_s.put("Плов", 228.3);//https://www.povarenok.ru/recipes/show/26049/
        obed_s.put("Пельмени", 179.1);//https://www.povarenok.ru/recipes/show/75234/
        listOfDictionaries.add(obed_s);


        HashMap<String, Double> obed_t = new HashMap<>();
        // Добавление элементов в словарь
        obed_t.put("Компот из сухофруктов", 32.9);//https://www.povarenok.ru/recipes/show/100770/
        obed_t.put("Салат Глехурад", 100.4);//https://www.povarenok.ru/recipes/show/91200/
        obed_t.put("Мороженое крем-брюле", 87.8);//https://www.povarenok.ru/recipes/show/57956/
        listOfDictionaries.add(obed_t);


        HashMap<String, Double> dinner_f = new HashMap<>();
        // Добавление элементов в словарь
        dinner_f.put("Цыплeнок-карри", 148.1);//https://www.povarenok.ru/recipes/show/51375/
        dinner_f.put("Лазанья", 105.2);//https://www.povarenok.ru/recipes/show/14005/
        dinner_f.put("Рататуй", 92.6);//https://www.povarenok.ru/recipes/show/168078/
        listOfDictionaries.add(dinner_f);


        HashMap<String, Double> dinner_s = new HashMap<>();
        // Добавление элементов в словарь
        dinner_s.put("Стэйк", 184.8);//https://www.povarenok.ru/recipes/show/138773/
        dinner_s.put("Картофель по деревенски", 172.5);//https://www.povarenok.ru/recipes/show/46837/
        dinner_s.put("Тако с морепродуктами", 161.4);//https://www.povarenok.ru/recipes/show/63998/
        listOfDictionaries.add(dinner_s);


        HashMap<String, Double> dinner_t = new HashMap<>();
        // Добавление элементов в словарь
        dinner_t.put("Пряный горячий шоколад", 90.5);//https://www.povarenok.ru/recipes/show/154467/
        dinner_t.put("Лимонад", 40.3);//https://www.povarenok.ru/recipes/show/57853/
        dinner_t.put("Красное вино", 87.3);//
        listOfDictionaries.add(dinner_t);




        if (milk){
            zavtrak_f.remove("Овсянка", 64.);
            zavtrak_f.remove("Блины", 123.1);
            zavtrak_s.remove("Йогурт", 197.4);
            zavtrak_t.remove("Молоко", 64.3);
            obed_s.remove("Макароны с сыром", 150.4);
            obed_t.remove("Мороженое крем-брюле", 87.8);
            dinner_f.remove("Лазанья", 105.2);
            dinner_t.remove("Пряный горячий шоколад", 90.5);
            zavtrak_t.remove("Молоко", 64.3);


        }
        if (alco){
            dinner_t.remove("Красное вино", 87.3);
        }
        if (fruit){
            zavtrak_s.remove("Банан", 121.4);
            zavtrak_t.remove("Сок", 95.);
            obed_t.remove("Компот из сухофруктов", 32.9);

        }
        if (vegetables){
            obed_f.remove("Суп торговца скота из Тапеи", 142.9);
            obed_s.remove("Макароны с сыром", 150.4);
        }
        if(chocolate){
            dinner_t.remove("Пряный горячий шоколад", 90.5);
        }
        if (gluten){
            zavtrak_t.remove("Бананово-клубничный смузи", 70.5);
        }

        if (nut){
            obed_t.remove("Салат Глехурад", 100.4);
        }
        if (hot){
            dinner_f.remove("Цыплeнок-карри", 148.1);
            dinner_s.remove("Стэйк", 184.8);
            dinner_s.remove("Тако с морепродуктами", 161.4);
        }
        if (soy){
            obed_s.remove("Макароны с сыром", 150.4);
            dinner_f.remove("Рататуй", 92.6);
            dinner_s.remove("Стэйк", 184.8);
        }
        if (fish){
            zavtrak_s.remove("Сэндвич", 185.5);
            dinner_s.remove("Тако с морепродуктами", 161.4);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////

        for (HashMap dic : listOfDictionaries) {
            if (dic.isEmpty()){
                System.out.println("*");
                dic.put("Картофельное пюре", 120.);//https://www.povarenok.ru/recipes/show/145494/
                dic.put("Похлебка по-деревенски", 87.8);//https://www.povarenok.ru/recipes/show/97254/
            }
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
        if (randomKey_z_t == randomKey_z_s){
            while (randomKey_z_t == randomKey_z_s){
                randomIndex_z_t = random.nextInt(keys_z_t.size());
                randomKey_z_t = keys_z_t.get(randomIndex_z_t);
            }
        }
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


        String finalRandomKey_z_t = randomKey_z_t;
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {

                try {


                    try {

                            setOnClick(button, randomValue_z_f, randomKey_z_f, randomValue_z_s, randomKey_z_s, randomValue_z_t, finalRandomKey_z_t, randomValue_o_f, randomKey_o_f, randomValue_o_s, randomKey_o_s, randomValue_o_t, randomKey_o_t, randomValue_d_f, randomKey_d_f, randomValue_d_s, randomKey_d_s, randomValue_d_t, randomKey_d_t);


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




    public int Path_forty(double food, int mass){ //возвращает кол-во грамм для 40% от заданного кол-ва каллорий
        double path_mass = mass*0.4;
        double path_forty = (100*path_mass)/food;
        return (int) Math.round(path_forty);
    }

    public int Path_fivty(double food, int mass){ //возвращает кол-во грамм для 50% от заданного кол-ва каллорий
        double path_mass = mass*0.5;
        double path_thirty = (100*path_mass)/food;
        return (int) Math.round(path_thirty);
    }

    public int Path_ten(double food, int mass){ //возвращает кол-во грамм для 10% от заданного кол-ва каллорий
        double path_mass = mass*0.1;
        double path_fifteen = (100*path_mass)/food;
        return (int) Math.round(path_fifteen);
    }
    private void setOnClick(final Button button, final double calories1, String name_1, final double calories2, String name_2, final double calories3, String name_3, final double calories4, String name_4, final double calories5, String name_5, final double calories6, String name_6, final double calories7, String name_7, final double calories8, String name_8, final double calories9, String name_9){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int soccer = Integer.parseInt(inputText.getText().toString());
                    textView.setText("Количество калорий:" + soccer);
                    setOnClick_switch(Path_forty(calories1, soccer), name_1, Path_fivty(calories2, soccer), name_2, Path_ten(calories3, soccer), name_3, Path_forty(calories4, soccer), name_4, Path_fivty(calories5, soccer), name_5, Path_ten(calories6, soccer), name_6, Path_forty(calories7, soccer), name_7, Path_fivty(calories8, soccer), name_8, Path_ten(calories9, soccer), name_9);

                } catch (NumberFormatException e) {
                    // Обработка исключения, если ввод не удалось преобразовать в число
                    textView.setText("Ошибка: Введите корректное число");
                }



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