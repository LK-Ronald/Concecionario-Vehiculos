package com.concesionario.domain.model.persona.valueobject;

import com.concesionario.domain.excepcion.InvalidPersonaCorreoException;

import java.util.Objects;
import java.util.regex.Pattern;

public record PersonaCorreo(String value) {

    private static final Pattern CORREO_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+\\\\-]+@[a-zA-Z0-9.\\\\-]+\\\\.[a-zA-Z]{2,}$");

    public PersonaCorreo {
        final String normalizeValue = Objects.requireNonNull(value, "PersonaCorreo cannot be null");
        validateNotEmpty(normalizeValue);
        validateFormat(normalizeValue);

        value = normalizeValue;
    }

    private static void validateNotEmpty(String value) {
        if (value.isEmpty()) {
            throw InvalidPersonaCorreoException.becauseValueIsEmpty();
        }
    }

    private static void validateFormat(final String value) {
        if (!CORREO_PATTERN.matcher(value).matches()) {
            throw InvalidPersonaCorreoException.becauseFormatIsInvalid(value);
        }
    }

}
