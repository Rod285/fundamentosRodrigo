import java.util.Scanner;

public class Suma_pares{

    public static void main(String[] args){
        int acum = 0;
        int n = 1;
        System.out.println("Introduzca un número entero positivo");
        while(n > 0){
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int modn = n%2; 
            if(modn == 0){
                acum = acum + n;
            }
        }
        System.out.println("La suma es = " + acum);
    }
}