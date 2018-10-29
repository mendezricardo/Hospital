package com.cursoandroid.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LeitosList extends AppCompatActivity {

    ArrayList<Leito> leitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leitos_list);

        leitos = new ArrayList<Leito>();

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        String nome = params.getString("nome");

        TextView nomeSetor = (TextView) findViewById(R.id.textoNomeSetor);
        nomeSetor.setText(nome);

        for(int i=0; i<5; i++){
            Leito leito = new Leito();
            leito.setNome("Leito "+(i+1));
            leito.setSituacao("Situacao "+(i+1));
            leitos.add(leito);
        }

        ListView listaLeitos = (ListView) findViewById(R.id.listaLeitos);
        listaLeitos.setAdapter(new LeitoAdapter(this, leitos));

        listaLeitos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(LeitosList.this, "Leito selecionado: "+(position+1), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LeitosList.this, LeitoDetalhe.class);
                intent.putExtra("leito", leitos.get(position));
                startActivity(intent);
            }
        });
    }
}
