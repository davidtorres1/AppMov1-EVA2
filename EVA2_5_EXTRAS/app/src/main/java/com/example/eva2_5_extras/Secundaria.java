package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtView = findViewById(R.id.txtView);
        Intent intent = getIntent();
        txtView.setText(intent.getStringExtra("datos"));
    }

    public void sClick(View v){
        finish();
    }
}
