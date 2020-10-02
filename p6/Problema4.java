import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M;
	    double AH, CA;
	    CA = 0;
	    M = 0;
	    do{
            M = M+1;
		    System.out.println("\nIntroduzca cantidad a depositar en el mes " + M);
		    AH = sc.nextDouble();
		    CA = CA + AH;
		    System.out.println("El ahorro al mes " + M + " será: " + CA);
        }while(M!=12);
    }
}