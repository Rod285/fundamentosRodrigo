import java.util.Scanner;

public class Uno {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Double d;
        Double t;
        Double v;
        System.out.println("Introduzca distancia"); 
        d = s.nextDouble();
        System.out.println("Introduzca tiempo"); 
        t = s.nextDouble();
        v = d/t;
        System.out.println("La velocidad es " + v);
    }
    
}