package com.example.fitbuddyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Invocamos método para vincular elementos
        vincularElementos();
        //invocamos metodo para activar listener
        activarListener();
    }
    private void activarListener() {

        btnSiguiente.setOnClickListener(this);
    }
    private void vincularElementos() {

        btnSiguiente = (Button) findViewById(R.id.btn_siguiente);
    }
    public void onClick(View view) {
        Intent intentoResultado = new Intent(MainActivity.this , pantallaPrincipal.class);
        startActivity(intentoResultado);
    }
}