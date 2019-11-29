package com.example.menucontextualconrecyler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter {


    String[] texto;

    public Adaptador(String[] texto) {

        this.texto=texto;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        Holder holder=new Holder(view);

        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((Holder)holder).Bind(texto, position);
    }

    @Override
    public int getItemCount() {
        return texto.length;
    }
}
