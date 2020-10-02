# PRÁCTICA 8. PROGRAMACIÓN ORIENTADA A OBJETOS.

## Resumen

<p style = "text-align: justify">
&nbsp;&nbsp;&nbsp;&nbsp;La programación orientada a objetos (POO), divide a los porogramas en partes que podrían tomarse como físicas, y así a cada una de las partes se encarga de tareas definidas para ella, en este caso se realizó una calculadora de números imaginarios, al pensar en una calculadora se analizaron las partes que la componen, siendo estás: la pantalla, el teclado y el procesador. Con la POO estas partes son llamadas objetos y por medio de clases le asignamos sus atributos y métodos. También podemos crear nuevos tipos de datos en una clase, se ralizó esto al crear el tipo de dato Complejo. Teniendo to esto en cuenta se crearon los métodos y se le asignaron los atributos requeridos a cada clase para que la calculadora funcionara correctamente.
</p>

## Desarrollo

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Se utilizó el IDE Eclipse para el desarrollo de está práctica por lo que se creó un package llamado pr8.Calculadora, donde se definirían las diferentes clases que se utilzarian para el desarrollo de la Calculadora. Se creó una clase principal para probar los cambios que iriamos realizando durante el desarrollo de la calculdora y para fianlmente invocar al objeto calculadora que sería el principal objetivo, después procedimos a crear el tipo de dato Complejo, se definió la clase Complejo donde se le asignaron sus atributos y sus métodos para asignación y llamado.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Después se definió la clase pantalla para tener un método que imprimiera los resultados de las operaciones obtenidas, ya que estos resultados son números complejos. También es estableció el objeto teclado en la clase que lleva ese nombre, ésta clase se encarga de capturar los datos que usuario introduce, por lo que se definieron métodos de captura de dato de las partes reales e imaginarias de los números complejos y el operador a utilizar. Con la creación del objeto Procesador terminariamos las partes que componen nuestra calculadora, el procesador es el que se encarga de llevar a cabo las operaciones con los datos introducidos por el usuario, por lo que cada una de estás operaciones representa un método definido dentro de estaa clase.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Lo siguiente fue la integraciones de los diferentes objetos en el objeto Calculadora, por lo que cada uno de estos objetos se definio como atributo dentro del objeto Calculadora. Al definirse el método on, que bien es una analogía al encendido de una calculadora física, se invocan dentro de este los metodos de los distintos objetos para que lleven a cabo las tareas que les han sido asignadas en momento adecuado, al estar terminada la integración, en la clase principal se define una calculadora y se hace la invocación del método on iniciando así el funcionamiento del programa completo.</p>

## Resultados

### &nbsp;&nbsp;&nbsp;&nbsp;CALCULADORA

<p align="center">
    <img width = "632" height = "724" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p8/Imgs%20p8/Calculadora.jpg">
</p>

## Discusión de Resultados
<p style="text-align: justify;">
&nbsp;&nbsp;&nbsp;&nbsp;Como resultado tuvimos un programa funcional, pero al observar el funcionamiento del switch para salir del programa, primero tendríamos que introducir todos los datos de una operación para poder apagar la calculadora, por lo que también se probó que una modificación que si al recibir un operador igual 5, se apagara la calculadora y además también se jugó con la  cancelación de la operación, pero solo se dejó este código como comentario. También se modifico el método imprimirComplejo para que al ser la parte imaginaria del número negativa, no aparezca como r + -xi y solo aparezca como r -xi.
</p>

## Conclusiones
<p style="text-align: justify;">

- La POO es una forma de elaborar programas más parecido a la realidad.
- Se pueden crear tipos de datos nuevos que nos faciliten la programación.
- Con la POO se puede facilitar la realización de programas que en casos de programación estructurada serían muy complejos.

</p>
