import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduzca un número: ");
        n = sc.nextInt();

        if( n%2 == 0  ){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
        

    }
}