import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acum,num,i,n;
	    Double prom = 0.0;
	    acum = 0;
	    
	    System.out.println("¿Cuantos numeros quiere sumar?");
	    n = sc.nextInt();
	    for(i = 1; i <= n; i++){
            System.out.println("Introduzca número ");
		    num = sc.nextInt();
		    acum = acum + num;
        }
	    prom = (double) acum/n;
	    System.out.println("El promedio es " + prom);
    }
}