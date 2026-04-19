package com.concesionario.domain.model.persona.valueobject;

import com.concesionario.domain.model.persona.valueobject.direccion.Calle;
import com.concesionario.domain.model.persona.valueobject.direccion.Ciudad;
import com.concesionario.domain.model.persona.valueobject.direccion.CodigoPostal;

import java.util.Objects;

public record PersonaDireccion(Calle calle, Ciudad ciudad, CodigoPostal codigoPostal) {

    public PersonaDireccion {
        final Calle normalizeCalle = Objects.requireNonNull(calle, "Calle cannot be null");
        final Ciudad normalizeCiudad = Objects.requireNonNull(ciudad, "Ciudad cannot be null");
        final CodigoPostal normalizaCodigoPostal = Objects.requireNonNull(codigoPostal, "CodigoPostal cannot be null");

        calle = normalizeCalle;
        ciudad = normalizeCiudad;
        codigoPostal = normalizaCodigoPostal;
    }

    public String value() {
        return String.format("%s %s %s", calle, ciudad, codigoPostal);
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + codigoPostal;
    }

}
