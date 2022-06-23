package me.laplace.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        TextView texto = findViewById(R.id.textoResultado); //Evento

        int x = new Random().nextInt(11); //Variável recebe um novo número randomico entre 0 e 10

        texto.setText("Número: " + x); //texto mostrando o valor da variável

    }
}