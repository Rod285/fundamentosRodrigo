import java.util.Scanner;

public class Tres {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        int suma;

        System.out.println("Introduzca un número");
        n = s.nextInt();
        suma = (n*(n+1))/2;
        System.out.println("La suma es = " + suma);
    }
}