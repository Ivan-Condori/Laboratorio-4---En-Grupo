package com.p2.mundopc;

public class Parlante extends Dispositivos {
    
    private int idParlante;
    private static int contadorParlantes;
    
    public Parlante(String tipoDispositivo, String marca, String tipoEntrada) {
        super(tipoDispositivo, marca, tipoEntrada); 
        this.idParlante = ++contadorParlantes;   
    }
    
    @Override
    public String toString() {
        return "Parlante: " + idParlante + super.toString();
    }
    
}
