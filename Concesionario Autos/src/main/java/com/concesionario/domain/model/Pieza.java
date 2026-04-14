package com.concesionario.domain.model;

import com.concesionario.domain.enums.PiezaTipo;
import lombok.Value;

@Value
public class Pieza {

    String id_pieza;
    String nombre;
    String descripcion;
    String marca;
    String modelo;
    PiezaTipo tipo;
    int stock;

}
