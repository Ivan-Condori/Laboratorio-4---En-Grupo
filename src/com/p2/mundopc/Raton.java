package com.p2.mundopc;

public class Raton extends DispositivoEntrada {

    private static int idRaton;
    private static int contadorRatones;
    
//    public Raton(String tipoEntrada, String marca) {
//        super(tipoEntrada, marca);
//    }

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
//        this.idRaton = ++idRaton;
//        this.contadorRatones = ++contadorRatones;
    }

    public static int getIdRaton() {
        return ++idRaton;
    }

    public static void setIdRaton(int idRaton) {
        Raton.idRaton = idRaton;
    }

    public static int getContadorRatones() {
        return ++contadorRatones;
    }

    public static void setContadorRatones(int contadorRatones) {
        Raton.contadorRatones = contadorRatones;
    }
    

    @Override
    public String toString() {
        return "{Id: " +getIdRaton() + ", Tipo: " + getTipoEntrada() + ", Marca: " + getMarca() + '}';
    }

}