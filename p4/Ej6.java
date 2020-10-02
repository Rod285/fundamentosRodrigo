import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r, area;
	    area = 0.0;
	    System.out.println("Introduzca radio");
	    r = sc.nextDouble();
	    area = Math.PI * Math.pow(r, 2);
	    System.out.println("El área es " + area);
    }
}