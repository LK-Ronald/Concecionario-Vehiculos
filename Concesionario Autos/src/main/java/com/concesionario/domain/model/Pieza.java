package com.concesionario.domain.model;

import com.concesionario.domain.enums.PiezaTipo;

public class Pieza {

    private String id_pieza;
    private String nombre;
    private String descripcion;
    private String marca;
    private String modelo;
    private PiezaTipo tipo;
    private int stock;

    public Pieza() {
    }

    public Pieza(final String id_pieza, final String nombre, final String descripcion, final String marca, final int stock,final String modelo, final PiezaTipo tipo) {
        this.id_pieza = id_pieza;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.stock = stock;
        this.tipo = tipo;
    }

    public String getId_pieza() {
        return id_pieza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public PiezaTipo getTipo() {
        return tipo;
    }

    public int getStock() {
        return stock;
    }
}
