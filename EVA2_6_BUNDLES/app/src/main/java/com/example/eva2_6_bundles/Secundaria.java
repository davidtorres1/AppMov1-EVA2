package com.example.eva2_6_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtView = findViewById(R.id.txtView);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        txtView.append(bundle.getString("nombre") + " ");
        txtView.append(bundle.getString("apellido") + " ");
        txtView.append(bundle.getInt("edad") + " ");
        switch (bundle.getInt("sexo")){
            case 0:
                txtView.append("Masculino");
                break;
            case 1:
                txtView.append("Femenino");
                break;
            case 3:
                txtView.append("Binario");
                break;
            default:
                txtView.append("Alien");
                break;
        }

    }



}
