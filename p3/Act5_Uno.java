import java.util.Scanner;

public class Act5_Uno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String calificacion;
        double suma = 0;
        int contador=0;

        System.out.print("calificación: ");
        calificacion = sc.nextLine();

        while( !calificacion.equals("FIN") ){

            switch(calificacion){

                case "NA": suma += 5.0;
                           break;
                case "S": suma += 6.0;
                          break;
                case "B": suma += 8.0;
                          break;
                case "MB": suma += 10.0;
                           break;
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