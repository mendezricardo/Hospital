package com.cursoandroid.hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SetorAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Setor> lista;

    public SetorAdapter(Context context, ArrayList<Setor> lista) {
        this.context = context;
        this.lista = lista;
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        Setor setor = lista.get(position);
        return setor;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int posiiton, View view, ViewGroup viewGroup) {
        Setor setor = lista.get(posiiton);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.setores, null);

        TextView nome = (TextView) layout.findViewById(R.id.t1);
        nome.setText(setor.getNome());

        return layout;

    }
}