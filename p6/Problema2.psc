SubProceso r <- cargo (TO)
	Definir TP Como Caracter;
	Definir r,CA Como Real;
	Escribir '¿Cual es su tipo de pago? E = Efectivo, T = Tarjeta';
	Leer TP;
	Si (TP='E') Entonces
		r <- 0;
		r <- TO;
	SiNo
		Mientras TP!='T' Hacer
			Escribir 'Opción invalida';
			Leer TP;
		FinMientras
		CA <- 0.05;
		r <- TO+(TO*CA);
	FinSi
FinSubProceso

SubProceso r <- costo (PA)
	Definir N Como Entero;
	Definir r Como Real;
	Escribir '¿Cuantas hamburguesas desea?';
	Leer N;
	r <- PA*N;
FinSubProceso

SubProceso r <- tipoHamb ()
	Definir r Como Entero;
	Definir TI Como Caracter;
	Repetir
		Escribir '¿Qué tipo de hamburguesa desea? S = Sencilla, D = Doble, T = Triple';
		Leer TI;
		Segun TI  Hacer
			'S':
				r <- 20;
			'D':
				r <- 25;
			'T':
				r <- 28;
			De Otro Modo:
				Escribir 'Opcion no valida';
				r <- 0;
		FinSegun
	Hasta Que r!=0
FinSubProceso

Proceso Problema2
	Definir PA,CA,TO,TOT Como Real;
	Definir N Como Entero;
	PA <- tipoHamb;
	TO <- costo(PA);
	TOT <- cargo(TO);
	Escribir 'El costo total es: ',TOT;
FinProceso
