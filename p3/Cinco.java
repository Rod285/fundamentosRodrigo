import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int contadorPares = 0;
        int contadorImpares = 0;

        for(int i=0; i<10 ; i++){

            System.out.print("Introduzca un número: ");
            numero = sc.nextInt();
            
            if(  numero%2 == 0  ){
                contadorPares++;
            }else{
                contadorImpares++;
            }
        }

        System.out.println("Fueron " + contadorImpares + " impares");
        System.out.println("Fueron " + contadorPares + " pares");   
    }
}