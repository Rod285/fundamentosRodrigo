Proceso Ej10
	Definir a, b, mcd como Enteros;
	Escribir 'Introduzca numerador';
	Leer a;
	Escribir 'Introduzca denominador';
	Leer b;
	Mientras a > 0 Hacer
		mcd <- a;
		a <- b mod a;
		b <- mcd;
	FinMientras
	Escribir 'El MCD es ', mcd;
FinProceso
