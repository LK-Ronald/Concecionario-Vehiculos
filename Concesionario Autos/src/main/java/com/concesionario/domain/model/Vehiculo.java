package com.concesionario.domain.model;

import com.concesionario.domain.enums.VehiculoEstado;
import lombok.Value;

@Value
public class Vehiculo {

    String matricula;
    String marca;
    String modelo;
    String cilindrada;
    VehiculoEstado estado;
    double precio;


}
