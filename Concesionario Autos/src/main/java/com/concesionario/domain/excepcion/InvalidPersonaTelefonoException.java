package com.concesionario.domain.excepcion;

public class InvalidPersonaTelefonoException extends DomainExcepcion{

    private static final String MESSAGE_EMPTY = "El telefono de persona no puede estar vacio";
    private static final String MESSAGE_TOO_SHORT = "El telefono de persona tiene minimo %d caracteres";
    private static final String MESSAGE_FORMAT_INVALID = "El telefono de persona %s tiene un formato invalido";

    private InvalidPersonaTelefonoException(String message) {
        super(message);
    }

    public static InvalidPersonaTelefonoException becauseValueIsEmpty() {
        return new InvalidPersonaTelefonoException(MESSAGE_EMPTY);
    }

    public static InvalidPersonaTelefonoException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidPersonaTelefonoException(String.format(MESSAGE_TOO_SHORT, minimumLength));
    }

    public static InvalidPersonaTelefonoException becauseFormatIsInvalid(final String telefono) {
        return new InvalidPersonaTelefonoException(String.format(MESSAGE_FORMAT_INVALID, telefono));
    }
}
