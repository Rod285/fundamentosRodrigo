Proceso Ej13
	Definir Cal Como Caracter;
	Definir num,cont,contnv,Sum Como Entero;
	Definir Prom Como Real;
	contnv <- 1;
	Cal <- ' ';
	cont <- 0;
	Sum <- 0;
	Mientras Cal<>'F' Hacer
		Leer Cal;
		cont <- cont+1;
		Segun Cal  Hacer
			'N':
				Sum <- Sum+5.0;
			'S':
				Sum <- Sum+6.0;
			'B':
				Sum <- Sum+8.0;
			'M':
				Sum <- Sum+10;
			'F':
				Escribir 'Haz introducido todas sus calificaciones';
			De Otro Modo:
				Escribir 'No valido';
				contnv <- contnv+1;
		FinSegun
	FinMientras
	cont <- cont-contnv;
	Prom <- Sum/cont;
	Escribir 'Su promedio es ',Prom;
FinProceso
