package com.cursoandroid.hospital;

import android.os.Parcel;
import android.os.Parcelable;

public class Setor implements Parcelable{
    private int proxCodigo = 1;
    private int codigo;
    private String nome;

    public Setor(){

    }

    protected Setor(Parcel in) {
        proxCodigo = in.readInt();
        codigo = in.readInt();
        nome = in.readString();
    }

    public static final Creator<Setor> CREATOR = new Creator<Setor>() {
        @Override
        public Setor createFromParcel(Parcel in) {
            return new Setor(in);
        }

        @Override
        public Setor[] newArray(int size) {
            return new Setor[size];
        }
    };

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProxCodigo() {
        return proxCodigo++;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(proxCodigo);
        parcel.writeInt(codigo);
        parcel.writeString(nome);
    }
}