package com.concesionario.domain.enums;

import com.concesionario.domain.excepcion.InvalidPersonaRolException;

public enum PersonaRol {
    CLIENTE,
    ADMIN,
    VENDEDOR,
    MECANICO,
    ADMINISTRADOR,
    DUENO_NEGOCIO,
    JEFE_ALMACEN;

    public static PersonaRol fromString(final String value) {

        for (final PersonaRol rol : PersonaRol.values()) {
            if (rol.name().equalsIgnoreCase(value)) {
                return rol;
            }
        }

        throw InvalidPersonaRolException.becauseValueIsInvalid(value);
    }

}
