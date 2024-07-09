package com.example.listadinamicareciclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

/*
Autor: Juan Francisco Sánchez González
Fecha: 19/11/2023
Clase: Adaptador personalizado, será el encargado de cargar cada elemento del array de datos en las
CardView que se verán en el listado (RecyclerView).
*/

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    // Array del modelo de datos
    private Datos[] items;

    // Constructor al que le pasamos un array del modelo de datos
    public MyAdapter(Datos[] items) {
        this.items = items;
    }

    // Instancia cada elemento que compone la vista (CardView) de cada item del RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView marca;
        private final TextView descripcion;
        private final TextView enlace;

        public ViewHolder(View vista) {
            super (vista);

            marca = (TextView) vista.findViewById(R.id.textView1);
            descripcion = (TextView) vista.findViewById(R.id.textView2);
            enlace = (TextView) vista.findViewById(R.id.textView3);
        }

        public TextView getMarca() {
            return marca;
        }

        public TextView getDescripcion() {
            return descripcion;
        }
        public TextView getEnlace() {
            return enlace;
        }

    }

    // Devuelve el número de elementos del array de datos
    @Override
    public int getItemCount () {
        return items.length;
    }

    // Infla la vista en el layout de la tarjeta o CardView
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carta, viewGroup, false);
        return new ViewHolder(v);
    }

    // Get element from your dataset at this position and replace the
    // contents of the view with that element
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        viewHolder.getMarca().setText(items[i].getMarca());
        viewHolder.getDescripcion().setText(items[i].getDescripcion());
        viewHolder.getEnlace().setText(items[i].getEnlace());

        // Listener OnClick
        viewHolder.marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "hola", Toast.LENGTH_LONG).show();
            }
        });
    }
}
