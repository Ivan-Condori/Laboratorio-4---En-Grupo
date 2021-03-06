package mundopc;
import com.p2.mundopc.*;
public class MundoPC {
    public static void main(String[] args) {
	Teclado t1 = new Teclado("Entrada","Genius","USB");
	Teclado t2 = new Teclado("Entrada","Logitech","Inalámbrico");
	Teclado t3 = new Teclado("Entrada","Microsoft","PS/2");
	Teclado t4 = new Teclado("Entrada","CX","USB");
	Teclado t5 = new Teclado("Entrada","Genius","Inalánbrico");
        
        Monitor m1 = new Monitor("LG",21);
        Monitor m2 = new Monitor("Sony",17);
        Monitor m3 = new Monitor("LG",19);
        Monitor m4 = new Monitor("LG",15);
        Monitor m5 = new Monitor("LG",21);
        
	Raton r1 = new Raton("Entrada","Genius","USB");
	Raton r2 = new Raton("Entrada","Logitech","Inalámbrico");
	Raton r3 = new Raton("Entrada","Microsoft","PS/2");
	Raton r4 = new Raton("Entrada","CX","USB");
	Raton r5 = new Raton("Entrada","Genius","Inalámbrico");
        
        Parlante p1 = new Parlante("Salida","Genius","Auxiliar");
        Parlante p2 = new Parlante("Salida","Logitech","Inalámbrico");
        Parlante p3 = new Parlante("Salida","Microsoft","Auxiliar");
        Parlante p4 = new Parlante("Salida","CX","Inalámbrico");
        Parlante p5 = new Parlante("Salida","Genius","Inalámbrico");
        
	Computadora c1 = new Computadora("HP", m1, t2, r3, p1,30000.00);
	Computadora c2 = new Computadora("Lenovo", m2, t3, r1, p2,95000.00);
	Computadora c3 = new Computadora("Ken Brown", m3, t1, r2, p3,85000.00);
	Computadora c4 = new Computadora("EXO", m4, t4, r4, p4,30000.00);
	Computadora c5 = new Computadora("Samsung", m5, t5, r5, p5,30000.00);
        Computadora c6 = new Computadora ("Lenovo", m2, t3, r1, p2,40000.00);
        
        
	Orden o1 = new Orden();//Creo la orden 1
	o1.agregarComputadora(c1);//Agrego computadora 1 a la orden 1
        o1.agregarComputadora(c2);
        o1.agregarComputadora(c3);
        o1.agregarComputadora(c4);
        o1.agregarComputadora(c5);
       	o1.mostrarOrden(); //Utilizo el método mostrarOrden para imprimir por consola
        
	Orden o2 = new Orden();
	o2.agregarComputadora(c3);
        o2.agregarComputadora(c5);
        o2.agregarComputadora(c4);
	o2.mostrarOrden();
        
	Orden o3 = new Orden();
        o3.agregarComputadora(c3);
        o3.agregarComputadora(c4);
        o3.agregarComputadora(c5);
        o3.agregarComputadora(c6);
	o3.mostrarOrden();
       
    }
    
}
