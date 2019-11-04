package com.example.eva2_dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEstandar(View v){
        new AlertDialog.Builder(this)
                .setTitle("Hola")
                .setMessage("Esto es un mensaje")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"NO",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Nvm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Nvm",Toast.LENGTH_SHORT).show();
                    }
                }).create().show();

    }
    public void clickPropio(View v){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialogo);
        final EditText etName;
        Button btn;

        etName = dialog.findViewById(R.id.edtName);
        btn = dialog.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena = etName.getText().toString();
                Toast.makeText(getApplicationContext(),cadena,Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}
