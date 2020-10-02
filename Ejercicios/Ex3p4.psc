Proceso Ex3P4
	Definir mtz1 Como Entero;
	Dimension mtz1[3,3];
	Definir mtz2 Como Entero;
	Dimension mtz2[3,3];
	Definir fil, col Como Entero; 
	
	fil <- 0;
	col <- 0;
	
	para fil <- 0 hasta 2 hacer
		para col <- 0 hasta 2 hacer
			mtz1[col,fil] <- azar(100);
		FinPara
	FinPara
	
	para fil <- 0 hasta 2 hacer
		para col <- 0 hasta 2 hacer
			Escribir mtz1[col,fil];
		FinPara
	FinPara
	
	para fil <- 0 hasta 2 hacer
		para col <- 0 hasta 2 hacer
			mtz2[col,fil] <- 0;
		FinPara
	FinPara
	
	para fil <- 0 hasta 2 hacer
		para col <- 0 hasta 2 hacer
			mtz2[col,fil] <- mtz1[fil,col];
		FinPara
	FinPara
	
	para fil <- 0 hasta 2 hacer
		para col <- 0 hasta 2 hacer
			Escribir mtz2[col,fil];
		FinPara
	FinPara
FinProceso
