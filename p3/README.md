
# Práctica 3. ESTRUCTURAS DE CONTROL

## Resumen

<p style = "text-align: justify">
&nbsp;&nbsp;&nbsp;&nbsp;El control del flujo por medio de estructuras definidas es el principio de la programación estructurada, las cuales son el if, if-else, switch, while, do while y for en el caso de Java, también existen instrucciones auxiliares que ayudan a un mejor uso de dichas estructuras.

La estructura If es una estructura alternativa simple, en la que para entrar a un cierto bloque de instrucciones debe  cumplirse una condición, si dicha condición no se cumple el bloque de instrucciones no se ejecuta.

La estructura if-else es similar en su funcionamiento a la anterior, pero con la diferencia de que en esta, al no cumplirse la condición se ejecuta otro bloque alternativo de instrucciones.

Switch es una estructura de alternativa múltiple, que cuando existe un número mayor de posibilidades que pueda tomar una decisión, también se llevaran a cabo diferentes bloques de instrucciones respecto al valor que tome la decisión.

While es una estructura repetitiva (iterativa) en la cual una serie de instrucciones son repetidas mientras se cumpla una determinada condición, al iniciar la estructura se evalua la condición, si es verdadera se ejecutan las instrucciones dentro de la misma, si es falsa no entra a la estructura y continua a la instrucción siguiente. El bloque de instrucciones se ejecutará mientras la condición sea cumplida.

El caso del do while es similar al del while, pero en este caso el bloque de instrucciones se ejecuta por lo menos una vez y después se lleva a cabo la evaluación de la condición, mientras la condición sea verdadera el bloque de instrucciones seguirá ejecutándose.

La estructura for es una estructura iterativa en la cual se conoce el número de iteraciones que queremos realizar, en esta estructura se establecen desde su definición el valor de inicio de una variable, la condición que generlmente será el valor final que alcanzará la variable y un incremento de esta.

</p>

## Desarrollo

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Se realizaron diferente ejemplos del uso de cada una de las estructuras de control antes mencionadas, comenzamos con el If, estableciendo una variable booleana a la cual se le da el valor verdadero y muestra un par de mensajes que están dentro del If, y otro que se encuentra después de este, cuando se le asigna a la variable el valor falso, solo muestra el mensaje que se encuentra afuera del If, así mostrándonos su funcionamiento.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;En el caso del ejemplo realizado con el if-else de igual forma se creó una variable booleana para asignarle el valor de verdadero o falso en la decisión, se crearon los dos bloques de instrucciones, uno para el if y otro para el else, cuando a la variable se le asigna el valor de verdadero, se muestran en pantalla un par de mensajes que se encuentran dentro del if al ejecutarse el programa, mientras que si se le asigna el valor de falso se muestran los mensaje que se encuentran dentro del else.
</p>
<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Con el switch se hicieron dos ejemplos, uno donde se creó una variable que podía aceptar valores enteros y otro donde podía aceptar valores tipo char, para tomar la decisión, pero hemos visto que también pueden usarse variables de tipo String. Al asignarle un valor a la variable al ejecutarse el programa busca el valor asignado y ejecuta lo que se encuentra en el caso seleccionado, pero también todo lo que está después de esta, por lo que debemos apoyarnos de instrucciones auxiliares, en este caso del break, esta instrucción al encontrarla el programa lo que hace es interrumpir la iteración y sale de la estructura de control.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Para la estructura For, en el ejemplo realizado se declaró una variable contador y otra acumulador, en dicho ejemplo en cada iteración el contador se suma uno y el acumulador suma 2, llevando a cabo estos incrementos mientras que el valor de contador fuera menor a 5, cuando el valor del contador es 5, el bloque de instrucciones ya no se ejecuta.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Para el ejemplo de While se declararon un acumulador y un contador, inicializados en cero, mientras el acumulador fuera menor o igual a 10 el ciclo se seguiría ejecutando en cada iteración al contador se le agrega 1 y al acumulador se le suma el valor de 2, al ejecutarse el programa muestra el número de iteración y el valor del acumulador, hasta que este último obtiene el valor de 12 y al llegar a la condición esta no se cumple, deja de ejecutarse e imprime una frase que se encuentra fuera del while.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;En el do while también se declaran un acumulador y un contador, al igual que en while están inicializados en cero y se incrementan de igual forma, se obtiene el mismo resultado que en el while, pero podemos observar en su estructura que aquí primero se ejecuta el bloque de instrucciones y al final se evalúa la condición.
</p>

