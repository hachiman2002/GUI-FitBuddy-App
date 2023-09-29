package com.example.fitbuddyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pantallaPrincipal extends AppCompatActivity implements View.OnClickListener{
    ImageButton btnVolverAtras, btnComenzar;
    Button btnCrearRutina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        //Invocamos método para vincular elementos
        vincularElementos();
        //invocamos metodo para activar listener
        activarListener();
    }
    private void activarListener() {
        btnVolverAtras.setOnClickListener(this);
        btnComenzar.setOnClickListener(this);
        btnCrearRutina.setOnClickListener(this);
    }
    private void vincularElementos() {
        btnVolverAtras = (ImageButton) findViewById(R.id.volver_atras);
        btnComenzar = (ImageButton) findViewById(R.id.btn_comenzar);
        btnCrearRutina = (Button) findViewById(R.id.btn_crear_rutina);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.volver_atras){
            Intent intentoResultado = new Intent(pantallaPrincipal.this , MainActivity.class);
            startActivity(intentoResultado);
        } else if (view.getId() == R.id.btn_comenzar) {
            Intent intentoResultado = new Intent(pantallaPrincipal.this, pantalla_cronometro.class);
            startActivity(intentoResultado);
        } else if (view.getId() == R.id.btn_crear_rutina) {
            Intent intentoResultado = new Intent(pantallaPrincipal.this, formulario_ejercicios.class);
            startActivity(intentoResultado);
        }
    }
}