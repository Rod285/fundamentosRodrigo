import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
	    double a,b,c,at,costo;
	    char car;
	    car = 'A';
	    a = solicitaDato(car);
	    car = 'B';
	    b = solicitaDato(car);
	    car = 'C';
	    c = solicitaDato(car);
	    at = areaTotal(a,b,c);
	    System.out.println("Area Total = " + at);
	    costo = precio(at);
	    System.out.println("El costo del terreno es: $" + costo);
    }
    
    public static double solicitaDato(char ltr){
        Scanner sc = new Scanner(System.in);
	    double r = 0.0;
        System.out.println("Introduzca lado " + ltr);
        r = sc.nextDouble();
        return r;
    }
    
    public static double precio(double area){
        Scanner sc = new Scanner(System.in);
        Double r, c;
	    System.out.println("Introduzca Precio por metro cuadrado");
	    c = sc.nextDouble();
        r = area * c;
        return r;
    }

    public static double areaTotal(double l1, double l2, double l3){
        Double r,atr,ac;
	    atr = ((l1-l3)*l2)/2;
	    ac = l2*l3;
        r = atr+ac;
        return r;
    }
}