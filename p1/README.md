
# Práctica 1. Ambiente de Desarrollo

## Resumen

<p style = "text-align: justify">
&nbsp;&nbsp;&nbsp;&nbsp;En esta práctica se analizó el ambiente de desarrollo por medio de las aplicaciones Visual Studio Code, Git, Github y el Kit de Desarrollo de Java (JDK). Se señalaron las diferencias entre Git y Github siendo el primero un software que nos ayuda a controlar las versiones que se guardan en las diferentes etapas del desarrollo de un proyecto y el segundo una plataforma para almacenamiento de la nube y trabajo colaborativo de proyectos. También trabajamos en el uso conjunto de dichas herramientas para el desarrollo de aplicaciones sencillas como el programa Hola Mundo, la trasformación de °C a °F o el cálculo del salario de un trabajador a partir de sus horas trabajadas, obteniendo programas que solucionan sus respectivos problemas y sus repositorios en el equipo y en GitHub.
</p>

## Desarrollo

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Para realizar las actividades de la práctica tuvimos que instalar las herramientas necesarias para llevarla a cabo, y lo primero que tuvimos que hacer fue identificar el sistema operativo que utilizamos, en mi caso es Windows, por lo que debía descargar e instalar las versiones para Windows de Visual Studio Code (VSC), Git y el Kit de Desarrollo de Java (JDK por sus siglas en inglés), GitHub es una plataforma en línea, por lo que no hubo que descargar ningún software adicional para éste.
Ya teniendo instaladas las herramientas necesarias, continuamos a comprobar el funcionamiento del compilador de Java en mi caso desde el Shell de Git Bash y tuve que modificar las variables de entorno introduciendo el Path de instalación del JDK, quedando así listo para poder trabajar.</p>

<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Confirmado el funcionamiento del compilador de Java, por medio del Git Bash, se elaboró un repositorio local. Con una carpeta creada llamada fundamentosRodrigo, se siguió una serie de pasos para que en esta carpeta se almacenaran los trabajos que se llevaran a cabo durante la clase, también se creó un archivo README.md, así como un gitignore, para que al configurar la vinculación con un repositorio remoto no incluyera los archivos *.class, además se crearon carpetas para cada una de las 8 practicas del curso. Después se realizó la configuración del repositorio remoto a través de GitHub, creé una cuenta de usuario, ya dentro de la cuenta en la pestaña repositories, dando click en el botón new se crea el repositorio, se nombró igual que el repositorio local y se configuró como privado. Para vincular nuestro repositorio local con el remoto se utilizó nuevamente el Shell de Git Bash utilizando los comandos:

- git remote add origin https://github.com/Rod285/fundamentosRodrigo.git
- git push –u origin master
</p>
<p style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Con esto, se guardó en nuestro repositorio remoto lo que estaba guardado en nuestro repositorio local. Para ver como se suben cambios al repositorio remoto se procedió a modificar el archivo README.md de la carpeta fundamentosRodrigo y se crearon los archivos README.md de cada práctica y se subieron los cambios utilizando los comandos:

-	Git status
-	Git add.
-	Git commit –m “Se agregó README de cada práctica”
-	Git push
</p>
<div style="text-align: justify">&nbsp;&nbsp;&nbsp;&nbsp;Procedí a realizar mi primer programa en Java, “HolaMundo”. Utilizando el VSC; el cual al identificar el lenguaje Java sugirió la instalación de un pliug-in, escribiendo la serie de comandos que desplegaría en pantalla el mensaje “Hola Mundo!”, se guardó el archivo y dentro de la consola de Git Bash se compiló el archivo HolaMundo.java, al no mostrar ningún error se corrió el programa mostrando la frase Hola Mundo!, por lo que el programa quedó funcionando, utilizando los comandos ya vistos se sube la modificación al repositorio remoto. Después se modificó el programa para que realizará una suma de dos números y mostrara el resultado, después de la compilación y verificar que mostrara el resultado correcto procedimos a subir los cambios.
</p>

