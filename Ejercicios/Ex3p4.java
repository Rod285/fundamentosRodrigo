public class Ex3p4 {
    public static void main(String[] args) {
		int n, m, i, j;
		n = 3;
		m = 3;
		
        int[][] mtz = new int[n][m];
		int[][] mtz2 = new int[m][n];

        for( j = 0; j < n; j++){
            for(i = 0; i < m; i++){
                mtz[j][i] = (int)(Math.random()*10);
		        System.out.println(mtz[i][j]);
            }
		        
        }
		
		for( j = 0; j < n; j++){
			for(i = 0; i < m; i++){
				mtz2[j][i] = mtz[i][j];
			}
		}
				
		for (j = 0; j < n; j++){
			for(i = 0; i < m; i++){
				System.out.println(mtz2[i][j]);
			}
		} 
    }
}