Proceso Pseudocódigo
	Definir i, arr, arrp, arrimp, p, imp, indp, indimp Como Entero;
	Dimension arr[10];
	Dimension arrp[10];
	Dimension arrimp[10];
	p <- 0;
	imp <- 0;
	indp <- 0;
	indimp <- 0;
	
	Para i <- 0 Hasta 9 Hacer
		arr[i] <- azar(100)+1;
	FinPara
	
	Para i <- 0 Hasta 9 Hacer
		Escribir arr[i];
	FinPara
	
	Para i <- 0 Hasta 9 Hacer
		arrp[i] <- 0;
	FinPara
	
	Para i <- 0 Hasta 9 Hacer
		arrimp[i] <- 0;
	FinPara
	
	para i <- 0 Hasta 9 Hacer
		Si(arr[i] mod 2 = 0) Entonces
			p = p + 1;
			arrp[indp] <- arr[i];
			indp = indp + 1; 
		SiNo
			imp = imp + 1;
			arrimp[indimp] <- arr[i];
			indimp <- indimp + 1;
		FinSi
	FinPara
	
	Escribir "Pares = ", p;
	
	Para i <- 0 Hasta 9 Hacer
		Escribir arrp[i];
	FinPara
	
	Escribir "Impares = ", imp;
	
	Para i <- 0 Hasta 9 Hacer
		Escribir arrimp[i];
	FinPara
FinProceso
