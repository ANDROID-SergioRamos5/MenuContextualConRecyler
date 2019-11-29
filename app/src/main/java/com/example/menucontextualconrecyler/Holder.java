package com.example.menucontextualconrecyler;

import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener{

    TextView texto;
    ImageView imageView;

    public Holder(@NonNull View itemView) {
        super(itemView);
        texto = itemView.findViewById(R.id.texto);
        imageView = itemView.findViewById(R.id.Imagen);
        imageView.setOnCreateContextMenuListener(this);
    }

    public void Bind(String[] item, int posicion)
    {
        texto.setText(item[posicion]);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        MenuInflater menuInflater = new MenuInflater(view.getContext());
        menuInflater.inflate(R.menu.menu, contextMenu);
    }



}
