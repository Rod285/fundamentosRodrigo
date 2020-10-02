import java.util.Scanner;

public class Act5_Cuatro {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n, c, d, u, cont;
        int i = 0;
        int j = 0;
        String[] NR = new String[4];
        
        System.out.println("Introduzca número a convertir");
        n = s.nextInt();
        c = n/100;
        d = (n - (c*100))/10;
        u = n - ((c*100)+(d*10));

        System.out.println("El número romano es: ");

        if(c<4){
            for(i = c; i>0; i--){
                j=j+1;
                NR[j]= "C";
                System.out.print(NR[j]);
            }
        }
        else{
            if(c==4){
                NR[2]= "C";
                NR[3]= "D";
                System.out.print(NR[2]);
                System.out.print(NR[3]);
            }
            else{
                if(c>=5 && c<9){
                    NR[0]="D";
                    System.out.print(NR[0]);
                    for(i = c; i>5; i--){
                        j=j+1;
                        NR[j]="C";
                        System.out.print(NR[j]);
                    }
                }
                else{
                    NR[2]= "C";
                    NR[3]= "M";
                    System.out.print(NR[2]);
                    System.out.print(NR[3]);                        
                }
            }
        }

        j=0;

        if(d<4){
            for(i = d; i>0; i--){
                j=j+1;
                NR[j]= "X";
                System.out.print(NR[j]);
            }
        }
        else{
            if(d==4){
            NR[2]= "X";
            NR[3]= "L";
            System.out.print(NR[2]);
            System.out.print(NR[3]);
            }
            else{
                if(d>=5 && d<9){
                    NR[0]="L";
                    System.out.print(NR[0]);
                    for(i = d; i>5; i--){
                        j=j+1;
                        NR[j]="X";
                        System.out.print(NR[j]);
                    }
                }
                else{
                    NR[2]= "X";
                    NR[3]= "C";
                    System.out.print(NR[2]);
                    System.out.print(NR[3]);                        
                }
            }
        }
        j=0;

        if(u<4){
            for(i = u; i>0; i--){
                j=j+1;
                NR[j]= "I";
                System.out.print(NR[j]);
            }
        }
        else{
            if(u==4){
            NR[2]= "I";
            NR[3]= "V";
            System.out.print(NR[2]);
            System.out.print(NR[3]);
            }
            else{
                if(u>=5 && u<9){
                    NR[0]="V";
                    System.out.print(NR[0]);
                    for(i = u; i>5; i--){
                        j=j+1;
                        NR[j]="I";
                        System.out.print(NR[j]);
                    }
                }
                else{
                    NR[2]= "I";
                    NR[3]= "X";
                    System.out.print(NR[2]);
                    System.out.print(NR[3]);                        
                }
            }
        }
    }
}