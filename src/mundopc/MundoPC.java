package mundopc;
import com.p2.mundopc.*;
public class MundoPC {
    public static void main(String[] args) {
        Monitor m1 = new Monitor("LG",21);
	Teclado t1 = new Teclado("USB","Genius");
	Raton r1 = new Raton("USB","Genius");
	Computadora c1 = new Computadora("HP", m1, t1, r1,30000.00);
	
        Monitor m2 = new Monitor("Sony",17);
	Teclado t2 = new Teclado("USB","Logitech");
	Raton r2 = new Raton("USB","Logitech");
	Computadora c2 = new Computadora("Lenovo", m2, t2, r2,94999.99);
        
        Monitor m3 = new Monitor("LG",19);
	Teclado t3 = new Teclado("Inalámbrico","Microsoft");
	Raton r3 = new Raton("Inalámbrico","Microsoft");
	Computadora c3 = new Computadora("Ken Brown", m3, t3, r3,85000.00);
        
        Monitor m4 = new Monitor("LG",15);
	Teclado t4 = new Teclado("Inalámbrico","CX");
	Raton r4 = new Raton("Inalámbrico","CX");
	Computadora c4 = new Computadora("EXO", m4, t4, r4,30000.00);
        
        Monitor m5 = new Monitor("LG",21);
	Teclado t5 = new Teclado("USB","Genius");
	Raton r5 = new Raton("USB","Genius");
	Computadora c5 = new Computadora("Samsung", m5, t5, r5,30000.00);
        
	Orden o1 = new Orden();
	o1.agregarComputadora(c1);
        o1.agregarComputadora(c2);
        o1.agregarComputadora(c3);
        o1.agregarComputadora(c4);
        o1.agregarComputadora(c5);
	o1.mostrarOrden();

        
    }
    
}
