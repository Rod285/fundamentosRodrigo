import java.util.Scanner;

public class Principal1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int C = 0;
        int S = 0;
        int dato = 1;
        double media;

        while(dato != 0){
            dato = sc.nextInt();
            if(dato != 0){
                C = C + 1;
                S = S + dato;
            }
        }

        media = (double)S/C;
        System.out.println("media = " + media);

    }
}