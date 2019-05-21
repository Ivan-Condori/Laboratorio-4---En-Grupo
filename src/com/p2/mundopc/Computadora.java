package com.p2.mundopc;

public class Computadora {

    private int idComputadora;
    private static int contadorComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private Parlante parlante;
    private double precio;

    private Computadora() {
        this.idComputadora = ++contadorComputadora;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton, Parlante parlante, double precio) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.parlante = parlante;
        this.precio = precio;
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

    public Parlante getParlante() {
        return parlante;
    }

    public void setParlante(Parlante parlante) {
        this.parlante = parlante;
    }

    @Override
    public String toString() {
        return "Computadora "+idComputadora+": " + nombre +"\n\tPrecio Unitario: "+precio+"\n\t"+monitor+"\n\t"+teclado+"\n\t"+raton+"\n\t"+parlante;      
    }

}