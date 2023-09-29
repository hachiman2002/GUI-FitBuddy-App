package com.example.fitbuddyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class formulario_ejercicios extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnVolverAtras, btnAgregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_ejercicios);

        //Invocamos método para vincular elementos
        vincularElementos();
        //invocamos metodo para activar listener
        activarListener();
    }

    private void activarListener() {
        btnVolverAtras.setOnClickListener(this);
        btnAgregar.setOnClickListener(this);
    }
    private void vincularElementos() {
        btnVolverAtras = (ImageButton) findViewById(R.id.volver_atras);
        btnAgregar = (ImageButton) findViewById(R.id.btn_agregar);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.volver_atras){
            Intent intentoResultado = new Intent(formulario_ejercicios.this , pantallaPrincipal.class);
            startActivity(intentoResultado);
        } else if (view.getId() == R.id.btn_agregar) {
            Intent intentoResultado = new Intent(formulario_ejercicios.this, formulario_ejercicios_opciones.class);
            startActivity(intentoResultado);
        }
    }
}