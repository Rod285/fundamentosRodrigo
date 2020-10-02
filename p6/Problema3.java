import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double AC,LA,NC;
	    AC = aumCred();
	    System.out.println("Cual es su linea de crédito?");
	    LA = sc.nextDouble();
	    NC = LA+(LA*AC);
	    System.out.println("Su nueva linea de crédito es de: $" + NC);
    }

    public static double aumCred(){
        Scanner sc = new Scanner(System.in);
        int TT = 0;
	    Double r = 0.0;
	    System.out.println("¿Cual es su tipo de tarjeta?");
        TT = sc.nextInt();
	    switch (TT){
            case 1: r = 0.25;
                    break;
            case 2: r = 0.30;
                    break;
            case 3: r = 0.40;
                    break;
		    default:r = 0.50; 
        }
        return r;  
    }
}