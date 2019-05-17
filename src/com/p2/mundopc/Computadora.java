package com.p2.mundopc;


public class Computadora {

    private static int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private double precio;

    private Computadora() {

    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado,Raton raton, double precio) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.precio = precio;
    }

    public int getIdComputadora() {
        return ++idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computadora "+getIdComputadora()+": " + nombre +"\n\tPrecio Unitario: "+precio+"\n\tMonitor: "+monitor+"\n\tTeclado: "+teclado+"\n\tRatón: "+raton;      
    }

}