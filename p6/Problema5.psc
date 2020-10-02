Proceso Problema6
	Definir V,T1,T2,T3,TT Como Real;
	Definir A,B,C,N,CN Como Entero;
	TT <- 0;
	N <- 0;
	CN <- 0;
	A <- 0;
	B <- 0;
	C <- 0;
	T1 <- 0;
	T2 <- 0;
	T3 <- 0;
	V <- 0;
	Escribir 'Introduzca el número de ventas del día';
	Repetir
		Leer N;
	Hasta Que N>0
	Mientras CN<N Hacer
		Escribir 'Introduzca monto de venta';
		Leer V;
		Mientras V<=0 Hacer
			Escribir 'Cantidad invalida';
			Leer V;
		FinMientras
		TT <- TT+V;
		Si V>1000 Entonces
			A <- A+1;
			T1 <- T1+V;
		SiNo
			Si v>500 Entonces
				B <- B+1;
				T2 <- T2+V;
			SiNo
				C <- C+1;
				T3 <- T3+V;
			FinSi
		FinSi
		CN <- CN+1;
	FinMientras
	Escribir 'El número de ventas es: ', CN;
	Escribir 'La venta total es de: $', TT;
	Escribir 'El total de ventas tipo A es: $', T1,' con ',A,' ventas';
	Escribir 'El total de ventas tipo B es: S', T2,' con ', B,' ventas';
	Escribir 'El total de ventas tipo C es: S', T3,' con ',C,' ventas';
FinProceso
