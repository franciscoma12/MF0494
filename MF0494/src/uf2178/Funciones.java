package uf2178;

import java.util.Scanner;

public class Funciones {
	
	/** 
	 * Método de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * Método para mostrar por pantalla el vector pasado como parámetro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	
	public static void calculaSancion(double tasaAl) {
		String sancion = "";
		if(tasaAl < 0.25) {
		sancion = "Sin sancion";
		} else if(tasaAl >= 0.25 && tasaAl < 0.50) {
		sancion = "500€ y pérdida de 4 puntos del carnet";
		} else if(tasaAl >= 0.50 && tasaAl < 0.60) {
		sancion = "1000€ y pérdida de 6 puntos del carnet";
		} else if(tasaAl >= 0.60) {
		sancion = "retirada del carnet y de 3 a 6 meses de cárcel";
		}
		System.out.printf("El conductor con tasa de alcoholemia "+ tasaAl + " tiene la sancion " + sancion);
		}
	
	
	public static void restaPuntos(int v1[], int v2[]) {
		for (int i = 0; i < v1.length; i++) {
		v1[i]-=v2[i];
		if (v1[i] < 0)
		v1[i] = 0;
		}
	}
}