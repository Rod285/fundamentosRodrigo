Proceso ExGP1
	Definir n como Entero;
	n <- 1;
	Para n<-1 Hasta 100 Hacer
		Si n mod 3 = 0 Entonces
			Si n mod 5 = 0 Entonces
				Escribir 'FizzBuzz';
			SiNo
				Escribir 'Fizz';
			FinSi
		SiNo
			Si n mod 5 = 0 Entonces
				Escribir 'Buzz';
			SiNo
				Escribir n;
			FinSi
		FinSi
	FinPara
FinProceso
