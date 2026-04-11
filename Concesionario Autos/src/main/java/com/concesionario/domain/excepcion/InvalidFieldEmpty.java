package com.concesionario.domain.excepcion;

public class InvalidFieldEmpty extends DomainExcepcion {

    private static final String MENSAJE_CAMPO_EMPTY = "El Campo esta vacio";

    public InvalidFieldEmpty(final String mensaje) {
        super(mensaje);
    }

    @Override
    public String getMessage() {
        return MENSAJE_CAMPO_EMPTY;
    }
}
