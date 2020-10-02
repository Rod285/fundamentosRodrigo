import java.util.Scanner;

public class Act5_Tres {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float c = 0;
        boolean aux1, aux2;

        System.out.println("Introduzca calificación");
        c = s.nextFloat();
        aux1 = 10 > c;
        aux2 = c >= 7.5;
        
        if(aux1&&aux2){
            System.out.println("Calificación: MB");
        }
        else{
            aux1 = 7.5 > c;
            aux2 = c >= 6; 
            if(aux1&&aux2){
                System.out.println("Calificación: B");                
            }
            else{
                System.out.println("Calificación: NA");                
            }
        }
    }    
    
}