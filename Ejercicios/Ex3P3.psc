Proceso Ex3P3
	Definir repetidos, indA, indAux Como Entero;
	Definir estaRepetido Como Logico;
	Definir arrA Como Entero;
	Dimension arrA[13];
	Definir arrAreps Como Entero;
	Dimension arrAreps[13];
	
	Para indAux<-0 Hasta 12 Hacer
		arrAreps[indAux] <- 0;
	FinPara
	
	arrA[0] <- 1;
	arrA[1] <- 3;
	arrA[2] <- 2;
	arrA[3] <- 3;
	arrA[4] <- 4;
	arrA[5] <- 8;
	arrA[6] <- 5;
	arrA[7] <- 6;
	arrA[8] <- 1;
	arrA[9] <- 7;
	arrA[10] <- 8;
	arrA[11] <- 9;
	arrA[12] <- 1;
	
	indAux <- 0;
	indA <- 0;
	repetidos <- 0;
	
	para indA<-0 hasta 12 hacer
		si( arrA[indA]>0 ) entonces
			estaRepetido <- falso;
			para indAux<-indA+1 hasta 12 hacer
				si( arrA[indA] = arrA[indAux] )entonces
					estaRepetido <- verdadero;
					arrA[indAux] <- 0;
				FinSi
			FinPara
			si( estaRepetido ) Entonces
				arrAreps[repetidos] <- arrA[indA];
				repetidos <- repetidos + 1;
			FinSi
		FinSi
	FinPara
	
	indAux <- 0;
	
	Escribir 'Repetidos = ', repetidos;
	
	Para indAux <- 0 Hasta 11 Hacer
		Escribir arrAreps[indAux];
	FinPara	
	
FinProceso
