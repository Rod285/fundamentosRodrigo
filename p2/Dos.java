import java.util.Scanner;

public class Dos {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double r;
        double a;

        System.out.println("Introduzca radio: ");
        r = s.nextDouble();
        a = Math.PI*r*r;
        System.out.println("El área es: " + a);
        System.out.println(a);
    }
}