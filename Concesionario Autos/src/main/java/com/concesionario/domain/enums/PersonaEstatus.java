package com.concesionario.domain.enums;

import com.concesionario.domain.excepcion.InvalidPersonaEstatusException;
import com.concesionario.domain.excepcion.InvalidPersonaRolException;

public enum PersonaEstatus {

    ACTIVO,
    INACTIVO,
    PENDIENTE,
    BLOQUEADO;

    public static PersonaEstatus fromString(final String value) {

        for (final PersonaEstatus estatus : PersonaEstatus.values()) {
            if (estatus.name().equalsIgnoreCase(value)) {
                return estatus;
            }
        }

        throw InvalidPersonaEstatusException.becauseValueIsInvalid(value);
    }

}
