import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        double PA,TO,TOT;

	    PA = tipoHamb();
	    TO = costo(PA);
	    TOT = cargo(TO);
	    System.out.println("El costo total es: " +TOT);
    }

    public static double tipoHamb(){
        Scanner sc = new Scanner(System.in);
        int r;
	    String TI;
	    do{
            System.out.println("¿Qué tipo de hamburguesa desea? S = Sencilla, D = Doble, T = Triple");
		    TI = sc.nextLine();
		    switch (TI){
                case "S": r = 20;
                          break;
                case "D": r = 25;
                          break;
                case "T": r = 28;
                          break;
			    default:  System.out.println("Opcion no valida");
				          r = 0;
            }
        }while(r==0);
        return r;	
    }

    public static double costo(double PA){
        Scanner sc = new Scanner(System.in);
        int N;
	    Double r;
	    System.out.println("¿Cuantas hamburguesas desea?");
	    N = sc.nextInt();
        r = PA * N;
        return r;
    }
	
    public static double cargo(double TO){
        Scanner sc = new Scanner(System.in);
        String TP;
	    Double r,CA;
	    System.out.println("¿Cual es su tipo de pago? E = Efectivo, T = Tarjeta");
	    TP = sc.nextLine();
	    if (TP.equals("E")){
            r = 0.0;
		    r = TO;
        }else{
            while (!TP.equals("T")){
                System.out.println("Opción invalida");
			    TP = sc.nextLine();
            }
            CA = 0.05;
            r = TO+(TO*CA);
        }   
        return r;
    }
}