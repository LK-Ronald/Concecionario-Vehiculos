package com.concesionario.domain.enums;

import com.concesionario.domain.excepcion.InvalidPersonaEstatusException;

public enum PersonaRol {
    CLIENTE,
    ADMIN,
    VENDEDOR,
    MECANICO,
    ADMINISTRADOR,
    DUENO_NEGOCIO,
    JEFE_ALMACEN;

    public static PersonaEstatus fromString(final String value) {

        for (final PersonaEstatus estatus : PersonaEstatus.values()) {
            if (estatus.name().equalsIgnoreCase(value)) {
                return estatus;
            }
        }

        throw InvalidPersonaEstatusException.becauseValueIsInvalid(value);
    }

}
