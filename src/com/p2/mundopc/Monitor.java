package com.p2.mundopc;

public class Monitor {
    private String marca;
    private double tamanio;
    private int idMonitor;
    private static int contadorMonitor;
    
    public Monitor (String marca, double tamanio){
        this.marca=marca;
        this.tamanio=tamanio;
        this.idMonitor = ++contadorMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor "+idMonitor+", " + marca + ", " +tamanio +" pulgadas";
    }
    
    
    
}