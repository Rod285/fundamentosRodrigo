Proceso Problema4
	Definir M,CA Como Entero;
	Definir AH Como Real;
	CA <- 0;
	M <- 0;
	Repetir
		M <- M+1;
		Escribir 'Introduzca cantidad a depositar en el mes ',M;
		Leer AH;
		CA <- CA+AH;
		Escribir 'El ahorro al mes ',M,' será: ',CA;
	Hasta Que M=12
FinProceso
