import java.util.Scanner;

public class Suma{

    public static void main(String[] args){
        System.out.println("Introduzca om número entero positivo");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int acum = 0;
        int cont = 1;
        while(cont <= n){
            acum = acum + cont;
            cont = cont + 1;
        }
        System.out.println("La suma es: " + acum);
    }
   }