package com.concesionario.domain.model;

import com.concesionario.domain.enums.PersonaRol;
import java.util.Date;

public class Persona {

    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String correo;
    private String contrasena;
    private Date fecha_nacimiento;
    private PersonaRol rol;

    public Persona() {}

    public Persona(
            final String DNI, final String nombre, final String apellido, final String telefono, final String direccion,
            final String correo, final String contrasena, final Date fecha_nacimiento, final PersonaRol rol)
    {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fecha_nacimiento = fecha_nacimiento;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getApellido() {
        return apellido;
    }


    public String getTelefono() {
        return telefono;
    }


    public String getDireccion() {
        return direccion;
    }


    public String getCorreo() {
        return correo;
    }

    public PersonaRol getRol() {
        return rol;
    }


    public String getContrasena() {
        return contrasena;
    }


    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

}
