import java.util.Scanner;

public class Act5_Tres{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        Boolean comp, comp1, comp2, comp3;

        System.out.println("Introduzca las medidas de los lados para ver si su trángulo es posible:");
        System.out.print("Medida lado 1: ");
        a = sc.nextDouble();
        System.out.print("Medida lado 2: ");
        b = sc.nextDouble();
        System.out.print("Medida lado 3: ");
        c = sc.nextDouble();

        comp1 = (a+b)>c;
        comp2 = a<(b+c);
        comp3 = (a+c)>b;
        comp = comp1 && comp2 && comp3;

        if (comp){
            System.out.println("El triángulo es posible");
        }else{
            System.out.println("El triángulo no es posible");
        }
    }
}