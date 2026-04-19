package com.concesionario.domain.event;

import com.concesionario.domain.model.persona.Persona;

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
                "dni", persona.getDni(),
                "nombre", persona.getNombre(),
                "apellido", persona.getApellido(),
                "telefono", persona.getTelefono(),
                "direccion", persona.getDireccion(),
                "correo", persona.getCorreo(),
                "contrasena", persona.getContrasena(),
                "fechaNacimiento", persona.getFechaNacimiento().toString(),
                "rol", persona.getRol().name() );
    }
}
