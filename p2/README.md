
# Práctica 2. PROGRAMACIÓN BÁSICA EN JAVA

## Resumen

<p style = "text-align: justify">
&nbsp;&nbsp;&nbsp;&nbsp;En la práctica se realizó el estudio de la programación en Java, donde aprendimos que dicho lenguaje de programación es de alto nivel y nos permite la programación en distintos paradigmas de programación como el secuencial, estructurada, modular y principalmente ha sido creado para el paradigma de programación orientada objetos, paradigma al cual no hemos entrado aún en este trabajo, así como la estructura básica para crear una clase.
Analizamos también los tipos de datos básicos con los que podemos trabajar en Java a los cuales se les conoce como primitivos, como los numero enteros, los caracteres individuales, números reales y cadenas de caracteres entre otros. A su vez, también incluimos el tipo de interacciones que podemos llevar a cabo con dichos tipos de datos, como lo pueden ser las operaciones aritméticas y lógicas.
</p>

## Desarrollo

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Lo primero que realizamos fue el estudio de las instrucciones, las cuales pueden ser de asignación, lectura o escritura. Las instrucciones de asignación como dice su nombre asignan valores a una variable o constante, las constantes tendrán un valor que no cambiará y será asignado desde el principio y las variables podrán cambiar su valor a lo largo del programa, pero también pueden ser inicializadas, en Java debemos especificarle el tipo de dato que contendrán las variables y constantes.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;El trabajar con variables numéricas vimos que existen diferentes tipos de estas, principalmente dividiéndose en naturales y reales, por lo que debemos tener en cuenta que tipo de dato manejará nuestra variable o constante además de que tienen diferentes capacidades de almacenamiento y rango de trabajo, por ejemplo una variable o constante de tipo byte tendrá una medida de 8 bites y su rango de trabajo va desde los valores -128 a 127, mientras que una variable de tipo short tiene un tamaño de 16 bits y su rango de valores va del -32,768 al 32,767. En e caso de los número reales vimos que existen dos tipos en Java, el float y el double, que el double es el  tipo asignado a los reales por defecto en este lenguaje de programación, mientras el tamaño del float es de 32 bits, el double es de 64 y los rangos son muy amplios.
</p>
<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Los identificadores vimos, que son los nombres que les damos a las variables y las constantes y existen reglas básicas para crearlos las cuales son:

