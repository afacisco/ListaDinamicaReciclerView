package com.example.listadinamicareciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

/*
Autor: Juan Francisco Sánchez González
Fecha: 19/11/2023
Clase: Actividad principal, se instancia el control RecyclerView y el adaptador con los datos a mostrar
en el listado, que se asignan al reciclador.
*/

public class MainActivity extends AppCompatActivity {

    private RecyclerView reciclador;
    private RecyclerView.Adapter adaptador;

    // Tipo de Layout que se va a inflar en el RecyclerView
    private RecyclerView.LayoutManager layManager;

    // Datos a mostrar en el listado
    Datos[] datos = new Datos[] {
            new Datos("NSP", "Descripción NSP", "http://www.marca.com"),
            new Datos("Pukas", "Descripción Pukas", "http://www.marca.com"),
            new Datos("Hurley", "Descripción Hurley", "http://www.marca.com"),
            new Datos("Yanes", "Descripción Yanes", "http://www.marca.com")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reciclador = (RecyclerView) findViewById(R.id.reciclador);
        // Evitar que al cambiar el contenido del adaptador no cambie el tamaño (ancho y alto) del RecyclerView
        reciclador.setHasFixedSize(true);

        // Inflamos el tipo de Layout (Linear) al RecyclerView
        layManager = new LinearLayoutManager(this);
        reciclador.setLayoutManager(layManager);

        // Instanciamos y asignamos el adaptador al RecyclerView
        adaptador = new MyAdapter(datos);
        reciclador.setAdapter(adaptador);
    }
}