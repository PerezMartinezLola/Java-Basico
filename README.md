![Java Básico](https://localo.com/es/assets/img/definitions/what-is-java.webp)
# Java Básico

Java es un lenguaje de programación ampliamente utilizado por su facilidad de aprendizaje, su enfoque en la programación orientada a objetos y su capacidad de ejecutarse en múltiples plataformas. 
Es un lenguaje versátil que permite desarrollar desde aplicaciones de escritorio hasta sistemas empresariales y aplicaciones móviles. 

## ¿Qué vamos a encontrar aquí?

En este repositorio encontrarás ejemplos básicos de Java, centrados en el uso de bucles for y arrays, para aprender dinámicamente la lógica de programación.

## Requisitos

No es necesario instalar un IDE para ejecutar los ejemplos. 
Puedes probarlos fácilmente en plataformas de código en línea como Paiza.io, lo que facilita la práctica sin configuración adicional.


#### Ejemplos de lo que vas a encontrar:
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
