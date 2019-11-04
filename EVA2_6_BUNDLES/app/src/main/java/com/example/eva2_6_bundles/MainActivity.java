package com.example.eva2_6_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre, edtApellido, edtEdad;
    RadioGroup rgS;
    Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellido);
        edtEdad = findViewById(R.id.edtEdad);
        rgS = findViewById(R.id.rgS);
        inDatos = new Intent(this, Secundaria.class);
    }

    public void miClick(View v){
        //INSERTAR DATOS AL INTENTO
        Bundle bundle = new Bundle();
        bundle.putString("nombre", edtNombre.getText().toString());
        bundle.putString("apellido", edtApellido.getText().toString());
        int iEdad = Integer.parseInt(edtEdad.getText().toString());
        bundle.putInt("edad",iEdad);
        int iSexo;
        if(rgS.getCheckedRadioButtonId() == R.id.rbtnM)
            iSexo = 0;
        else if(rgS.getCheckedRadioButtonId() == R.id.rbtnF)
            iSexo = 1;
        else
            iSexo = 2;
        bundle.putInt("sexo", iSexo);
        inDatos.putExtras(bundle);
        startActivity(inDatos);

    }

}
