import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double V,T1,T2,T3,TT;
	    int A,B,C,N,CN;
	    TT = 0;
	    N = 0;
	    CN = 0;
	    A = 0;
	    B = 0;
	    C = 0;
	    T1 = 0;
	    T2 = 0;
	    T3 = 0;
	    V = 0;
	    System.out.println("Introduzca el número de ventas del día");
	    do{
            N = sc.nextInt();
        }while(N<0);

	    while (CN < N){
            System.out.println("Introduzca monto de venta");
		    V = sc.nextDouble();
		    while (V<=0){
                System.out.println("Cantidad invalida");
			    V = sc.nextDouble();
            }
		    TT = TT+V;
		    if (V>1000){
                A = A+1;
			    T1 = T1+V;
            }else{
                if (V>500){
                    B = B+1;
				    T2 = T2+V;
                }else{
                    C = C+1;
				    T3 = T3+V;
                }
            }
		    CN = CN+1;
        }
	    System.out.println("La venta total es de: $" + TT);
	    System.out.println("El total de ventas tipo A es: $" + T1 + " con " + A + " ventas");
	    System.out.println("El total de ventas tipo B es: $" + T2 + " con " + B + " ventas");
	    System.out.println("El total de ventas tipo C es: $" + T3 + " con " + C + " ventas");
    }
}