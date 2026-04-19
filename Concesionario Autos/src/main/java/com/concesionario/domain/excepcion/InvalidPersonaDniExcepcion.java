package com.concesionario.domain.excepcion;

public class InvalidPersonaDniExcepcion extends DomainExcepcion {

    private static final String MENSSAGE_EMPTY = "El Dni de persona no puede estar vacio";
    private static final String MENSSAGE_TOO_SHORT = "El Dni de persona debe tener minimo %d caracteres";
    private static final String MENSSAGE_FORMAT_INVALID = "El Dni de persona el formato no es valido: %s";

    private InvalidPersonaDniExcepcion(String message) {
        super(message);
    }

    public static InvalidPersonaDniExcepcion becauseValueIsEmpty() {
        return new InvalidPersonaDniExcepcion(MENSSAGE_EMPTY);
    }

    public static InvalidPersonaDniExcepcion becauseLengthIsTooShort(final int miminimumLength) {
        return new InvalidPersonaDniExcepcion(String.format(MENSSAGE_TOO_SHORT, miminimumLength));
    }

    public static InvalidPersonaDniExcepcion becauseFormatIsInvalid(final String personaDni) {
        return new InvalidPersonaDniExcepcion(String.format(MENSSAGE_FORMAT_INVALID, personaDni));
    }
}
