package com.concesionario.domain.model.persona.valueobject;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.concesionario.domain.excepcion.InvalidPersonaPasswordException;

import java.util.Objects;

public class PersonaPassword {

    private static final int MINIMUMLENGTH = 8;
    private static final int BCRYPT_COST = 12;

    private String value;

    private PersonaPassword(final String value) {
        this.value = value;
    }


    /**
     * Crea un UserPassword desde texto plano: valida y aplica hash BCrypt. Usar cuando el usuario
     * crea o cambia su contraseña.
     */
    public static PersonaPassword fromPlainText(final String plainText) {
        final String normalizeValue = Objects.requireNonNull(plainText, "PersonaPassword cannot be null").trim();
        validateNotEmpty(normalizeValue);
        validateMinimumLength(normalizeValue);
        final String hash = BCrypt.withDefaults().hashToString(BCRYPT_COST, normalizeValue.toCharArray());
        return new PersonaPassword(hash);
    }

    /**
     * Crea un UserPassword desde un hash ya almacenado en base de datos. No re-valida ni re-hashea.
     */
    public static PersonaPassword fromHash(final String hash) {
        Objects.requireNonNull(hash, "PersonaPassword cannot be null");
        return new PersonaPassword(hash);
    }

    /**
     * Verifica un texto plano contra el hash BCrypt almacenado.
     */
    public boolean verifyPlain(final String plainText) {
        final String normalizeValue = Objects.requireNonNull(plainText, "Plain Password cannot be null");
        validateNotEmpty(normalizeValue);

        final BCrypt.Result result = BCrypt.verifyer().verify(plainText.toCharArray(), this.value);

        return result.verified;
    }


    public String value() {
        return this.value;
    }

    private static void validateNotEmpty(final String value) {
        if (value.isEmpty()) {
            throw InvalidPersonaPasswordException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String value) {
        if (value.length() < MINIMUMLENGTH) {
            throw InvalidPersonaPasswordException.becauseLengthIsTooShort(MINIMUMLENGTH);
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonaPassword personaPassword)) return false;
        return Objects.equals(value, personaPassword.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
