public class Principal{
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[][] arr2 = new int[2][3];
        int[][][] arr3 = new int[3][3][2];
        int i, fil, col, pla;
	
	    for (i = 0; i < 2; i++){
            arr[i] = i;
        }
        
        /*for(i = 0; i < 3; i++){
            System.out.print(arr[i]);
        }*/
        
	    for (fil = 0; fil < 2 ; fil++){
            for (col = 0; col < 3; col++){
                arr2[fil][col] = col;
            }
        }

        /*for(fil = 0; fil < 3; fil++){
            for(col = 0; col < 3; col++){
                System.out.print(arr2[fil][col]);
            }
        }*/
		    
	    for(pla = 0; pla < 2; pla ++){
            for(fil = 0; fil < 3; fil++){
                for (col = 0; col < 3; col++){
                    arr3[fil][col][pla] = col;
                }
            }
        }
	
	    for(pla = 0; pla < 2; pla++){
            for(fil = 0; fil < 3; fil++){
                for(col = 0; col < 3; col++){
                    System.out.print(arr3[fil][col][pla]);
                }
            }
        }
    }
}