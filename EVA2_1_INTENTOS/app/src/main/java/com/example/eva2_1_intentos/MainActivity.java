package com.example.eva2_1_intentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLanzar;
    Intent inLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLanzar = findViewById(R.id.btnLanzar);
        inLanzar = new Intent(this, Secundaria.class);
    }

    public void miClick(View v){
        startActivity(inLanzar);
    }

}
