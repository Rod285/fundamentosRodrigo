SubProceso r <- solicitaDato(ltr)
	Definir r Como Real;
	Escribir 'Introduzca lado ',ltr;
	Leer r;
FinSubProceso

SubProceso r <- precio (area)
	Definir r, c Como Real;
	Escribir 'Introduzca Precio por metro cuadrado';
	Leer c;
	r <- area*c;
FinSubProceso

SubProceso r <- areaTotal (l1,l2,l3)
	Definir r,atr,ac Como Real;
	atr <- ((l1-l3)*l2)/2;
	ac <- l2*l3;
	r <- atr+ac;
FinSubProceso

Proceso Problema1
	Definir a,b,c,at,costo Como Real;
	Definir car Como Caracter;
	car <- 'A';
	a <- solicitaDato(car);
	car <- 'B';
	b <- solicitaDato(car);
	car <- 'C';
	c <- solicitaDato(car);
	at <- areaTotal(a,b,c);
	Escribir 'área Total = ',at;
	costo <- precio(at);
	Escribir 'El costo del terreno es: $',costo;
FinProceso