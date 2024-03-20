package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.json.JSONArray;
import org.json.JSONObject;

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
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    String api_url = "https://api.calorieninjas.com/v1/nutrition?query=";
                    String query = "pasta";
                    URL url = null;
                    try {
                        url = new URL(api_url + query);

                        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                        connection.setRequestMethod("GET");
                        connection.setRequestProperty("X-Api-Key", "H/9OuzUj5ZZcny14Lz8mpA==LVMG5rZBRAw2PTab");

                        int status_code = connection.getResponseCode();
                        if (status_code == HttpURLConnection.HTTP_OK) {
                            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                            String line;
                            StringBuilder response = new StringBuilder();

                            while ((line = reader.readLine()) != null) {
                                response.append(line);
                            }
                            reader.close();
                            String jsonText = response.toString();
                            JSONObject jsonObject = new JSONObject(jsonText);
                            JSONArray items = jsonObject.getJSONArray("items");
                            JSONObject item = (JSONObject) items.get(0);
                            double cl = item.getDouble("calories");
                            System.out.println("adsd");
                            setOnClick(button, cl);
                            System.out.println("2222");
                            System.out.println(cl);
                        }






                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
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
    private void setOnClick(final Button button, final double calories){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soccer = Integer.parseInt(inputText.getText().toString());

                textView.setText("Количество калорий:"+soccer);
                System.out.println(soccer + "ffffff");
                setOnClick_switch(Path_forty(calories, soccer));


            }
        });


    }

    private void setOnClick_switch(int cl){
        switcher2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perehod(cl);
            }
        });
    }

    public void Perehod(int cl){
        Intent intent = new Intent(this, ThirdMain.class);
        intent.putExtra("callor", cl);
        startActivity(intent);
    }
}