import java.util.Scanner;

public class Ej2busqueda{
    public static void main(String[] args) {
        
        int[] arr;
        int n,ind;
        int r,x;
        boolean esta;
        Scanner sc = new Scanner(System.in);

        n=50; //tamaño del arreglo arr
        arr = new int[n];

        r=200; //rango de los números aleatorios

        for(int i=0; i<n; i++){
            arr[i] = (int)(Math.random()*r);
        }

        for( ind=0; ind<n; ind++ ){
            System.out.print( arr[ind] + " ");
        }
        System.out.println();

        System.out.print("Número a buscar: ");
        x = sc.nextInt();

        esta = false;

        for(int i=0; i<n; i++){

            if( arr[i] == x ){
                esta = true;
                break;
            }

        }

        System.out.println("Esta= " + esta);

    }
}