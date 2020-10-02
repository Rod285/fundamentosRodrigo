import java.util.Scanner;

public class GradosCF{

    public static void main(String[] args) {
        
        System.out.println("Introduzca temperatura en grados °C");
        Scanner Celsius = new Scanner(System.in);
        double c = Celsius.nextDouble();
        Celsius.close();
        double f=1.80*c+32;
        System.out.println("°F = " + f);
    }
}