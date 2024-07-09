package com.example.listadinamicareciclerview;

/*
Autor: Juan Francisco Sánchez González
Fecha: 19/11/2023
Clase: Modelo de datos con 3 propiedades
*/

public class Datos {
    private String marca;
    private String descripcion;
    private String enlace;

    public Datos(String texto1, String texto2, String texto3) {
        marca = texto1;
        descripcion = texto2;
        enlace = texto3;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEnlace() {
        return enlace;
    }
}
