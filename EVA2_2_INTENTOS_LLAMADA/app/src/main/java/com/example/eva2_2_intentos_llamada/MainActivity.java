package com.example.eva2_2_intentos_llamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent marcar;
    EditText edtTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTel = findViewById(R.id.edtTel);

    }
    public void miClick(View v){
        View btnCall = findViewById(R.id.btnCall);
        String sTel = "tel:" + edtTel.getText().toString();
        if(v == btnCall) {
            marcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
        }else{
            marcar = new Intent(Intent.ACTION_DIAL, Uri.parse(sTel));
        }
        startActivity(marcar);
    }
}
