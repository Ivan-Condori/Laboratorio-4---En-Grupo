package com.p2.mundopc;

public class Teclado extends DispositivoEntrada {

    private static int idTeclado;
    private static int contadorTeclados;
    
//    public Teclado(String tipoEntrada, String marca) {    
//        super(tipoEntrada, marca);
//    }

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
//        this.idTeclado = idTeclado;
//        this.contadorTeclados = ++contadorTeclados;
    }

    public static int getIdTeclado() {
        return ++idTeclado;
    }

    public static void setIdTeclado(int idTeclado) {
        Teclado.idTeclado = idTeclado;
    }

    public static int getContadorTeclados() {
        return ++contadorTeclados;
    }

    public static void setContadorTeclados(int contadorTeclados) {
        Teclado.contadorTeclados = contadorTeclados;
    }
    
    @Override
    public String toString() {
        return "{Id: "+getIdTeclado()+ ", Tipo: " + getTipoEntrada() + ", Marca: " + getMarca() + '}';
    }

}