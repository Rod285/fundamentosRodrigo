Proceso Ex3P1
	Definir arr Como Entero;
	Dimension arr[50];
	Definir arr2 Como Entero;
	Dimension arr2[50];
	Definir i Como Entero;
	
	Para i <- 0 Hasta 49 Hacer
		arr[i] <- azar(100);
	FinPara
	
	Para i<-0 hasta 50-1 hacer
		arr2[i] <- arr[50-1-i];
	FinPara
	
	Para i <- 0 Hasta 49 Hacer
		Escribir arr[i];
	FinPara
	
	Para i <- 0 Hasta 49 Hacer
		Escribir arr2[i];
	FinPara
	
FinProceso
