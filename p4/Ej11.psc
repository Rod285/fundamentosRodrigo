Proceso Ej11
	Definir i, md, dv, num, acum, aux como Enteros;
	i <- 1;
	acum <- 0;
	Escribir 'Introduzca n�mero';
	Leer num;
	aux <- num;
	Mientras i<num Hacer
		md <- num mod aux;
		Si md = 0 Entonces
			dv <- num / aux;
			acum <- acum + dv;
		FinSi
		aux <- aux - 1;
		i <- i + 1;
	FinMientras
	Si acum = num Entonces
		Escribir num,' es un n�mero perfecto';
	SiNo
		Escribir num,' no es un n�mero perfecto';
	FinSi
FinProceso
