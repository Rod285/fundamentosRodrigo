Proceso ordenaArrBurbuja
	// JRMV Grupo CB01
	Definir mayr,n,elem,ind,arr Como Entero;
	Dimension arr[10];
	arr[0] <- 5;
	arr[1] <- 3;
	arr[2] <- 4;
	arr[3] <- 2;
	arr[4] <- 9;
	arr[5] <- 1;
	arr[6] <- 0;
	arr[7] <- 7;
	arr[8] <- 6;
	arr[9] <- 8;
	n <- 10;
	mayr <- 0;
	Para elem<-n-1 Hasta 1 Con Paso -1 Hacer
		mayr <- arr[0];
		Para ind<-1 Hasta elem Hacer
			Si (mayr<arr[ind]) Entonces
				arr[ind-1]<-arr[ind];
			SiNo
				mayr <- arr[ind];
			FinSi
			arr[ind] <- mayr;
		FinPara
	FinPara
FinProceso
