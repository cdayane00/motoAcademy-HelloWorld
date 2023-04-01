package com.carla.helloword;

import static com.carla.helloword.R.id.naoClique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = (Button) findViewById(naoClique);
        TextView texto1 = (TextView) findViewById(R.id.helloWorld);
        TextView texto2 = (TextView) findViewById(R.id.meuApp);

        texto2.setText("Meu primeiro aplicativo");

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto1.setText("Seu botão foi ativado");
                Toast.makeText(MainActivity.this, "Clicado", Toast.LENGTH_SHORT ).show();
            }
        });
    }

}