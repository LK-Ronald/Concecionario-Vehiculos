package com.concesionario.domain.excepcion;

public class InvalidPersonaRolException extends DomainExcepcion {

    private static final String MESSAJE_INVALID = "El rol de usuario %s no es valido";

    private InvalidPersonaRolException(final String message) {
        super(message);
    }

    public static InvalidPersonaRolException becauseValueIsInvalid(final String value) {
        throw new InvalidPersonaRolException(String.format(MESSAJE_INVALID, value));
    }

}
