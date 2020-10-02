package pr8.Calculadora;

public class Procesador {
	public Complejo sumar(Complejo c1, Complejo c2){
		Double r, i;
		Complejo res = new Complejo();
		r = c1.getReal() + c2.getReal();
		i = c1.getImag() + c2.getImag();
		
		res.setReal(r);
		res.setImag(i);
		
		return res;
	}
	
	public Complejo restar(Complejo c1, Complejo c2){
		Double r, i;
		Complejo res = new Complejo();
		r = c1.getReal() - c2.getReal();
		i = c1.getImag() - c2.getImag();
		
		res.setReal(r);
		res.setImag(i);
		
		return res;
	}
	
	public Complejo multiplicar(Complejo c1, Complejo c2){
		Double r, i;
		Complejo res = new Complejo();
		r = (c1.getReal() * c2.getReal()) - (c1.getImag() * c2.getImag());
		i = (c1.getReal() * c2.getImag()) - (c1.getImag() * c2.getReal());
		
		res.setReal(r);
		res.setImag(i);
		
		return res;
	}
	
	public Complejo dividir(Complejo c1, Complejo c2){
		Double r, i;
		Complejo res = new Complejo();
		r = ((c1.getReal() * c2.getReal()) + (c1.getImag() * c2.getImag()))/(Math.pow(c2.getReal(), 2) + Math.pow(c2.getImag(), 2));
		i = ((c1.getImag() * c2.getReal()) - (c1.getReal() * c2.getImag()))/(Math.pow(c2.getReal(), 2) + Math.pow(c2.getImag(), 2));
		
		res.setReal(r);
		res.setImag(i);
		
		return res;
	}
}
