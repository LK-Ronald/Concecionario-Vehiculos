package com.concesionario.domain.model.persona;

import com.concesionario.domain.enums.PersonaEstatus;
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
    PersonaEstatus estatus;

    public static Persona createPersona(final PersonaDni dni,
                                        final PersonaNombre nombre,
                                        final PersonaNombre apellido,
                                        final PersonaTelefono telefono,
                                        final PersonaDireccion direccion,
                                        final PersonaCorreo correo,
                                        final PersonaPassword contrasena,
                                        final PersonaFechaNacimiento fechaNacimiento,
                                        final PersonaRol rol) {
        return new Persona(dni, nombre, apellido, telefono, direccion, correo, contrasena, fechaNacimiento, rol, PersonaEstatus.PENDIENTE);
    }

    public Persona activate() {
        return new Persona(dni, nombre, apellido, telefono, direccion, correo, contrasena, fechaNacimiento, rol, PersonaEstatus.ACTIVO);
    }

    public Persona deactivate() {
        return new Persona(dni, nombre, apellido, telefono, direccion, correo, contrasena, fechaNacimiento, rol, PersonaEstatus.INACTIVO);
    }

}
