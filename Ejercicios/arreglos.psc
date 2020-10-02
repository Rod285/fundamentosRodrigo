Proceso Arreglos
	Definir arr Como Entero;
	Dimension arr[50];
	Definir ind Como Entero;
	Definir x Como Entero;
	Definir esta Como Logico;
	Para ind<-0 Hasta 49 Hacer
		arr[ind] <- azar(100);
	FinPara
	Escribir 'x= ';
	Leer x;
	esta <- Falso;
	Para ind<-0 Hasta 49 Hacer
		Si arr[ind]=x Entonces
			esta <- Verdadero;
			ind <- 50;
		FinSi
	FinPara
	Escribir 'esta = ',esta;
FinProceso