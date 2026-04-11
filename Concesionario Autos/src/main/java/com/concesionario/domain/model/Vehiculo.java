package com.concesionario.domain.model;

import com.concesionario.domain.enums.VehiculoEstado;

public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String cilindrada;
    private VehiculoEstado estado;
    private double precio;

    Vehiculo() {}

    Vehiculo(final String matricula, final String marca, final String modelo, final String cilindrada, final VehiculoEstado estado, final double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.estado = estado;
        this.precio = precio;

    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public VehiculoEstado getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }
}
