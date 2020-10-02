import java.util.Scanner;

public class Act5_Cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aux;
        
        System.out.print("Introduzca número para determinar si es número primo: ");
        num = sc.nextInt();

        if(num == 2){
            System.out.println("El número es primo");
        }

        for (int i = 2; i < num; i++){
            aux = num%i;
            
            if(aux == 0){
                System.out.println("El número no es primo");
                break;
            }

            if (i == (num-1)){
                System.out.println("El número es primo");
                break;
            }
        } 
    }    
}