# **Wappi**


## Introduccion ##
_Automatizacion End-to-End para las transacciones: 
Actualización de datos personales, para la cuál se automatizaron los siguientes escenarios:
	* Validación de la obligatoriedad del nombre
	* Validación de la obligatoriedad del apellido
	* Validación de la obligatoriedad del fecha de nacimiento
	* Validación de la obligatoriedad del país
Pedido, para la cuál se automatizó el siguiente escenario:
	* Pedido Exitoso sin uso de bono de bienvenida

## Pre-requisitos ##
- Java v1.8 update 151 o superior y JDK (variables de entorno configuradas)
- Eclipse IDE (Oxigen o Neon) o IntelliJ IDEA (2018.3)
- Gradle v5 o superior (variables de entorno configuradas)
- Cucumber
- Git

## Instalacion ##
- Para clonar este repositorio localmente, se debe ejecutar el siguiente comando: 
```git clone https://github.com/tchacos2128/TestWappi-.git
- Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente 

## Compilar El Proyecto ##
- Para compilar el proyecto se debe ejecutar el comando:
```gradle clean build -x test```

## Para Ejecutar Las Pruebas ## 
- Para correr el proyecto se necesita Java JDK 1.8 y Gradle con la version 5.2.1 o superior
- Ejecutar el runner correspondiente a la feature que se desea probar; Order o PersonalInformation.

## Detalles Generales De La Implementacion  ##
Cada linea de los escenarios de pruebas creados en el feature bajo lenguaje Gherkin, se conectan con un m谷todo de las clases StepDefinitions con la ayuda de anotaciones @Give, @When y @Then, desde el StepDefinitions se conectan con las clases tipo Task donde se realizan las acciones de alto nivel (p. ej. ingresar datos en un formulario) y desde las cuales se pueden invocar clases tipo Interactions en las cuales se realizan acciones de bajo nivel (p. ej. ingresar texto en un campo, hacer clic a un boton).

## Construido Con ##
 La automatizacion fue desarrollada con:
 - BDD - patron de desarrollo
 - Screenplay que es la implementacion The Journey pattern  
 - Gradle - Herramienta construccion de proyectos
 - Selenium Web Driver - Herramienta para ejecutar acciones en navegadores web
 - Cucumber - Framework para automatizar pruebas BDD
 - Serenity BDD - Biblioteca de codigo abierto que nos ayuda a escribir las pruebas de aceptación de una forma más legible y que envuelve caracteristicas de Selenium y las mejora, igualmente nos permitea la generacion de reportes muy entendibles para el negocio.
 - Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

## Patrones de Diseño y Buenas practicas ##
Algunas de los patrones o buenas practicas que se busco implementar, fueron:
	*Patrón Factory: patrón de diseño creacional, que nos ayuda a construir una jerarquía de clases y crear objetos sin especificar la clase exacta:
			En la automatización se hizo uso de este patrón para la verificación de la obligatoriedad de los diferentes campos en el diligenciamiento de 
			de datos personales, según el mensaje esperado para cada campo se llamaba la Question encargada de verificar el mensaje en la app.
			Igualmente el uso de este patrón nos permite extender nuestro codigo en caso de que se deban validar más campos, sin modificar el codigo 
			existente para los otros campos, y tener clases con responsabilidad unica. Aquí se evidencias los 2 primeros principios SOLID.
	*Patron ObjectBuilder: lo que hacemos con este ObjectBuilder es llamar un metodo statico que instancias el objeto la clase molde, lo que quita esa 				responsabilidad de crear objetos a los step que son los encargados de llevar al actor a ejecutar tareas. Otra ventaja es que la lectura 				del codigo es mucho más limpia. Esto nos permite tener responabilidades bien definidas haciendo alución a uno de los principios SOLID, 				igualmente nos facilita escribir codigo legible y con sentido; por ejemplo en los StepDefinition, donde se uso este patron para el 					llamado de tareas. También se ve el tercer principio SOLID (Sustitución de Liskov), dado que los metodos wasAbleTo y attemptsTo reciben 				Performable, y las tareas creadas lo retornan correctamente medainte el metodo statico creado.
	*Lecturas Limpias: en todo momento se busco tener un codigo limpio y legible por lo que se implementaron algunas buenas practicas ya descritas, y otras como 				hacer import staticos y seleccionar verbos y lenguaje cercano al negocio para el nombramiento de clases, metodos y variables.


## Reporte ##
Serenity BDD nos permite la creación de documentación viva, el cual se va creando a medida que se corren los test, y finalmente se genera un archivo index.html mediante la instrucción "test.finalizedBy(aggregate)" que se encuentra en el archivo build.gradle.
El reporte queda en la raíz del proyecto, bajo la siguiente estructura: target -> site -> serenity -> index.html


## Versionado ## 
Se uso GIT para el control de versiones

## Autores ##
* **Gloria Cecilia Osorio Monroy** 

