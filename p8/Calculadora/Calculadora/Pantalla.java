package pr8.Calculadora;

public class Pantalla {
	
	public void imprimirComplejo(Complejo c) {
		if (c.getImag() > 0.0) {
			System.out.println(c.getReal() + " + " + c.getImag() + "i");
		}else {
			System.out.println(c.getReal() + " " + c.getImag() + "i");
		}
	}
}
