Proceso Ej9
	Definir i, n, num, min, max, aux Como Entero;
	i <- 0;
	min <- 999999999;
	max <- 0;
	Escribir '¿Cuantos números introducirá?';
	Leer n;
	Mientras i<n Hacer
		Escribir 'Introduzca número';
		Leer num;
		Si num > max Entonces
			max <- num;
		FinSi
		Si num < min Entonces
			min <- num;
		FinSi
		i <- i + 1;
	FinMientras
	Escribir 'El máximo es ',max;
	Escribir 'El mínimo es ',min;
FinProceso
