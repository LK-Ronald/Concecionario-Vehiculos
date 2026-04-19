package com.concesionario.domain.model.persona.valueobject.direccion;

import com.concesionario.domain.excepcion.direccion.InvalidCalleException;

import java.util.Objects;

public record Calle(String value) {

    private static int MINIMUM_NAME_LENGTH = 3;

    public Calle {
        final String normalizeValue = Objects.requireNonNull(value, "Calle cannot be null").trim();
        validateNotEmpty(normalizeValue);
        validateMinimumLength(normalizeValue);

        value = normalizeValue;
    }

    private static void validateNotEmpty(String value) {
        if (Objects.isNull(value)) {
            throw InvalidCalleException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String normalizedValue) {
        if (normalizedValue.length() < MINIMUM_NAME_LENGTH) {
            throw InvalidCalleException.becauseLengthIsTooShort(MINIMUM_NAME_LENGTH);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
