/**
 * 
 */
package uf2178;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class Ppal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Escribe aquí las sentencias del apartado 3
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tasa de alcoholemia");
		Float tasa = entrada.nextFloat();
		Funciones.calculaSancion(tasa);
		int puntos[] = new int [6];
		int sanciones[] = new int [6]; 
		System.out.println("Introduzca los valores");
		System.out.println("Introduzca los puntos");
		Funciones.pedir_vector(puntos);
		System.out.println("Introduzca las sanciones");
		Funciones.pedir_vector(sanciones);
		System.out.println("Mostrando los valores");
		System.out.println("Resumen puntos");
		Funciones.mostrar_vector(puntos);
		System.out.println("Resumen sanciones");
		Funciones.mostrar_vector(sanciones);
		System.out.println("Resultado final");
		Funciones.restaPuntos(puntos,sanciones);
		Funciones.mostrar_vector(puntos);
		}

}
