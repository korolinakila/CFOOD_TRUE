package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class SecondMain extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        textView =  findViewById(R.id.textView);
        button =  findViewById(R.id.button);
        inputText = findViewById(R.id.inputText);
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
                            double calories = item.getDouble("calories");
                            System.out.println(calories);}
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                int soccer = Integer.parseInt(inputText.getText().toString());

                                textView.setText("Количество калорий:"+ soccer);

                            }
                        });
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
}