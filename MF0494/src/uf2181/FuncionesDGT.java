/**
 * 
 */
package uf2181;

/**
 * @author Francisco M. Aguilar Torres
 *
 */
public class FuncionesDGT {

	/**
	 * Calcula la media de los puntos almacenados.
	 * @param puntos Los puntos que queremos almacenar
	 * @return devuelve la media de los puntos almacenados
	 * @throws la longitud no debe de ser cero.
	 */
	public double mediaPuntos(int puntos[]) {
		double suma = 0;
		
		for (int i = 0; i < puntos.length; i++) {
			suma = suma +puntos[i];
		}
		if (puntos.length==0) throw new ArrayIndexOutOfBoundsException();
		return suma/puntos.length;
	}
	/**
	 * Método que nos indica el tipo de conductor que es y el límite en aire y sangre
	 * @param tipoConductor si es General o Novel.
	 * @param aire de tipo boolean si es true es por el aire y por sangre false.
	 * @return devuelve la tasa. 
	 */
	public double maximaTasaPermitida(String tipoConductor, boolean aire) {
		double tasa=0.25;
		if (tipoConductor.equalsIgnoreCase("General")) {
			if (aire) {
				tasa=0.25;
			} else {
				tasa=0.5;
			}
		} else {
			// profesionales y noveles
			if (aire) {
				tasa=0.15;
			} else {
				tasa=0.3;
			}
		}
		return tasa;
	}

	
}
