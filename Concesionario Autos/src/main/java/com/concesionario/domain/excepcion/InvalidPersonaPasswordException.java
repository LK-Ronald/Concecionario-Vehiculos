package com.concesionario.domain.excepcion;

public class InvalidPersonaPasswordException extends DomainExcepcion {

    private static final String MESSAGE_EMPTY = "La contrasena de persona no puede estar vacia";
    private static final String MESSAGE_TOO_SHORT = "La contrasena de persona debe tener almenos %d caracteres";

    private InvalidPersonaPasswordException(final String message) {
        super(message);
    }

    public static InvalidPersonaPasswordException becauseValueIsEmpty() {
        return new InvalidPersonaPasswordException(MESSAGE_EMPTY);
    }

    public static InvalidPersonaPasswordException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidPersonaPasswordException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }

}
