package com.cursoandroid.hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LeitoAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Leito> lista;

    public LeitoAdapter(Context context, ArrayList<Leito> lista) {
        this.context = context;
        this.lista = lista;
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        Leito leito = lista.get(position);
        return leito;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Leito leito = lista.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.leitos, null);

        TextView nome = (TextView) layout.findViewById(R.id.t1);
        nome.setText(leito.getNome());

        return layout;

    }
}