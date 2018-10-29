package com.cursoandroid.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LeitoDetalhe extends AppCompatActivity {

    private TextView nomeLeito;
    private TextView situacaoLeito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leito_detalhe);

        nomeLeito = (TextView) findViewById(R.id.nomeLeito);
        situacaoLeito = (TextView) findViewById(R.id.situacaoLeito);

        Intent intent = getIntent();
        Leito leito = intent.getParcelableExtra("leito");

        String nome = leito.getNome();
        String situacao = leito.getSituacao();

        TextView nomeLeito = (TextView) findViewById(R.id.nomeLeito);
        nomeLeito.setText(nome);
        TextView situacaoLeito = (TextView) findViewById(R.id.situacaoLeito);
        situacaoLeito.setText(situacao);

    }
}
