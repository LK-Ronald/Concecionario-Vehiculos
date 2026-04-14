package com.concesionario.domain.event;

import com.concesionario.domain.model.Persona;

import java.util.Map;

public class PersonaUpdateDomainEvent extends DomainEvent {

    private static final String EVENT_NAME = "user.update";

    private final Persona persona;

    public PersonaUpdateDomainEvent(final Persona persona) {
        super(EVENT_NAME);
        this.persona = persona;
    }

    @Override
    public Map<String, String> payload() {
        return Map.of("dni", persona.getDni());
    }
}
