import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, cpar, cimpar;
	    cpar = 0;
	    cimpar = 0;
	    i = 0;
	    while(i<10){
            System.out.println("Introduzca número");
		    n = sc.nextInt();
            if (n % 2 == 0){
                cpar = cpar + 1;
            }else{
                cimpar = cimpar + 1;
            }
		    i = i + 1;
        }  
	    System.out.println("Son " + cpar + " numeros pares");
	    System.out.println("Son " + cimpar + " numeros impares");
    }
}