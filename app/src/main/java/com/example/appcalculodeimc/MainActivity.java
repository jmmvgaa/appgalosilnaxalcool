package com.example.appcalculodeimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txttitulo;
    EditText gasolina;
    EditText alcool;
    TextView txtgasolina;
    TextView txtalcool;
    Button botao;
    TextView txtcalculo;
    TextView um;
    TextView dois;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            loadComponents();
            botaoconfig();




    }
    protected void loadComponents(){

        txttitulo = findViewById(R.id.txttitulo);
        gasolina = findViewById(R.id.gasolina);
        alcool = findViewById(R.id.alcool);
        txtgasolina = findViewById(R.id.txtgasolina);
        txtalcool = findViewById(R.id.txtalcool);
        botao = findViewById(R.id.botao);
        txtcalculo = findViewById(R.id.txtcalculo);

        dois = findViewById(R.id.dois);

    }
    protected void calculoimc(){
        double massa1 = Double.parseDouble(gasolina.getText().toString());
        double altura1 = Double.parseDouble(alcool.getText().toString());

        double txtcalculo = massa1 * 0.7;
        if (altura1 <= txtcalculo) dois.setText("Alcool é melhor");
        else dois.setText("Gasolina é melhor");

        Log.d("resultado", String.valueOf(txtcalculo));

    }

    protected void botaoconfig(){
        botao.setOnClickListener(view -> {
            calculoimc();
        });
    }
}