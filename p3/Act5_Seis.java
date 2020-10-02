import java.util.Scanner;

public class Act5_Seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int pado = 1;
        int p1 = 1;
        int p2 = 1;
        int p3 = 1;

        System.out.print("Introduzca número, para determinar su n-esimo número de Padovan: ");
        num = sc.nextInt();

        for (int i=2; i<num; i++){
            pado = p1 + p2;
            p1 = p2;
            p2 = p3;
            p3 = pado;
        }
        
        System.out.println("El enesimo número de Padovan es: " + pado);
    }
}