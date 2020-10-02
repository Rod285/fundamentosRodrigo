import java.util.Scanner;

public class Ej13{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Cal = "Y";
    int cont, contnv, Sum;
    Double Prom = 0.0;

    cont = 0;
    contnv = 1;
    Sum = 0;
    System.out.println("Introduzca sus calificaciones:");

    while(!Cal.equals("F")){
        Cal = sc.nextLine();
		cont = cont+1;
		switch (Cal) {
            case "N": Sum = Sum + 5;
                      break;
				
            case "S": Sum = Sum + 6;
                      break;
				
            case "B": Sum = Sum + 8;
                      break;
				
            case "M": Sum = Sum + 10;
                      break;
				
            case "F": System.out.println("Haz introducido todas tus calificaciones");
                      break;
				
			default: System.out.println("No valido");
                     contnv = contnv + 1;
				
        }
    } 
	cont = cont - contnv;
	Prom = (double) Sum / cont;
	System.out.println("Su promedio es " + Prom);
    }
    
}