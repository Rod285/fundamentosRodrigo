Proceso Ej9
	Definir i, n, num, min, max, aux Como Entero;
	i <- 0;
	min <- 999999999;
	max <- 0;
	Escribir '�Cuantos n�meros introducir�?';
	Leer n;
	Mientras i<n Hacer
		Escribir 'Introduzca n�mero';
		Leer num;
		Si num > max Entonces
			max <- num;
		FinSi
		Si num < min Entonces
			min <- num;
		FinSi
		i <- i + 1;
	FinMientras
	Escribir 'El m�ximo es ',max;
	Escribir 'El m�nimo es ',min;
FinProceso
