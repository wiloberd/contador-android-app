package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {
    private Integer contador;
    private TextView textContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        setContentView(R.layout.activity_sobre);
        this.contador = i.getIntExtra("contador", 0);
        textContador = findViewById(R.id.textContadorSobre);
        textContador.setText(String.valueOf(this.contador));
    }
}