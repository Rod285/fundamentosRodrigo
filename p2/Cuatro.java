import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x1, x2, y1, y2;
        double d;

        System.out.println("Introduzca X1");
        x1 = s.nextInt();
        System.out.println("Introduzca Y1");
        y1 = s.nextInt();
        System.out.println("Introduzca X2");
        x2 = s.nextInt();
        System.out.println("Introduzca Y2");
        y2 = s.nextInt();

        d = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("La distancia es " + d);
    }
}