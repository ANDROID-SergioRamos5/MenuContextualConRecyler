package com.example.menucontextualconrecyler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    String[] texto = new String[]{"Sergio", "Ivan", "Pepe", "Aitor", "Carlossssssssssssssssssssssssssssssssss"};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylcer);
        Adaptador adaptador = new Adaptador(texto);

        recyclerView.setAdapter(adaptador);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        String str = "";

        switch (item.getItemId())
        {
            case R.id.Cancelar:
                str = "Cancelar";
                break;
            case R.id.Editar:
                str = "Editar";
                break;
        }

        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
        return true;
    }
}
