import java.util.Scanner;

public class SalarioExtra {

    public static void main(String[] args){
        float pe = 0;
        System.out.println("Introduzca las horas trabajadas");
        Scanner sc = new Scanner(System.in);
        int ht = sc.nextInt();
        System.out.println("Introduzca la tarifa por hora trabajada");
        float th = sc.nextFloat();
        System.out.println("Introduzca la taza de impuestos");
        float ti = sc.nextInt();
        float tipc = ti/100;
        if(ht > 40){
            int he = ht - 40;
            ht = 40;
            float she = (th * 150)/100;
            pe = he * she;
        }
        float sb = (ht * th) + pe;
        float sn = sb - (sb * tipc);
        System.out.println("El salario es: $" + sn);
    }
}