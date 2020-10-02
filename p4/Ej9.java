import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, num, min, max;
	    i = 0;
	    min = 999999999;
	    max = 0;
	    System.out.println("¿Cuantos números introducirá?");
	    n = sc.nextInt();
	    while(i<n){
            System.out.println("Introduzca número");
		    num = sc.nextInt();
		    if (num > max){
                max = num;
            }
		    if (num < min){
                min = num;
            }
		    i = i + 1;
        }
	    System.out.println("El mayor es " + max);
	    System.out.println("El menor es " + min);
    }
}