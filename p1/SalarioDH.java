import java.util.Scanner;

public class SalarioDH{

    public static void main(String[] args) {
        
        System.out.println("Introduzca el número de horasa trabajadas");
        Scanner Horas = new Scanner(System.in);
        int h = Horas.nextInt();
        Horas.close();
        double s=15.4025*h;
        System.out.println("El salario es = " + s);
    }
}