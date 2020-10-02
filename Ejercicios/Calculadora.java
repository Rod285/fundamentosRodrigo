import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Op;
        double a, b, r;

        do{
            System.out.println("¿Que operación desea hacer?");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.println("5.- Salir");
            Op = sc.nextInt();

            switch (Op){
                case 1: a = solicitarOperando();
                        b = solicitarOperando();
                        r = suma(a, b);
                        imprimeResultado(r);
                        break;
                case 2: a = solicitarOperando();
                        b = solicitarOperando();
                        r = resta(a, b);
                        imprimeResultado(r);
                        break;
                case 3: a = solicitarOperando();
                        b = solicitarOperando();
                        r = multiplica(a, b);
                        imprimeResultado(r);
                        break;
                case 4: a = solicitarOperando();
                        b = solicitarOperando();
                        r = divide(a, b);
                        imprimeResultado(r);
                        break;
                case 5: System.out.println("Apagando la calculadora");
                        break;
                default: System.out.println("Opción no valida");
            }
        }while(Op != 5);
    }

    public static double solicitarOperando(){
        Double x;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca número");
        x = s.nextDouble();

        return x;
    }

    public static void imprimeResultado(double res){
        System.out.println("El resultado es: " + res);
    }

    public static double suma(double x, double y){
        Double r = 0.0;

        r = x+y;

        return r;
    }

    public static double resta(double x, double y){
        Double r = 0.0;

        r = x-y;

        return r;
    }

    public static double multiplica(double x, double y){
        Double r = 0.0;

        r = x*y;

        return r;
    }

    public static double divide(double x, double y){
        Double r = 0.0;

        r = x/y;

        return r;
    }
}