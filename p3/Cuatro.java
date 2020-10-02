import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int mayor = 0;

        System.out.print("numero: ");
        numero = sc.nextInt();

        while(  numero>=0  ){
            
            if( numero>mayor ){
                mayor = numero;
            }

            System.out.print("numero: ");
            numero = sc.nextInt();
        }

        System.out.println("El mayor fue: " + mayor);  
    }
}