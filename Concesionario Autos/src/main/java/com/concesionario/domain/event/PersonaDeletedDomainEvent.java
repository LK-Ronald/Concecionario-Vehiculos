package com.concesionario.domain.event;

import com.concesionario.domain.model.Persona;

import java.util.Map;

public class PersonaDeletedDomainEvent extends DomainEvent{

    private static final String EVENT_NAME = "user.deleted";

    private final Persona persona;

    public PersonaDeletedDomainEvent(final Persona persona) {
        super(EVENT_NAME);
        this.persona = persona;
    }

    @Override
    public Map<String, String> payload() {
        return Map.of("id", persona.getDni());
    }
}
