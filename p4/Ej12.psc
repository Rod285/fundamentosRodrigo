Proceso Ej12
	Definir j Como Entero;
	Definir i,md,dv,num,acum,aux Como Entero;
	j <- 0;
	i <- 1;
	acum <- 0;
	num <- 1;
	aux <- num;
	Mientras j<6 Hacer
		Mientras i<num Hacer
			md <- num MOD aux;
			Si md=0 Entonces
				dv <- num/aux;
				acum <- acum+dv;
			FinSi
			aux <- aux-1;
			i <- i+1;
		FinMientras
		Si acum=num Entonces
			Escribir num,' es un número perfecto';
			j <- j+1;
		FinSi
		acum <- 0;
		i <- 1;
		num <- num+1;
		aux <- num;
	FinMientras
FinProceso
