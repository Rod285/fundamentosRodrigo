package pr8.Calculadora;
import java.util.Scanner;
public class Teclado {
	
	public String capturaOperando() {
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Operador: ");
		ch = sc.nextLine();
		
		return ch;
	}
	
	public Complejo capturaComplejo() {
		Scanner sc = new Scanner(System.in);
		Complejo c = new Complejo();
		Double re;
		Double im;
		
		System.out.println("Real: ");
		re = sc.nextDouble();
		
		System.out.println("Imaginaria: ");
		im = sc.nextDouble();
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	}

}
