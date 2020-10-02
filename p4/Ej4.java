import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, s;
	    Double r;
	    System.out.println("Introduzca el primer número");
	    a = sc.nextInt();
	    System.out.println("Introduzca el segundo número");
        b = sc.nextInt();
	    System.out.println("Introduzca el tercer número");
	    c = sc.nextInt();
	    s = a+b+c;
	    r = (double) s/3;
	    System.out.println("El promedio es " + r);
    }
}