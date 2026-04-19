package com.concesionario.domain.model.persona.valueobject;

import java.util.Objects;
import java.util.regex.Pattern;

import com.concesionario.domain.excepcion.InvalidPersonaDniExcepcion;

public record PersonaDni(String value) {

    private static final int MINIMUM_LENGTH = 8;
    private static final Pattern DNI_PATTERN = Pattern.compile("\\d+");

    public PersonaDni {
        final String normalizedValue = Objects.requireNonNull(value, "PersonaDni cannot be null").trim();
        validateNotEmpty(normalizedValue);
        validateMinimumLength(normalizedValue);
        validateFormat(normalizedValue);

        value = normalizedValue;
    }

    private static void validateNotEmpty(final String normalizedValue) {
        if (normalizedValue.isEmpty()) {
            throw InvalidPersonaDniExcepcion.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String normalizedValue) {
        if (normalizedValue.length() < MINIMUM_LENGTH) {
            throw InvalidPersonaDniExcepcion.becauseLengthIsTooShort(MINIMUM_LENGTH);
        }
    }

    private static void validateFormat(final String normalizedValue) {
        if (!DNI_PATTERN.matcher(normalizedValue).matches()) {
            throw InvalidPersonaDniExcepcion.becauseFormatIsInvalid(normalizedValue);
        }
    }

    @Override
    public String toString() {
        return value;
    }

}
