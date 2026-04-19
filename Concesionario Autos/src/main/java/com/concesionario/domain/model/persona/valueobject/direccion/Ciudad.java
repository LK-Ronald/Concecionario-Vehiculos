package com.concesionario.domain.model.persona.valueobject.direccion;

import com.concesionario.domain.excepcion.direccion.InvalidCiudadException;
import com.concesionario.domain.excepcion.InvalidPersonaNombreException;

import java.util.Objects;

public record Ciudad(String value) {

    private static int MINIMUM_NAME_LENGTH = 3;

    public Ciudad{
        final String normalizaValue = Objects.requireNonNull(value, "Ciudad cannot be null").trim();
        validateNotEmpty(normalizaValue);
        validateMinimumLength(normalizaValue);

        value = normalizaValue;
    }

    private static void validateNotEmpty(String value) {
        if (Objects.isNull(value)) {
            throw InvalidCiudadException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String normalizedValue) {
        if (normalizedValue.length() < MINIMUM_NAME_LENGTH) {
            throw InvalidPersonaNombreException.becauseLengthIsTooShort(MINIMUM_NAME_LENGTH);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
