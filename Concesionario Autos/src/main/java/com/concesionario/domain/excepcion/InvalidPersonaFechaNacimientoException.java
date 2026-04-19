package com.concesionario.domain.excepcion;

import java.time.LocalDate;

public class InvalidPersonaFechaNacimientoException extends DomainExcepcion {

    private static final String MESSAGE_EMPY = "Fecha de nacimiento no puede estar vacia";
    private static final String MESSAGE_DATE_FUTURE = "Fecha de nacimiento no puede ser futura";
    private static final String MESSAGE_UNDERAGE = "Fecha de nacimiento debe de ser mayor de edad";
    private static final String MESSAGE_MAX_AGE = "Fecha de nacimiento no es valida";

    private InvalidPersonaFechaNacimientoException(final String message) {
        super(message);
    }

    public static InvalidPersonaFechaNacimientoException becauseValueIsEmpty() {
        return new InvalidPersonaFechaNacimientoException(MESSAGE_EMPY);
    }

    public static InvalidPersonaFechaNacimientoException becauseDateIsFuture() {
        return new InvalidPersonaFechaNacimientoException(MESSAGE_DATE_FUTURE);
    }

    public static InvalidPersonaFechaNacimientoException becauseIsUnderAge() {
        return new InvalidPersonaFechaNacimientoException(MESSAGE_UNDERAGE);
    }

    public static InvalidPersonaFechaNacimientoException becauseMaxAge() {
        return new InvalidPersonaFechaNacimientoException(MESSAGE_MAX_AGE);
    }

}
