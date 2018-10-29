package com.cursoandroid.hospital;

import android.os.Parcel;
import android.os.Parcelable;

public class Leito implements Parcelable{
    private int proxCodigo = 1;
    private int codigo;
    private String nome;
    private String situacao;

    public Leito(){

    }

    protected Leito(Parcel in) {
        proxCodigo = in.readInt();
        codigo = in.readInt();
        nome = in.readString();
        situacao = in.readString();
    }

    public static final Creator<Leito> CREATOR = new Creator<Leito>() {
        @Override
        public Leito createFromParcel(Parcel in) {
            return new Leito(in);
        }

        @Override
        public Leito[] newArray(int size) {
            return new Leito[size];
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
        parcel.writeString(situacao);
    }
}