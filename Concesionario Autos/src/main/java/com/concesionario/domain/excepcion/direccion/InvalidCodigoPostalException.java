package com.concesionario.domain.excepcion.direccion;

import com.concesionario.domain.excepcion.DomainExcepcion;

public class InvalidCodigoPostalException extends DomainExcepcion {

    private static final String MESSAGE_EMPTY = "El codigo porstal no puede estar vacio";
    private static final String MESSAGE_TOO_SHORT = "El codigo porstal debe tener al menos %d caracteres";

    private InvalidCodigoPostalException(String message) {
        super(message);
    }

    public static InvalidCodigoPostalException becauseValueIsEmpty() {
        return new InvalidCodigoPostalException(MESSAGE_EMPTY);
    }

    public static InvalidCodigoPostalException becauseLengthIsTooShort(final int minimunLength) {
        return new InvalidCodigoPostalException(String.format(MESSAGE_TOO_SHORT, minimunLength));
    }

}
