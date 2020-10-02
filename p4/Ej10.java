import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int mcd = 1;
	    System.out.println("Introduzca numerador");
	    a = sc.nextInt();
	    System.out.println("Introduzca denominador");
	    b = sc.nextInt();
	    while(a > 0){
            mcd = a;
		    a = b % a;
		    b = mcd;
        }
	    System.out.println("El MCD es " + mcd);
    }
}