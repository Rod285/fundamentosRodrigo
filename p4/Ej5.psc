Proceso Ej5
	Definir acum,num,i,n Como Entero;
	Definir r Como Real;
	acum <- 0;
	r <- 0;
	Escribir '¿Cuantos numeros quiere sumar?';
	Leer n;
	Para i<-1 Hasta n Hacer
		Escribir 'Introduzca número ';
		Leer num;
		acum <- acum+num;
	FinPara
	r <- acum/n;
	Escribir 'El promedio es ',r;
FinProceso
