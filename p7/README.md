
# PRÁCTICA 7. ARREGLOS

## Resumen

<p style = "text-align: justify">
&nbsp;&nbsp;&nbsp;&nbsp;Se analizaron las estructuras de datos conocidos como arreglos, estas estructuras nos permiten almaenar conjuntos de datos de un mismo tipo, en java pueden trabajarse arreglos de una, dos o tres dimensiones.

Debemos seguir una nomenclatura para su declaración, sien do esta:

    - Tipo_de_variable[] nombreArreglo = new Tipo_de_variable[n];

&nbsp;&nbsp;&nbsp;&nbsp;Siendo n la dimensión del arreglo. Los arreglos en java comiensan con la posición cero, por lo que si el arreglo tiene una dimensión de 10 posiciones, las posiciones estaran nueradas del 0 al 9.

&nbsp;&nbsp;&nbsp;&nbsp;Se vieron las operaciones básicas con los arreglos, las cuales son la escritura, la lectura, actualización de los arreglos, la inicialización y recorrido.
</p>

## Desarrollo

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;El primer paso que realizamos fue crear un arreglo unidimensional al cual se le dió una dimensión n, ya estando declarado por medio de la nomenclatura ya mencionada, procedimos a  inicializarlo, para llevar a cabo esto hicimos uso de una estructura for la cual inicia con un contador en la posición inicial, en el pseudocódigo con pseint inicia en uno y en java inicia en cero, hasta la loongitud total del arreglo en el caso de pseudocódigo es hasta n y en java mientras sea menor a n, con aumentos de una unidad y escribiendo u asignando en cada posición un valor aleatorio entre el 1 y 10. Al estar completada la inicialización del arreglo hicimos un recorrido e impresión de los datos almacenados dentro del arreglo, para verificar que el arreglo había sido inicializado correctamente.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Lo segundo que realizamos fue un arreglo bidimensional, en este caso utilizamos los terminos filas y columnas, observamos que debemos tener cuidado en el orden con el que escribimos y leemos dentro del arreglo para acceder correctamente a los datos. Para la inicialización y el recorrido dentro de este arreglo tambien hicimos uso de estructuras for anidadas donde primero llenariamos primero los espacios que compondrían las columnas fila por fila. Después declaramos un arreglo tridimensional definiendo columnas, filas y planos, como con el anterior tuvimos que tener claro como ordenar las estructuras for anidadas en primera opción hicimos que se llenaran primero las columnas, después las filas y por ultimo los planos, pero tambien se vió que podría inicializarse y recorrerse de diferentes formas siempre y cuando tenngamos claro el como queremos acceder a las posiciones dentro del arreglo. Tanto en el arreglo de dos dimensiones como en el de tres, se llevó a cabo una impresión del arreglo para observar eque el arreglo hubiera sido inicializado correctamente.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Al tener más claro la inicialización y el recorrido de los arreglos procedimos a realizar un algoritmo de busqueda, en este caso fue el método secuencial, por lo que nos valimos de una estructura for por la que se recorre cada posición del arreglo y se compara el valor de esta con un valor dado por el usuario y al encontrar un valor igual a ese dato, el programa nos informa que el número buscado si se encuentra en el arreglo.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Teniendo el algoritmo de busqueda, procedimos a hacer un algoritmo de ordenación, utilizariamos un arreglo auxiliar para almacenar los datos ordenados, en este caso hicimos uso de módulos, un modulo para inicializar el arreglo, otro para imprimir los arreglos y otro para ordenarlo, para ordenar el arreglo los que se hizo fue llevar a cabo recorridos, en cada uno de estos se ubica al valor de mayor tamaño y este es copiado al arreglo auxiliar en la primera posición, los posición en la que se encuentra dicho valor es actualizada a cero, así hasta que el arreglo auxiliar queda lleno y ordenado. Para hacer esto se hizo uso de estructuras for anidadas, también estructuras if y haciendose uso del algotimo de busqueda para actualizar el valor de las posiciones del arreglo original a cero. </p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Quedó como trabajo para nosotros el terminar un juego del gato, debiamos actualizar los módulos preexistentes, en mi caso definí dos módulos nuevos más uno para determinar el ganador y otro para validar el tiro y así no se pueda tirar sobre la posición que alguno de los jugadores ya había utilizado, tambien se terminó el módulo que analiza si alguno de los dos jugadores (usuario o CPU) había ganador.</p>

## Resultados

### &nbsp;&nbsp;&nbsp;&nbsp;EJERCICIOS

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 1.

<p align="center">
    <img width = "1153" height = "592" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p7/Imgs%20p7/Ej1.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 2.

<p align="center">
    <img width = "644" height = "229" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p7/Imgs%20p7/Ej2.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 3.

<p align="center">
    <img width = "1051" height = "117" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p7/Imgs%20p7/Ej3.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Ejercicio 4.

<p align="center">
    <img width = "463" height = "665" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p7/Imgs%20p7/Ej4_1.jpg">
</p>

<p align="center">
    <img width = "461" height = "188" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p7/Imgs%20p7/Ej4_2.jpg">
</p>

## Discusión de Resultados
<p style="text-align: justify;">
&nbsp;&nbsp;&nbsp;&nbsp;En cuanto a los resultados de los algotimos de recorrido y busqueda se desarrollaron con relativa sencilles, sobre todo cuando se trabajó en arreglos unidimensionales, pero al trabajar en dos y principalmente en tres dimensiones tenemos que poner gran cuidado al modo de acceder a las posiciones del arreglo.
</p>

<p style="text-align: justify;">
&nbsp;&nbsp;&nbsp;&nbsp;En lo que respecta a la ordenación se encontró un poco más de problematica al querer actualizar los valores mayores a cero, debido a que al encontrarse no podía hacerse directamente, si no que se tuvo que encontrar el valor mayor copiarlo a una variable auxiliar, despues volverlo a buscar e igualar esa posición del arreglo a cero y finalmente copiar el valor de la variable auxiliar al arreglo ordenado.
</p>

<p style="text-align: justify;">
&nbsp;&nbsp;&nbsp;&nbsp;Al realizar las modificaciones del juego del gato se encontraron ciertas dificultades, en primera encontrar la forma en la que se valida el tiro para que no se pueda tirar dos veces en una misma posición, para lo cual definí una función que le dice al módulo juegaUsuario o juegaCPU si la posición esta ocupada y de ser así, le solicita el tiro nuevamente al Usuario o al CPU, también se tuvo que analizar cuando el usuario o la CPU era el ganador, lo cual se modificó el módulo analiza haciendo que a partir del tercer tiro de cada jugador analize si hay 3 caracteres iguales en línea de forma horizontal, vertical o diagonal y le informa a otra función que definí como ganador si se cumple algunas de dichas opciones y si es así despliega quíen es el ganador. Posiblemente lo más sencillo fue hacer que la CPU hiciera tiros aletorios, lo cual se solucionó haciendo que en el módulo juegaCPU en su tiro use la función Math.random para números de 0 a 2.
</p>

## Conclusiones
<p style="text-align: justify;">

- Los arreglos son estrcuturas que al ser bien entendidas nos ayudan a almacenar información de forma ordenada.
- Con el uso adecuado de arreglos el acceso a los datos es muy rápida.
- Entre mayor es el número de dimensiones de un arreglo es mayor la complejidad de manejo, pero tambien aumenta el número de posibilidades de inter-relacionear los datos  contenidos.
</p>