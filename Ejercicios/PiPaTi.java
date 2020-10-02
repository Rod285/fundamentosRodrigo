import java.util.Random;
import java.util.Scanner;
public class PiPaTi{
    public static void main(String[] args) {
        String rusr, rcpu, ganador;

        rusr = selec();
        rcpu = cpuselec();
        ganador = comp(rusr, rcpu);
        System.out.println("El usuario selecciona: " + rusr);
        System.out.println("La CPU selecciona: " + rcpu);
        System.out.print("El ganador es: " + ganador);
    }
    
    public static String selec(){
        Scanner sc = new Scanner(System.in);
        String r;

        System.out.println("piedra, papel o tijeras?");
        r = sc.nextLine();
        return r;
    }

    public static String cpuselec(){
        int n;
        Random ran = new Random();
        String ppt[] = {"piedra", "papel", "tijeras"};
        String r;

        n = ran.nextInt(2);
        if(n==0){
            r = ppt[0];
        }
        else{
            if(n==1){
                r = ppt[1];
            }
            else{
                r = ppt[2];
            }
        }
        return r;
    }

    public static String comp(String a, String b){
        Boolean aux1, aux2, aux3;
        String ppt[] = {"piedra", "papel", "tijeras"};
        String wnr[] = {"Usuario", "CPU", "Empate"};
        String r = "?";

                aux1 = a.equals(b);
        aux2 = a.equals(ppt[0]) && b.equals(ppt[1]) || a.equals(ppt[1]) && b.equals(ppt[2]) || a.equals(ppt[2]) && b.equals(ppt[0]);
        aux3 = a.equals(ppt[2]) && b.equals(ppt[1]) || a.equals(ppt[1]) && b.equals(ppt[0]) || a.equals(ppt[0]) && b.equals(ppt[2]);
        
        if(aux1){
            r = wnr[2];
        }

        if(aux2){
            r = wnr[1];
        }

        if(aux3){
            r = wnr[0];
        }

        return r;
    }
}