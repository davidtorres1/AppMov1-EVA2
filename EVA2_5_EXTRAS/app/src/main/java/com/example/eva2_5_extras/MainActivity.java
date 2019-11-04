package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtText;
    Intent inLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtText = findViewById(R.id.edtText);
        inLanzar = new Intent(this, Secundaria.class);
    }

    public void miClick(View v){
        String sMensa = edtText.getText().toString();
        inLanzar.putExtra("datos", sMensa);
        startActivity(inLanzar);
    }
}
