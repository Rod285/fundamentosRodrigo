Proceso arreglos
	Definir arr,arr2,arr3,i,fil,col,pla Como Entero;
	Dimension arr[2];
	Dimension arr2[2,3];
	Dimension arr3[3,3,2];
	Para i<-0 Hasta 1 Hacer
		arr[i] <- 0;
	FinPara
	Para fil<-0 Hasta 1 Hacer
		Para col<-0 Hasta 2 Hacer
			arr2[fil,col]<-0;
		FinPara
	FinPara
	Para pla<-0 Hasta 1 Hacer
		Para fil<-0 Hasta 2 Hacer
			Para col<-0 Hasta 2 Hacer
				arr3[fil,col,pla]<-0;
			FinPara
		FinPara
	FinPara
	Para pla<-0 Hasta 1 Hacer
		Para fil<-0 Hasta 2 Hacer
			Para col<-0 Hasta 2 Hacer
				Escribir arr3[fil,col,pla];
			FinPara
		FinPara
	FinPara
FinProceso
