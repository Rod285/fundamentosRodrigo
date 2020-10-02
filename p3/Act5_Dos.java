import java.util.Scanner;

public class Act5_Dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        double suma = 0;
        double promedio;
        int cont = 0;
        
        System.out.println("Introduzca los numeros a promediar: ");
        System.out.print("Introduzca número: ");
        numero = sc.nextDouble();

        while (numero >= 0){
            suma += numero;
            cont++;

            System.out.print("Introduzca número: ");
            numero = sc.nextDouble();
        }
        promedio = suma/cont;
        System.out.println("El promedio es: " + promedio);
    }
}