package com.p2.mundopc;

public class Teclado extends Dispositivos {

    private int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoDispositivo, String marca, String tipoEntrada) {
        super(tipoDispositivo, marca, tipoEntrada);
        this.idTeclado = ++contadorTeclados;
    }
    
    @Override
    public String toString() {
        return "Teclado "+idTeclado + super.toString();
    }

}