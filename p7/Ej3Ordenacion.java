import java.util.Random;

public class Ej3Ordenacion {
    public static void main(String[] args) {
        
        int[] arr, arrOrd;
        int n = 50;   //tamaño del arreglo
        int r = 100; //rango de aleatorios

        arr = generaArreglo(n,r);

        imprimirArreglo(n,arr);

        arrOrd = ordenaArreglo(n,arr);
        System.out.println("\n");
        imprimirArreglo(n,arrOrd);
        
    }

    public static int[] generaArreglo( int n, int r  ){
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = (int)(Math.random()*r);
        } //codigo para generar arreglo

        return arr;
    }

    public static void imprimirArreglo( int n, int[] arr ){
        
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        } //codigo para imprimir arr
    }

    public static int[] ordenaArreglo(int n, int[] arr){
        int[] arrOrd = new int [n];
        int may, i, j, k;
	    i = 0;
	    j = 0;
	    k = 0;
	    
	    for(k = 0; k < n; k++){
            may = 0;
		    for (j = 0; j < n; j++){
                for(i = 0; i < n; i++){
                    if(arr[i] > may){
                        may = arr[i];
                    }
                }
			    if(arr[j] == may){
                    arr[j] = 0;
				    break;
                }
            }
            arrOrd[k] = may;
        }//código para ordenar arreglo

        return arrOrd;
    }

}