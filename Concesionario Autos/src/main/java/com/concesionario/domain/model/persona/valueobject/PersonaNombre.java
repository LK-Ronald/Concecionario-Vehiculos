package com.concesionario.domain.model.persona.valueobject;

import com.concesionario.domain.excepcion.direccion.InvalidCiudadException;
import com.concesionario.domain.excepcion.InvalidPersonaNombreException;

import java.util.Objects;

public record PersonaNombre(String value) {

    private static final int MINIMUM_NAME_LENGTH = 3;

    public PersonaNombre {
        final String normalizedValue = Objects.requireNonNull(value, "PersonaNombre cannot be null").trim();
        validateNotEmpty(normalizedValue);
        validateMinimumLength(normalizedValue);
        value = normalizedValue;
    }

    private static void validateNotEmpty(final String normalizedValue) {
        if (normalizedValue.isEmpty()) {
            throw InvalidPersonaNombreException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String normalizedValue) {
        if (normalizedValue.length() < MINIMUM_NAME_LENGTH) {
            throw InvalidCiudadException.becauseLengthIsTooShort(MINIMUM_NAME_LENGTH);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
