package com.concesionario.domain.excepcion;

public class InvalidPersonaEstatusException extends DomainExcepcion {

    private static final String MESSAJE_INVALID = "El estado del usuario %s es invalido";

    private InvalidPersonaEstatusException(final String message) {
        super(message);
    }

    public static InvalidPersonaEstatusException becauseValueIsInvalid(final String value) {
        throw new InvalidPersonaEstatusException(String.format(MESSAJE_INVALID, value));
    }
}
