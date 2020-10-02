import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String calificacion;
        double suma = 0;
        int contador=0;

        System.out.print("calificación: ");
        calificacion = sc.nextLine();

        while( !calificacion.equals("FIN") ){

            if( calificacion.equals("NA") ){
                suma += 5.0;
            }

            if( calificacion.equals("S") ){
                suma += 6.0;
            }

            if( calificacion.equals("B") ){
                suma += 8.0;
            }

            if( calificacion.equals("MB") ){
                suma += 10.0;
            }

            contador += 1;

            System.out.print("calificación: ");
            calificacion = sc.nextLine();
        }

        if(contador>0){
            System.out.println("promedio = " + (suma/contador));
        }else{
            System.out.println("Usted no ingresó ninguna calificación");
        }   
    }
}