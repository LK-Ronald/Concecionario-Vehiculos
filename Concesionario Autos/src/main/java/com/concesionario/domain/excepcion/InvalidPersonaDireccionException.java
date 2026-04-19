package com.concesionario.domain.excepcion;


public class InvalidPersonaDireccionException extends DomainExcepcion {

    private static final String MESSAGE_EMPTY = "La direccion de persona no puede estar vacia";

    private InvalidPersonaDireccionException(String message) {
        super(message);
    }

    public static InvalidPersonaDireccionException becauseValueIsEmpty() {
        return new InvalidPersonaDireccionException(MESSAGE_EMPTY);
    }

}
