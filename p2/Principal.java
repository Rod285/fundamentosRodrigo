import java.util.Scanner;   //Para leer

public class Principal {
    char varGlobal;
    static final int CTE_GLOBAL = 2;
    public static void main(String[] args){
        System.out.println("Hola");

        int a = 5;
        double b = 1.3;
        char c = 'T';
        Boolean d = true;

        //short f = 4000;
        /*Comentarios de 
        lineas multiples*/

        float g =3.45f;

        int h = 4;
        float i = 2.0f;
        double j;

        j = h/i;

        float k = (float)j;

        int l;

        Scanner sc = new Scanner(System.in); //Leer del teclado
        
        //int dato = sc.nextInt();

        //System.out.println("El dato es: " + dato);

        l = 5;
        l += 2;
        l++;
        System.out.println("l = " + l);

        System.out.println(!d);

        l= 2*(4+5);
        System.out.println(l);

        boolean m = true;
        boolean n = false;
        boolean o;

        o = m || n;

        if(o){
            System.out.println("La condición es verdadera");
        }
        else{
            System.out.println("La condición es falsa");
        }

        System.out.println("Salimos del if");

        double p = Math.sqrt(9);
        System.out.println(p);

        String nombre;
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        System.out.println(nombre.length());
    }

    public static void otroMetodo(){
        int varLocal;
        final int CTE_LOCAL;

        CTE_LOCAL = 1;

    }
}