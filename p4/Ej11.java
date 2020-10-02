import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, md, dv, num, acum, aux;
	    i = 1;
	    acum = 0;
	    System.out.println("Introduzca número");
	    num = sc.nextInt();
	    aux = num;
	    while(i < num){
            md = num % aux;
		    if (md == 0){
                dv = num / aux;
			    acum = acum + dv;
            }
		    aux = aux - 1;
		    i = i + 1;
        }
	    if( acum == num ){
            System.out.print(num + " es un número perfecto");
        }else{
            System.out.print(num + " no es un número perfecto");
        }
    }
}