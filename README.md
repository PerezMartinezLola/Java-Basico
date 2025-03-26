
# Java Básico
![Java Básico](https://c4.wallpaperflare.com/wallpaper/974/747/684/java-developer-hd-wallpaper-preview.jpg)

Java es un lenguaje de programación ampliamente utilizado debido a su facilidad de aprendizaje, su enfoque en la programación orientada a objetos y su capacidad de ejecutarse en múltiples plataformas gracias a la Máquina Virtual de Java (JVM). 
Su versatilidad permite desarrollar desde aplicaciones de escritorio hasta sistemas empresariales y aplicaciones móviles.

## ¿Qué encontrarás en este repositorio?

Este repositorio está diseñado para quienes están comenzando con Java. Aquí encontrarás ejemplos prácticos y sencillos que te ayudarán a comprender conceptos fundamentales del lenguaje.

Los temas principales que se abordan son:

- Uso de **bucles** y cómo iterar sobre arrays.
- Manejo básico de **arrays** y cómo realizar operaciones con ellos.
- Implementación de **algoritmos básicos** para trabajar con estructuras de datos.

El objetivo es tener ejemplos para poder ver cómo funciona de manera dinámica y práctica la lógica de programación en Java.

## Requisitos

No es necesario instalar un entorno de desarrollo (IDE) como Eclipse o IntelliJ IDEA para ejecutar los ejemplos.
Puedes probarlos directamente en plataformas de código en línea como Paiza.io, lo que facilita la práctica sin necesidad de configuraciones adicionales.


#### Ejemplo de lo que vas a encontrar:
A continuación, puedes ver un fragmento de código que demuestra cómo encontrar el valor mínimo en un array utilizando un bucle for-each:
```java
   package javabasico;

public class ArrayMenorValor {
	public static void main(String[] args) {
		
		 int [] arrayNuevo = {3, 5, 7, 2, 8};
		 int min = arrayNuevo [0];

		    for(int num:arrayNuevo){
		        if(num < min){
		            min = num;
		        }
		    }

		    System.out.printf("%d ", min);

	}
}
```

***
#### Recursos adicionales:
- [Documentación oficial de Java](https://docs.oracle.com/en/java/)
- [W3Schools - Curso de Java](https://www.w3schools.com/java/)
- [Curso Java 2025. Introducción](https://www.youtube.com/watch?v=_WJkT42l7Wk&ab_channel=pildorasinformaticas)
- [Paiza.io](https://paiza.io/es/projects/new)

*** 
#### Cambios realizados:
- Cambio el nombre del paquete practicaBucles a practicaBucle.
- Añado la clase de OperadoresAritmeticos.


