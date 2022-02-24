package uf2181;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionesDGTTest {

	private static FuncionesDGT funciones;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funciones = new FuncionesDGT();
	}

	@Test
	void mediaPuntosTest() {
		int v1[] = {1,2,3,4};
		int v2[] = {1,1,1,1};
		int v3 [] = new int [0];
		assertEquals(2.5, funciones.mediaPuntos(v1));
		assertNotEquals(3.0, funciones.mediaPuntos(v1));
		assertEquals(1, funciones.mediaPuntos(v2));
		assertNotEquals(1.1, funciones.mediaPuntos(v2));
		assertThrows(ArrayIndexOutOfBoundsException.class, ()-> funciones.mediaPuntos(v3));
		}
	@Test
	void maximaTasaPermitidaTest() {
	assertEquals(0.25, funciones.maximaTasaPermitida("General", true));
	assertNotEquals(0.25, funciones.maximaTasaPermitida("General", false));
	assertNotEquals(0.25, funciones.maximaTasaPermitida("Novel", true));

	assertEquals(0.5, funciones.maximaTasaPermitida("General", false));
	assertNotEquals(0.5, funciones.maximaTasaPermitida("Novel", false));
	assertNotEquals(0.5, funciones.maximaTasaPermitida("General", true));

	assertEquals(0.15, funciones.maximaTasaPermitida("Novel", true));
	assertNotEquals(0.15, funciones.maximaTasaPermitida("Novel", false));
	assertNotEquals(0.15, funciones.maximaTasaPermitida("General", true));

	assertEquals(0.3, funciones.maximaTasaPermitida("Novel", false));
	assertNotEquals(0.3, funciones.maximaTasaPermitida("Novel", true));
	assertNotEquals(0.3, funciones.maximaTasaPermitida("General", true));
	}
}
