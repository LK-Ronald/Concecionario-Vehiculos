package com.concesionario.domain.model.persona.valueobject;

import com.concesionario.domain.excepcion.InvalidPersonaFechaNacimientoException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public record PersonaFechaNacimiento(LocalDate value) {

    private static final int MAX_AGE = 120;
    private static final LocalDate localDate = LocalDate.now();

    public PersonaFechaNacimiento {
        final LocalDate normalizeValue = Objects.requireNonNull(value, "PersonaFechaNacimiento cannot be null");
        validateNotEmpy(normalizeValue);
        validateNotFutureDate(normalizeValue);
        validateMaxAge(normalizeValue);

        value = normalizeValue;
    }

    private static void validateNotEmpy(final LocalDate value) {
        if (value == null) {
            throw InvalidPersonaFechaNacimientoException.becauseValueIsEmpty();
        }
    }

    private static void validateNotFutureDate(final LocalDate value) {
        if (value.isAfter(LocalDate.now())) {
            throw InvalidPersonaFechaNacimientoException.becauseDateIsFuture();
        }
    }

    private static void validateMaxAge(final LocalDate value) {
        if (value.isBefore(LocalDate.now().minusYears(MAX_AGE))) {
            throw InvalidPersonaFechaNacimientoException.becauseDateIsFuture();
        }
    }

    public int getAge() {
        return Period.between(value, localDate.now()).getYears();
    }

    public boolean validateIsAdult() {
        return getAge() >= 18;
    }

}
