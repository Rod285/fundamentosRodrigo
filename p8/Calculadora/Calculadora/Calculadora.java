package pr8.Calculadora;

public class Calculadora {
	Pantalla p;
	Teclado t;
	Procesador proc;
	
	public Calculadora() {
		this.p = new Pantalla();
		this.t = new Teclado();
		this.proc = new Procesador();
	}
	
	public void on() {
		Complejo c1, c2, cr;
		String op;
		System.out.println("Prendiendo Calculadora");
		
		do {
			System.out.println("+ Sumar");
			System.out.println("- Restar");
			System.out.println("* Multiplicar");
			System.out.println("/ Dividir");
			System.out.println("5. Apagar");
			
			c1 = t.capturaComplejo();
			op = t.capturaOperando();
			if (op.equals("5")) {
				System.out.println("Apagando Calculadora");
				break;
			}
			c2 = t.capturaComplejo();	
		
		switch(op) {
		case "+" :  cr = proc.sumar(c1, c2);
					p.imprimirComplejo(cr);
					break;
		case "-" :  cr = proc.restar(c1, c2);
					p.imprimirComplejo(cr);
					break;
		case "*" :  cr = proc.multiplicar(c1, c2);
					p.imprimirComplejo(cr);
					break;
		case "/" :  cr = proc.dividir(c1, c2);
					p.imprimirComplejo(cr);
					break;
		default: System.out.println("Operador no valido");
		}
			
		}while(op != "5" );
	}
}
