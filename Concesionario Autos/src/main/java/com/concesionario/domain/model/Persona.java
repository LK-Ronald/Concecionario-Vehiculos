package com.concesionario.domain.model;

import com.concesionario.domain.enums.PersonaRol;
import lombok.Value;

import java.util.Date;

@Value
public class Persona {

    String dni;
    String nombre;
    String apellido;
    String telefono;
    String direccion;
    String correo;
    String contrasena;
    Date fecha_nacimiento;
    PersonaRol rol;


}
