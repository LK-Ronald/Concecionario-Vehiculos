package com.concesionario.domain.excepcion.direccion;

import com.concesionario.domain.excepcion.DomainExcepcion;

public class InvalidCalleException extends DomainExcepcion {

    private static final String MESSAGE_EMPTY = "La direccion calle no puede ser vacia";
    private static final String MESSAGE_TOO_SHORT = "La dirrecion calle debe de tener %d caracteres ";

    private InvalidCalleException(String message) {
        super(message);
    }

    public static InvalidCalleException becauseValueIsEmpty() {
        return new InvalidCalleException(MESSAGE_EMPTY);
    }

    public static InvalidCalleException becauseLengthIsTooShort(final int miminimumLength) {
        return new InvalidCalleException(String.format(MESSAGE_TOO_SHORT, miminimumLength));
    }


}
