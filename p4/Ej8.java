import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma;
	    suma = 0;
	    System.out.println("Introduzca número");
	    n = sc.nextInt();
	    suma = n * (n + 1) / 2;
	    System.out.println("La suma es " + suma);
    }
}