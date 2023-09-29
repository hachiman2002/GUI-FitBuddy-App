package com.example.fitbuddyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pantalla_cronometro extends AppCompatActivity implements View.OnClickListener{
    ImageButton btnVolverAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_cronometro);

        //Invocamos método para vincular elementos
        vincularElementos();
        //invocamos metodo para activar listener
        activarListener();
    }

    private void activarListener() {
        btnVolverAtras.setOnClickListener(this);
    }
    private void vincularElementos() {
        btnVolverAtras = (ImageButton) findViewById(R.id.volver_atras);

    }
    public void onClick(View view) {
        Intent intentoResultado = new Intent(pantalla_cronometro.this , pantallaPrincipal.class);
        startActivity(intentoResultado);
    }
}