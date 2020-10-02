package examenglobal;

public class Principal {

	public static void main(String[] args) {
		
		//Problema1
		
		impNum();
		System.out.println();
		
		
		//Problema 2
		
		OpsConArrs oper = new OpsConArrs();
		int n = 5;
		int m = n;
		int r = 9;
		int[][] mtz = new int[n][m];
		int[][] mtzTInf = new int[n][m];
	
		mtz = oper.generaMtzAleatoria(n, m, r);
		oper.imprimeMtz2d(mtz, n, m);
		mtzTInf = oper.mtzTrianInf(mtz, n);
		oper.imprimeMtz2d(mtzTInf, n, m);
	}
	
	public static void impNum() {
		int n;
		n = 1;
		for(n = 1; n <= 100; n++) {
			if(n % 3 == 0) {
				if(n % 5 == 0) {
					System.out.print("FizzBuzz ");
				}else {
					System.out.print("Fizz ");
				}
			}else {
				if(n % 5 == 0) {
					System.out.print("Buzz ");
				}else {
				System.out.print(n + " ");
				}
			}
		}
		System.out.println();
	}
}
