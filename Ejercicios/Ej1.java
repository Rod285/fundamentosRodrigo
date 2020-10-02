import java.util.Scanner;

public class Ej1 {
    public void main(String[] args){
        String nombre = 'Jorge';
        String resp;
        Scanner sc = new Scanner(Sysyem.in);

        System.out.println("¿Está registrado?");
        resp = sc.nextLine();
        
        Boolean b = resp.equals('no');

        if(b){
            System.out.println("Introduce nombre");
            nombre = sc.nextLine();
        }
    }

    System.out.println("Hola " + Nombre);  
}