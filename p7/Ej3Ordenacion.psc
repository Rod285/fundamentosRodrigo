SubProceso arrOrd <- Ordena (arr)
	Definir arrOrd,may Como Entero;
	Dimension arrOrd[50];
	Definir i,j,k Como Entero;
	i <- 0;
	j <- 0;
	k <- 0;
	may <- 0;
	Para k<-0 Hasta 49 Hacer
		may <- 0;
		Para j<-0 Hasta 49 Hacer
			Para i<-0 Hasta 49 Hacer
				Si arr[i]>may Entonces
					may <- arr[i];
				FinSi
			FinPara
			Si arr[j]=may Entonces
				arr[j] <- 0;
				j <- 49;
			FinSi
		FinPara
		arrOrd[k] <- may;
		Escribir arrOrd[k];
	FinPara
FinSubProceso

Proceso Ordarreglo
	Definir arr,arrOrd,i Como Entero;
	Dimension arr[50];
	Para i<-0 Hasta 49 Hacer
		arr[i] <- azar(100);
		Escribir arr[i];
	FinPara
	arrOrd <- Ordena(arr);
FinProceso
