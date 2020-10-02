public class Ex3P1 {
    public static void main(String[] args) {
        int arr[] = new int[50];
	    int arr2[] = new int[50];
	    int i = 0;
	
	for(i = 0; i < 50; i++){
        arr[i] = (int)(Math.random()*100);
    }
	
    for(i = 0; i <50; i++){
        arr2[i] = arr[50-1-i];
    }
    
    for(i = 0; i < 50; i++){
        System.out.print(arr[i]);
    }

    System.out.println("\n");

    for(i = 0; i < 50; i++){
        System.out.print(arr2[i]);
    }   
    }
}