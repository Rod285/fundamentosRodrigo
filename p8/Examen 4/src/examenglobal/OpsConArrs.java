package examenglobal;

public class OpsConArrs {
	
	public int[] generaArrAleatorio(int n, int r) {
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++ ) {
			arr[i] = (int)(Math.random()*r)+1;
		}
		
		return arr;
	}

	public int[][] generaMtzAleatoria(int n, int m, int r){
		int[][] mtz = new int[n][m];
		
		for(int fil = 0; fil < n; fil ++) {
			for(int col = 0; col < m; col++) {
				mtz[fil][col] = (int)(Math.random()*r)+1;
			}
		}
		
		return mtz;
	}
	
	public void imprimeMtz2d(int[][] mtz, int n, int m) {
		
		for(int fil = 0; fil < n; fil++) {
			for(int col = 0; col < m; col++) {
				System.out.print(mtz[fil][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void oedenaArrBuebuja(int[] arr, int n) {
		int may;
		
		for(int elem = n-1; elem > 0; elem--) {
			may = arr[0];
			for(int ind = 1; ind <= elem; ind++) {
				if(may < arr[ind]) {
					arr[ind-1] = arr[ind];
				}else {
					may = arr[ind];
				}
			arr[ind] = may;
			}
		}
	}
	
	public int[][] mtzTrianInf(int[][] arr, int n){
		
		for(int j = 0; j < n; j++) {
			for(int i = 0; i < n; i++ ) {
				if(i > j) {
					arr[j][i] = 0;
				}
			}
		}
	return arr;
	}
	
	
}
