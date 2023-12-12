package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer contador = 0;

    private TextView textContador;

    private TextView textSobreClicavel;
    private Button btnMais;
    private Button btnMenos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textContador = findViewById(R.id.textContador);
        btnMais = findViewById(R.id.btnMais);
        btnMenos = findViewById(R.id.btnMenos);
        textSobreClicavel = findViewById(R.id.textSobreClicavel);
        textContador.setText(String.valueOf(this.getContador()));
    }

    public Integer getContador(){
        return this.contador;
    }

    public void setBtnMais(View view){
        this.contador = this.contador + 2;
        textContador.setText(String.valueOf(this.getContador()));
    }

    public void setBtnMenos(View view){
        this.contador = this.contador - 2;
        textContador.setText(String.valueOf(this.getContador()));
    }

    public void abreSobre(View view){
        Intent i = new Intent(MainActivity.this, SobreActivity.class);
        i.putExtra("contador", this.contador);
        startActivity(i);
    }
}

