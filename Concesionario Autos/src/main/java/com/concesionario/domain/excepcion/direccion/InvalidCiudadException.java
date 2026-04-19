package com.concesionario.domain.excepcion.direccion;

import com.concesionario.domain.excepcion.DomainExcepcion;

public class InvalidCiudadException extends DomainExcepcion {

    private static final String MESSAGE_EMPTY = "La ciudad de persona no puede estar vacia";
    private static final String MESSAGE_TOO_SHORT = "La ciudad de persona debe de tener al menos %d caracteres";

    private InvalidCiudadException(String message) {
        super(message);
    }

    public static InvalidCiudadException becauseValueIsEmpty() {
        return new InvalidCiudadException(MESSAGE_EMPTY);
    }

    public static InvalidCiudadException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidCiudadException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }

}
