Proceso Ej7
	Definir n, i, cpar, cimpar como Entero;
	cpar <- 0;
	cimpar <- 0;
	i <- 0;
	Mientras i<10 Hacer
		Escribir 'Introduzca número';
		Leer n;
		Si n MOD 2 = 0 Entonces
			cpar <- cpar + 1;
		SiNo
			cimpar <- cimpar + 1;
		FinSi
		i <- i + 1;
	FinMientras
	Escribir 'Son ', cpar,' numeros pares';
	Escribir 'Son ', cimpar, ' numeros impares';
FinProceso
