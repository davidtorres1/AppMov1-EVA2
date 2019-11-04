package com.example.eva2_3_mensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent mensaje;
    EditText edtTel, edtMen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTel = findViewById(R.id.edtTel);
        edtTel = findViewById(R.id.edtMen);
    }
    public void miClick(View v){
        String num = "smsto:" + edtTel.getText().toString();
        mensaje = new Intent(Intent.ACTION_SENDTO, Uri.parse(num));
        mensaje.putExtra("sms_body", edtMen.getText().toString());
        startActivity(mensaje);
    }
}
