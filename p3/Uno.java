import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre = "Jorge";
        String resp;

        System.out.print("Hola ¿Estas registrado? (si/no): ");
        resp = sc.nextLine();

        if( resp.equals("no")  ){
            System.out.print("Escribe tu nombre: ");
            nombre = sc.nextLine(); 
        }

        System.out.println("Hola " + nombre + " bienvenido");
       
    }
}