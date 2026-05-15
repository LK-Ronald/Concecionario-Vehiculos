package com.concesionario.domain.event;

import com.concesionario.domain.model.Persona;

import java.util.Map;

public class PersonaCreatedDomainEvent extends DomainEvent {

    private static final String EVENT_NAME = "user.created";

    private final Persona persona;

    public PersonaCreatedDomainEvent(final Persona persona) {
        super(EVENT_NAME);
        this.persona = persona;
    }

    @Override
    public Map<String, String> payload() {
        return Map.of(
                "dni", persona.getDni().value(),
                "nombre", persona.getNombre().value(),
                "apellido", persona.getApellido().value(),
                "telefono", persona.getTelefono().value(),
                "direccion", persona.getDireccion().value(),
                "correo", persona.getCorreo().value(),
                "fechaNacimiento", persona.getFechaNacimiento().value().toString(),
                "rol", persona.getRol().name(),
                "estatus", persona.getEstatus().name()
        );
    }
}
