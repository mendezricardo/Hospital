package com.cursoandroid.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Setor> setores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setores = new ArrayList<Setor>();

        for(int i=0; i<5; i++){
            Setor setor = new Setor();
            setor.setNome("Setor "+(i+1));
            setores.add(setor);
        }

        ListView listaSetores = (ListView) findViewById(R.id.setores);
        listaSetores.setAdapter(new SetorAdapter(this, setores));

        listaSetores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(getBaseContext(), "Setor: "+(position+1), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, SetorActivity.class);
                intent.putExtra("setor", setores.get(position));
                startActivity(intent);
            }
        });
    }
}
