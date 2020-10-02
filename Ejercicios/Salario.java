import java.util.Scanner;

public class Salario {

    public static void main(String[] args){
        System.out.println("Introduzca las horas trabajadas");
        Scanner sc = new Scanner(System.in);
        int ht = sc.nextInt();
        System.out.println("Introduzca la tarifa por hora trabajada");
        float th = sc.nextFloat();
        System.out.println("Introduzca la taza de impuestos");
        float ti = sc.nextInt();
        float tipc = ti/100;
        float sb = ht * th;
        float sn = sb - (sb * tipc);
        System.out.println("El salario es: $" + sn);
    }
}