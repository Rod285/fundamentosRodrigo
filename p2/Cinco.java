import java.util.Scanner;

public class Cinco {
    
    public static void main(String[] args){
         
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int c;
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;       
        boolean aux1;
        boolean aux2;
        boolean aux3;
        
        System.out.println("Introduzca el 1er número");
        a = s.nextInt();
        System.out.println("Introduzca el 2do número");
        b = s.nextInt();
        System.out.println("Introduzca el 3er número");
        c = s.nextInt();

        aux1 = a>b;
        aux2 = a>c;
        aux3 = b>c;

        if(aux1 && aux2){
            pos1 = a;
            if(aux3){
                pos2 = b;
                pos3 = c;
            }
            else{
                pos2 = c;
                pos3 = b;
            }
        }
        else{
            if(!aux1 && aux3){
                pos1 = b;
                if(aux2){
                    pos2 = a;
                    pos3 = c;
                }
                else{
                    pos2 = c;
                    pos3 = a;
                }
            }
            else{
                if(!aux2 && !aux3){
                    pos1 = c;
                    if(aux1){
                        pos2 = a;
                        pos3 = b;
                    }
                    else{
                        pos2 = b;
                        pos3 = a;
                    }
                }
            }
        }
        System.out.println("Los números ordenados de mayor a menor son:");
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }
}