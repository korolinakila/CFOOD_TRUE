package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdMain extends AppCompatActivity {
    TextView zavtrak, first_z, second_z, third_z, obed, first_o, second_o, third_o, first_d, second_d, third_d;
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
}