package com.cursoandroid.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SetorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setor);

        Intent intent = getIntent();

        Setor setor = intent.getParcelableExtra("setor");

        String nomeSetor = setor.getNome();

        TextView nome = (TextView) findViewById(R.id.textoSetor);
        nome.setText(nomeSetor);
    }

    public void listar(View view){
        TextView nome = (TextView) findViewById(R.id.textoSetor);
        Bundle params = new Bundle();
        params.putString("nome", nome.getText().toString());
        Intent intent = new Intent(SetorActivity.this, LeitosList.class);
        intent.putExtras(params);
        startActivity(intent);
    }
}
