package com.concesionario.domain.model.persona;

import com.concesionario.domain.enums.PersonaRol;
import com.concesionario.domain.model.persona.valueobject.*;
import lombok.Value;

@Value
public class Persona {

    PersonaDni dni;
    PersonaNombre nombre;
    PersonaNombre apellido;
    PersonaTelefono telefono;
    PersonaDireccion direccion;
    PersonaCorreo correo;
    PersonaPassword contrasena;
    PersonaFechaNacimiento fechaNacimiento;
    PersonaRol rol;


}
