# Práctica 5. MÓDULOS.

## Resumen

<p style = "text-align: justify">
&nbsp;&nbsp;&nbsp;&nbsp;Se realizó elaboró una calculadora por medio de programación de arriba hacia abajo, creando procedimientos y funciones (a los que llamaremos métodos cuando tratemos programación orientada objetos).
</p>

## Desarrollo

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Se elaboró el cuerpo principal del programa, apoyándonos de un switch para elegir la operación a realizar y un do-while para mostrar el menú y salir del programa.
Se elaboró un módulo para aceptar los números con los cuales se realizarían las operaciones y además se codificaron los módulos (funciones) de cada una de las operaciones posibles a realizar (suma, resta, multiplicación y división), así como un procedimiento para la impresión de los resultados.
</p>

## Resultados

### &nbsp;&nbsp;&nbsp;&nbsp;CALCULADORA.

<p align="center">
    <img width = "581" height = "523" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p5/Imgs%20p5/Calculadora1.jpg">
</p>

<p align="center">
    <img width = "581" height = "496" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p5/Imgs%20p5/Calculadora2.jpg">
</p>

<p align="center">
    <img width = "581" height = "188" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p5/Imgs%20p5/Calculadora3.jpg">
</p>

## Discusión de Resultados.
<p style="text-align: justify;">
&nbsp;&nbsp;&nbsp;&nbsp;Se observó que para el módulo de solicitud de datos y los módulos de las operaciones matemáticas eran necesario utilizar funciones, ya que se requería que dichos módulos regresaran un valor, mientras que el módulo de impresión de resultados no requiere regresar ningún dato, por  lo que se utiliza un procedimiento, además que el uso de módulos representa una gran ventaja al hacer que se repita codificación de forma innecesaria.

A los módulos pueden introducírseles parámetros los cuales pueden ser dados por valor o por referencia, en el caso de Java, todos los datos primitivos se dan por valor, mientras que los objetos son por referencia, en este caso se utilizaron valores ya que los parámetros utilizados eran del tipo doublé, el cal es un dato primitivo.

## Conclusiones
-	Los módulos evitan la repetición innecesaria de código.
-	Las funciones regresan datos que necesitaremos durante el flujo del programa.
-	Los procedimientos realizan actividades que no requieren el regreso de información.
-	Hay que identificar la forma en la que queremos tratar los parámetros que introducimos en un módulo, para aplicarlos por valor o por referencia.
</p>