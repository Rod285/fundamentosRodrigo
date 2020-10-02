public class Ex3P2 {
    public static void main(String[] args) {
        int arr1[] = new int[7];
	    int arr2[] = new int[5];
	    int arr3[] = new int[12];
	    int ind1, ind2, ind3;
	
	    ind1 = 0;
	    ind2 = 0;
	    ind3 = 0;

	    arr1[0] = 1;
	    arr1[1] = 4;
	    arr1[2] = 7;
	    arr1[3] = 10;
	    arr1[4] = 46;
	    arr1[5] = 49;
	    arr1[6] = 102;
	
	    arr2[0] = 1;
	    arr2[1] = 2;
	    arr2[2] = 3;
	    arr2[3] = 4;
	    arr2[4] = 5;
	
	    while( (ind1 < 7) && (ind2 < 5) ){
            if( arr1[ind1]<arr2[ind2] ){
                arr3[ind3] = arr1[ind1];
			    ind1 = ind1 + 1;
            }else{
                arr3[ind3] = arr2[ind2];
			    ind2 = ind2 + 1;
            }
			ind3 = ind3 + 1;
        }
		
	    if( ind1<7 ){
            while( ind1<7 ){
                arr3[ind3] = arr1[ind1];
			    ind1 = ind1 + 1;
			    ind3 = ind3 + 1;
            }
        }
	
	    if( ind2<5 ){
            while( ind2<5 ){
                arr3[ind3] = arr2[ind2];
			    ind2 = ind2 + 1;
			    ind3 = ind3 + 1;
            }
			    
        }
			
	    ind3 = 0;
			
	    for(ind3 = 0; ind3 < 12; ind3++){
            System.out.print(" " + arr3[ind3]);
        }
    }
}