-	Su longitud no tiene límite.
-	Puede iniciar con una letra mayúscula o minúscula, el símbolo de pesos ($) o un guion bajo.
-	Puede incluir números, pero no al principio.
-	Puede incluir guion bajo en cualquier posición.
-	No se pueden incluir caracteres especiales (#, &, %, ;, :, (, [, }, *, ^, ¡, /, ).
-	No se pueden utilizar palabras reservadas para el lenguaje.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Diferenciamos entre las variables locales y las variables globales, las variables locales solo pueden ser vistas desde su método, mientras que a las globales, se puede acceder desde cualquier método del programa. En el caso de las constantes se utilizan las palabras clave static y final para diferenciar que son constantes además de que se escriben sus nombre en mayúsculas.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Las instrucciones de lectura son instrucciones en las cuales el programa lee un dato que le introduce el usuario y a su vez dicho valor es asignado a una variable, vimos que en Java para llevar a cabo estas instrucciones necesitamos de la clase Scanner la cual la obtenemos de un paquete de clases llamado java.util.Scanner. Para utilizar los métodos de la clase Scanner necesitamos asignar una variable de tipo Scanner para poder llevar a cabo la lectura de los datos que introduce el usuario.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Las instrucciones de escritura son las que dan al programa una salida de información para el usuario, puede ser la creación o modificación de un archivo o el envío de un mensaje al usuario por medio de la pantalla del equipo, utilizamos el método println de Java el cual pertenece a la clase System, este método imprime cadenas de caracteres determinadas y se les puede asociar una variable por medio del símbolo +.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Observamos las expresiones que pueden ser utilizadas en java las cuales pueden ser aritméticas de las cuales el resultado será un número, relacionales y lógicas de las cuales obtendremos valores booleanos.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Se advirtió que los operadores matemáticos tienen un orden de precedencia y que es muy importante poner atención a estos ya que pueden modificar en gran manera el funcionamiento del programa, por lo que se remarcó la importancia de los paréntesis para el uso adecuado de estos operadores.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Vimos el uso de una estructura de control, la selección condicional simple o if-else en Java. En esta estructura se presenta una condición teniendo dos vertientes una cuando la condición se cumple y otra cuando no, cuando se cumple se dice que la condición es verdadera y el flujo de programa sigue por esa rama y se realizan las instrucciones de dicha rama, cuando no se cumple, se dice que es falsa y el flujo del programa sigue por ese camino, realizando las instrucciones que existen en este.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;También observamos el uso de funciones matemáticas, como Math.sqrt(); la cual está se encuentra en la clase Math y nos da el valor de la raíz cuadrada de un numero dado, existen más funciones de este tipo pero las veremos más adelante.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;También analizamos el tipo de variable String el cual permite almacenar cadenas de caracteres, pero en Java se encuentra predefinida la clase String, por lo que nosotros al declarar una variable String, en realidad estamos creando un objeto de tipo String al cual podemos aplicarle distintos métodos incluidos dentro de la Clase String.
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Con todo lo que vimos en la clase se nos dieron varios ejercicios para resolverlos con lo visto en la práctica y se obtuvieron los siguientes resultados.
</p>

## Resultados

### &nbsp;&nbsp;&nbsp;&nbsp;EJERCICIOS

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 1.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Uno.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 2.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Dos.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 3.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Tres.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 4.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Cuatro.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 5.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Cinco.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 6.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Seis_r.jpg">
</p>

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Seis_i.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;ACTIVIDADES.
### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 1.

<p align="center">
    <img width = "581" height = "215" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Act5_Uno.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 2.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Act5_Dos.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 3.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Act5_Tres.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 4.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Act5_Cuatro.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 5.

<p align="center">
    <img width = "581" height = "187" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Act5_Cinco.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Actividad 6.

<p align="center">
    <img width = "581" height = "299" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p2/Imgs%20p2/Act5_Seis.jpg">
</p>


## Discusión
<p style="text-align: justify;">
&nbsp;&nbsp;&nbsp;&nbsp;Durante la codificación de los programas se aplicaron los conocimientos adquiridos en clase no sin cometer algunos errores, como los castings automáticos que hace el compilador si no tenemos claro como asignamos el tipo de variable, se utilizaron otras estructuras de control de flujo que se vieron durante la semana como los siglos for y while, ya que nos es insuficiente la estructura if para realizar todos los ejercicios.

Se investigó un poco más acerca del uso del String, ya que se puede acceder a cada posición de la cadena de caracteres individualmente indicándole su posición los cual fue de utilidad en algunos ejercicios.

Los trabajos realizados fueron bajo los paradigmas de programación imperativa y estructurada, aunque durante la semana se vio en clase el tipo modular, no se realizaron ningún ejercicio con este paradigma, pero se observó que habría algunos de ellos en los que valdría la pena intentar codificarlos de esa forma y esto podría hacerlos menos enredados.
 
Las estructuras de control facilitan el flujo de los programas ya que estas las permitirnos hacer ciclos de operaciones nos permiten no tener que repetir instrucciones, solo hay que tener clara la idea de su implementación y la lógica de las condiciones que deseemos utilizar.

## Conclusiones
-	Se debe utilizar correctamente la estructura principal de los programas.
-	Es importante saber la correcta asignación de los tipos de variables.
-	Debemos saber el orden de precedencia de los operadores matemáticos y el correcto uso de paréntesis.
-	Debemos entender correctamente el funcionamiento de las expresiones lógicas para poder utilizar adecuadamente las estructuras de control.
-	La adecuada implementación de las estructuras de control facilitan y mejoran el flujo de los programas.

</p>
