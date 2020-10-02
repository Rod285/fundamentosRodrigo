Proceso Ex3P2
	Definir arr1 Como Entero;
	Dimension arr1[7];
	Definir arr2 Como Entero;
	Dimension arr2[5];
	Definir arr3 Como Entero;
	Dimension arr3[12];
	Definir ind1, ind2, ind3 Como Entero;
	
	ind1 <- 0;
	ind2 <- 0;
	ind3 <- 0;

	arr1[0] <- 1;
	arr1[1] <- 4;
	arr1[2] <- 7;
	arr1[3] <- 10;
	arr1[4] <- 46;
	arr1[5] <- 49;
	arr1[6] <- 102;
	
	arr2[0] <- 1;
	arr2[1] <- 2;
	arr2[2] <- 3;
	arr2[3] <- 4;
	arr2[4] <- 5;
	
	mientras( (ind1 < 7) Y (ind2 < 5) ) hacer
		si( arr1[ind1]<arr2[ind2] ) entonces
			arr3[ind3] <- arr1[ind1];
			ind1 <- ind1 + 1;
		SiNo
			arr3[ind3] <- arr2[ind2];
			ind2 <- ind2 + 1;
		FinSi
			ind3 <- ind3 + 1;
	FinMientras
		
	si( ind1<7 )entonces
		mientras( ind1<7 ) hacer
			arr3[ind3] <- arr1[ind1];
			ind1 <- ind1 + 1;
			ind3 <- ind3 + 1;
		FinMientras
	FinSi
	
	si( ind2<5 )entonces
		mientras( ind2<5 ) hacer
			arr3[ind3] <- arr2[ind2];
			ind2 <- ind2 + 1;
			ind3 <- ind3 + 1;
		FinMientras
	FinSi
			
	ind3 <- 0;
			
	Para ind3 <- 0 Hasta 11 Hacer
			Escribir arr3[ind3];
	FinPara	
		
FinProceso
