import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Op;
        double a, b, r;

        do{
            System.out.println("\n¿Que operación desea hacer?");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.println("5.- Factorial");
            System.out.println("6.- Combinación");
            System.out.println("7.- Exponencial");
            System.out.println("8.- Salir\n");
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
                case 5: a = solicitarOperando();
                        r = factorial(a);
                        imprimeResultado(r);
                        break;
                case 6: System.out.print("n = ");
                        a = solicitarOperando();
                        System.out.print("k = ");
                        b = solicitarOperando();
                        r = combinacion(a,b);
                        imprimeResultado(r);
                case 7: a = solicitarOperando();
                        r = exp(a);
                        imprimeResultado(r);
                case 8: System.out.println("Apagando la calculadora");
                        break;
                default: System.out.println("Opción no valida");
            }
        }while(Op != 8);
    }

    public static double solicitarOperando(){
        Double x;
        Scanner s = new Scanner(System.in);

        System.out.println("\nIntroduzca número");
        x = s.nextDouble();

        return x;
    }

    public static void imprimeResultado(double res){
        System.out.println("\nEl resultado es: " + res);
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

    public static double factorial(double x){
        double r = 1.0;

        for (int i = 1; i<=x; i++){
            r = r * i; 
        }

        return r;
    }

    public static double combinacion(double x, double y){
        Double r = 0.0;

        r = factorial(x)/(factorial(y)*factorial((x-y)));

        return r;
    }

    public static double exp(double x){
        Double r = 0.0;

        for(int i=0;i<=50;i++){
            r = r + (Math.pow(x, i)/factorial(i));
        }
        
        return r;
    }
}