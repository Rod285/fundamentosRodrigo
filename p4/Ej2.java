import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
	    System.out.println("Introduzca el primer número");
	    n1 = sc.nextInt();
	    System.out.println("Introduzca el segundo n�mero");
	    n2 = sc.nextInt();
	    if (n1 > n2){
            System.out.println("El mayor es " + n1);
        }else{
            System.out.println("El mayor es " + n2);
        }
    }
}