package com.p2.mundopc;
public class Orden {
    private final int idOrden;
    private final Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        
        if (contadorComputadoras < MAX_COMPUTADORAS) {

            computadoras[contadorComputadoras++] = computadora;

        } 
        else {
            System.out.println("La orden "+ idOrden+ " ha superado el máximo de "
                    + "productos: " + MAX_COMPUTADORAS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorComputadoras; i++) {
            total += computadoras[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("\nOrden #:" + idOrden);
        System.out.println("Total de la orden #" 
          + idOrden+ ":$ " + calcularTotal());
        System.out.println("Productos de la orden #"
                + idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }

}