## Resultados

### &nbsp;&nbsp;&nbsp;&nbsp;EJERCICIOS

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 1.

<p align="center">
    <img width = "581" height = "201" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Uno.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 2.

<p align="center">
    <img width = "580" height = "188" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Dos.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 3.

<p align="center">
    <img width = "583" height = "175" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Tres.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 4.

<p align="center">
    <img width = "581" height = "202" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Cuatro.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 5.

<p align="center">
    <img width = "581" height = "244" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Cinco.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;ACTIVIDADES.
### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 1.

<p align="center">
    <img width = "582" height = "175" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Act5_Uno.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 2.

<p align="center">
    <img width = "581" height = "188" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Act5_Dos.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 3.

<p align="center">
    <img width = "581" height = "258" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Act5_Tres.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 4.

<p align="center">
    <img width = "581" height = "188" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Act5_Cuatro.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 5.

<p align="center">
    <img width = "583" height = "609" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Act5_Cinco.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 6.

<p align="center">
    <img width = "579" height = "579" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p3/Imgs%20p3/Act5_Seis.jpg">
</p>


## Discusión de Resultados
<p style="text-align: justify;">
&nbsp;&nbsp;&nbsp;&nbsp;Todos los problemas presentados fueron resueltos con ayuda de las estructuras de control que se vieron durante la práctica, se pudo observar que en algunos casos puede ser utilizada más de una de estas estructuras anidándolas una dentro de la otra, como en el caso del programa del promedio de las calificaciones donde tenemos varios ciclos If dentro del ciclo While o en contador de pares e impares, donde tenemos un If-Else dentro de un ciclo For.

También observamos que podemos intercambiar una estructura por otra, siempre y cuando conozcamos la bien el funcionamiento y sintaxis de ambas estructuras como logramos observar nuevamente en el programa del promedio, donde sustituimos las estructuras If que se encontraban dentro del While por un Switch, en este caso por detalles pequeños como lo puede ser el cambiar las comillas simples ( ‘ ), por las comillas dobles ( “ ), es motivo de error en la compilación, ya que es necesario hacer este cambio para que el Switch trabaje los casos con variables de tipo String. También lo vimos durante el desarrollo de la práctica al hacer los ejercicios de las estructuras While y Do-While, donde con diferente estructura se obtenía el mismo resultado, pero debemos ser cuidadosos en la implementación y entender correctamente el funcionamiento de ambas estructuras, así como la declaración de la condición.

En cuanto a la programación de las series numéricas de Fibonacci y Padovan, fue complejo entender determinar el algoritmo para determinar los números, pero una vez entendido, se buscó una estructura adecuada para llevar a cabo su codificación, en mi caso me decidí por un For ya que me pareció adecuado ya que teníamos claro desde donde iniciarían las iteraciones, hasta donde terminarían y el aumento del contador, aunque también se pudo utilizar una estructura While para llevar a cabo el trabajo.

## Conclusiones

-	La gran utilidad de las estructuras de control es que permiten llevar acciones repetitivas y de toma de decisiones.
-	Cualquier problema al que se le pueda hacer un algoritmo, puede ser solucionado con ayuda de las estructuras de control.
-	La sintaxis de las estructuras de control es de fácil entendimiento en Java.