## Resultados

### &nbsp;&nbsp;&nbsp;&nbsp;Verificación del funcionamiento del compilador de Java.

<p align="center">
    <img width = "577" height = "286" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/verificacion%20compilador%20Java.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Configuración de las variables de entorno.

<p align="center">
    <img width = "577" height = "500" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/Variables%20de%20entorno.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Repositorio Local.

<p align="center">
    <img width = "577" height = "286" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/repositorio%20local.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Programa HolaMundo.

<p align="center">
    <img width = "577" height = "286" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/Hola%20Mundo.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Repositorio Remoto.

<p align="center">
    <img width = "577" height = "286" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/repositorio%20GitHub.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Modificación del programa Hola Mundo.

<p align="center">
    <img width = "577" height = "286" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/Modificaci%C3%B3n%20HolaMundo.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Programa conversor de Grados Celsius a Farenheit.

<p align="center">
    <img width = "577" height = "286" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/GradosCF.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Programa de Cálculo del Salario de un Trabajador.

<p align="center">
    <img width = "577" height = "286" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/SalarioDH.jpg">
</p>

### &nbsp;&nbsp;&nbsp;&nbsp;Subida de Cambios a GitHub.

<p align="center">
    <img width = "577" height = "286" src = "https://github.com/Rod285/fundamentosRodrigo/blob/master/fundamentosRodrigo/p1/subir%20cambios.jpg">
</p>

## Apartado 5

<p style="text-align: justify;">

7. El comando utilizado para clonar un repositorio a una computadora local es git clone y se escribe en el Shell

    - git clone + la dirección web del repositorio (Por ejemplo: https:/github.com/Rod285/FundamentosRodrigo.git).

8. Git pull sirve para actualizar el repositorio de una computadora local con un repositorio distante. En el Shell se  escribe:

    - git pull + la dirección web del repositorio (Por ejemplo: https:/github.com/Rod285/FundamentosRodrigo.git).

9. El programa te sugiere que hagas el pull para que en tu versión tengas los cambios realizados por el otro colaborador y así a dicho archivo puedas agregarles los cambios que tu realizaste.
</p>

## Discusión
<p style="text-align: justify;">
&nbsp;&nbsp;&nbsp;&nbsp;Tras la instalación y el inicio del aprendizaje de la utilización de las distintas herramientas instaladas comencé teniendo errores y aún los continúo teniendo pero cada vez son menos y trabajo de forma más rápida.
Durante la codificación de los programas surgieron problemas como la asignación del tipo de variable, ya que para la multiplicación con decimales al intentar asignar a la variable un tipo float, pero el compilador mandó errores, entonces utilicé el tipo doublé con el cual el programa funcionó bien, por lo que decidí investigar, pero no pude aclara del todo mi duda y me parece que es debido a que el doublé tiene mayor precisión. En el programa SalarioDH se investigó el salario mínimo el cual es de 123.22 pesos y se dividió entre 8 y el resultado se tomó como factor para la multiplicación de horas de trabajo, pero se obtienen fracciones de centavos, lo cual no es lo óptimo, se tiene que buscar un modo de mejorar el programa. También se investigó el uso de la clase Scanner para hacer que programa acepte los datos introducidos por el usuario.

## Conclusiones

- El software mínimo que necesitamos para elaborar un programa es un editor de código, un compilador y depurador, como VSC y el JDK y es necesario saber la plataforma del SO en el que trabajaremos.
- Se pueden utilizar otras herramientas para facilitar el trabajo individual y colaborativo, por medio de la administración de los cambios realizados al proyecto durante el tiempo como Git y GitHub.
-	El ambiente de desarrollo es el conjunto de herramientas que el programador decida utilizar para la elaboración de su actividad, siempre y cuando le permita tenerla planeada y organizada.
</p>
