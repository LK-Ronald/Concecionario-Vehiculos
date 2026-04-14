package com.concesionario.domain.model;

import com.concesionario.domain.enums.PersonaRol;
import lombok.Value;

import java.time.LocalDate;

@Value
public class Persona {

    String dni;
    String nombre;
    String apellido;
    String telefono;
    String direccion;
    String correo;
    String contrasena;
    LocalDate fechaNacimiento;
    PersonaRol rol;


}
