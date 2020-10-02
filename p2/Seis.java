import java.util.Scanner;

public class Seis {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int a, b, c;
        double x1, x2, xrel, xim, discrim;

        System.out.println("Introduce coeficiente del termino cuadrático");
        a = s.nextInt();
        System.out.println("Introduce coeficiente del termino lineal");
        b = s.nextInt();
        System.out.println("Introduce coeficiente del termino independiente");
        c = s.nextInt();
        discrim = (b*b)-(4*a*c);
        if(discrim >= 0){
            x1 = (-b + Math.sqrt(discrim))/(2*a);
            x2 = (-b - Math.sqrt(discrim))/(2*a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);             
        }
        else{
            xrel = (double)-b / (2*a);
            xim = Math.sqrt(-discrim)/(2*a);
            System.out.print("X1 = " + xrel);
            System.out.print(" + " + xim);
            System.out.println("i");
            System.out.print("X2 = " + xrel);
            System.out.print(" - " + xim);
            System.out.println("i");
        }
    }
}