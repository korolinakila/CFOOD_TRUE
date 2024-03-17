package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdMain extends AppCompatActivity {
    TextView zavtrak, first_z, second_z, third_z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_main);
        zavtrak = findViewById(R.id.zavtrak);
        first_z = findViewById(R.id.first_z);
        second_z = findViewById(R.id.second_z);
        third_z = findViewById(R.id.third_z);
        Intent intent = getIntent();
        int cl = intent.getIntExtra("callor", 0);
        second_z.setText("Макароны:"  +cl+ "гр");
    }
}