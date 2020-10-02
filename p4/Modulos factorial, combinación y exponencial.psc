SubProceso r <- factorial (x)
	Definir r Como Real;
	Definir i Como Entero;
	Para i<-i Hasta x Hacer
		r <- r*i;
	FinPara
FinSubProceso

SubProceso r <- combinacion (n,k)
	Definir r Como Real;
	r <- factorial(n)/(factorial(k)*factorial((n-k)));
FinSubProceso

SubProceso r <- expo (x)
	Definir r Como Real;
	Para i<-0 Hasta 50 Hacer
		r <- r+((x^i)/factorial(i));
	FinPara
FinSubProceso

Proceso Calculadora
	
FinProceso
