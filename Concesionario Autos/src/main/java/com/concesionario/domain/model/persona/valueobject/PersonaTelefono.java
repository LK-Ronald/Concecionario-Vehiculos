package com.concesionario.domain.model.persona.valueobject;

import com.concesionario.domain.excepcion.InvalidPersonaTelefonoException;

import java.util.Objects;
import java.util.regex.Pattern;

public record PersonaTelefono(String value) {

    private static final int MINIMUM_LENGTH = 8;
    private  static final Pattern TELEFONO_PATTERN = Pattern.compile("\\d+");

    public PersonaTelefono {
        final String normalizedValue = Objects.requireNonNull(value, "PersonaTelefono cannot be null").trim();
        ValidateNotEmpty(normalizedValue);
        ValidateMinimumLength(normalizedValue);
        ValidateFormat(normalizedValue);

        value = normalizedValue;
    }

    private static void ValidateNotEmpty(String normalizedValue) {
        if(normalizedValue.isEmpty()) {
            throw InvalidPersonaTelefonoException.becauseValueIsEmpty();
        }
    }

    private static void ValidateMinimumLength(final String normalizedValue) {
        if(normalizedValue.length() < MINIMUM_LENGTH) {
            throw InvalidPersonaTelefonoException.becauseLengthIsTooShort(MINIMUM_LENGTH);
        }
    }

    private  static void ValidateFormat(final String normalizedValue) {
        if(!TELEFONO_PATTERN.matcher(normalizedValue).matches()) {
            throw InvalidPersonaTelefonoException.becauseFormatIsInvalid(normalizedValue);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
