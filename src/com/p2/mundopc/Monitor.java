package com.p2.mundopc;

public class Monitor {
    private static int idMonitor;
    private String marca;
    private double tamanio;
    private int contadorMonitor;
    
    private Monitor (){
        
        
    }
    public Monitor (String marca, double tamanio){
        this.marca=marca;
        this.tamanio=tamanio;
    }

    public int getIdMonitor() {
        return ++idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
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

    public int getContadorMonitor() {
        return contadorMonitor;
    }

    public void setContadorMonitor(int contadorMonitor) {
        this.contadorMonitor = contadorMonitor;
    }

    @Override
    public String toString() {
        return "{" + "id: "+getIdMonitor()+", marca: " + marca + ", Pulgadas: " +tamanio +'}';
    }
    
    
    
}