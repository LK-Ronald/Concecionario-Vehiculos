package com.concesionario.domain.excepcion;

public class InvalidPersonaNombreException extends DomainExcepcion {

    private static final String MESSAGE_EMPTY = "El nombre de persona no puede estar vacio";
    private static final String MESSAGE_TOO_SHORT = "El nombre de persona debe de tener almenos %d caracteres";

    private InvalidPersonaNombreException(final String message) {
        super(message);
    }

    public static InvalidPersonaNombreException becauseValueIsEmpty() {
        return new InvalidPersonaNombreException(MESSAGE_EMPTY);
    }

    public  static InvalidPersonaNombreException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidPersonaNombreException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }
}
