package com.p2.mundopc;

public class Raton extends Dispositivos {

    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoDispositivo, String marca, String tipoEntrada) {
        super(tipoDispositivo, marca, tipoEntrada);
        this.idRaton = ++contadorRatones;
    }
    
    @Override
    public String toString() {
        return "Ratón " +idRaton + super.toString();
    }

}