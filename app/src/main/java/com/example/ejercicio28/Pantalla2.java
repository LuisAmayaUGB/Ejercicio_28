package com.example.ejercicio28;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    TextView dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

dos=findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("nombre");
        String segundonombre = bundle.getString("SegundoNombre");

        dos.setText(nombre+" "+segundonombre);




    }
}