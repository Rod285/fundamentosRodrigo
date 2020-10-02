import java.util.Scanner;

public class Act5_Cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int aux = 0;
        int fn1 = 1;
        int fn2 = 0;

        System.out.print("Introduzca número, para determinar el n-esimo número de Fibonacci: ");
        num = sc.nextInt();

        for (int i=0; i<num; i++){
            aux = fn1 + fn2;
            fn2 = fn1;
            fn1 = aux;
        }
        
        System.out.println("El enesimo número de Fibonacci es: " + fn2);
    }
}