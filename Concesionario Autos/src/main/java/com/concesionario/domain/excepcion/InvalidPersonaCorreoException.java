package com.concesionario.domain.excepcion;

public class InvalidPersonaCorreoException extends DomainExcepcion {

    private static final String MESSAGE_EMPTY = "El correo de persona no puede estar vacio";
    private static final String MESSAJE_INVALID_FORMAT = "El correo de persona el formato es invalido: %s";

    private InvalidPersonaCorreoException(String message) {
        super(message);
    }

    public static InvalidPersonaCorreoException becauseValueIsEmpty() {
        return new InvalidPersonaCorreoException(MESSAGE_EMPTY);
    }

    public static InvalidPersonaCorreoException becauseFormatIsInvalid(final String correo) {
        return new InvalidPersonaCorreoException(String.format(MESSAJE_INVALID_FORMAT, correo));
    }

}
