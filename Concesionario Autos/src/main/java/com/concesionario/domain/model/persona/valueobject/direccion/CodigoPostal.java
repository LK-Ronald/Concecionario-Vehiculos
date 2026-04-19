package com.concesionario.domain.model.persona.valueobject.direccion;

import com.concesionario.domain.excepcion.direccion.InvalidCalleException;
import com.concesionario.domain.excepcion.direccion.InvalidCodigoPostalException;

import java.util.Objects;

public record CodigoPostal(String value) {

    private static final int MINIMUM_LENGTH = 3;

    public CodigoPostal {
        final String normalizeValue = Objects.requireNonNull(value, "CodigoPostal cannot be null").trim();
        validateNotEmpty(normalizeValue);
        validateMinimumLength(normalizeValue);

        value = normalizeValue;
    }


    private static void validateNotEmpty(final String value) {
        if (value.isEmpty()) {
            throw InvalidCalleException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String value) {
        if (value.length() < MINIMUM_LENGTH) {
            throw InvalidCodigoPostalException.becauseLengthIsTooShort(MINIMUM_LENGTH);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
