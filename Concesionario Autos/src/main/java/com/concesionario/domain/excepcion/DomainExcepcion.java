package com.concesionario.domain.excepcion;

public class DomainExcepcion extends Exception{

    public DomainExcepcion(final String mensaje){
        super(mensaje);
    }

    protected DomainExcepcion(final String message, final Throwable cause) {
        super(message, cause);
    }
}
