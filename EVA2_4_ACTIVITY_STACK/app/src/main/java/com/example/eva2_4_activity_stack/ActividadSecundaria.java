package com.example.eva2_4_activity_stack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActividadSecundaria extends AppCompatActivity {


    //Intent inBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_secundaria);
        //inBack = new Intent(this, MainActivity);
    }

    public void onClick(View v){
        //startActivity(inBack);
        finish();
    }

}
