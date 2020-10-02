SubProceso r <- aumCred ()
	Definir TT Como Entero;
	Definir r Como Real;
	Escribir '¿Cual es su tipo de tarjeta?';
	Leer TT;
	Segun TT  Hacer
		1:
			r <- 0.25;
		2:
			r <- 0.30;
		3:
			r <- 0.40;
		De Otro Modo:
			r <- 0.50;
	FinSegun
FinSubProceso

Proceso Problema3
	Definir AC,LA,NC Como Real;
	AC <- aumCred();
	Escribir 'Cual es su linea de  crédito?';
	Leer LA;
	NC <- LA+(LA*AC);
	Escribir 'Su nueva linea de crédito es de: $',NC;
FinProceso
