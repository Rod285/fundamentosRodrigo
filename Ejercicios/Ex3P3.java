public class Ex3P3 {
    public static void main(String[] args) {
        int repetidos, indA, indAux;
	    boolean estaRepetido;
	    int[] arrA = new int[13];
	    int[] arrAreps = new int[13];
	
	    for(indAux = 0; indAux < 13; indAux ++){
            arrAreps[indAux] = 0;
        }
	
    	arrA[0] = 1;
	    arrA[1] = 3;
	    arrA[2] = 2;
	    arrA[3] = 3;
    	arrA[4] = 4;
	    arrA[5] = 8;
    	arrA[6] = 5;
	    arrA[7] = 6;
    	arrA[8] = 1;
    	arrA[9] = 7;
    	arrA[10] = 8;
    	arrA[11] = 9;
	    arrA[12] = 1;
	
	    indAux = 0;
    	indA = 0;
	    repetidos = 0;
	
	    for(indA = 0; indA < 13; indA++){
            if( arrA[indA]>0 ){
                estaRepetido = false;
			    for(indAux = indA+1; indAux < 13; indAux++){
                    if( arrA[indA] == arrA[indAux] ){
                        estaRepetido = true;
					    arrA[indAux] = 0;
                    }
                }

			    if( estaRepetido ){
                    arrAreps[repetidos] = arrA[indA];
				    repetidos = repetidos + 1;
                }
            }
        }
	
	    indAux = 0;
	
	    System.out.println("Repetidos = " + repetidos);
	
    	for(indAux = 0; indAux < 13; indAux++){
            System.out.print(arrAreps[indAux] + " ");
        } 
    }
}