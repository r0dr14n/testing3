package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UtilidadesTest {
	
	private static Utilidades utils;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		utils= new Utilidades();
	}

	@Test
	void testDevuelveNota() {
		assertThrows(ArithmeticException.class, 
				()->utils.devuelveNota(-3));
		assertThrows(ArithmeticException.class,
				()->utils.devuelveNota(12));
		assertEquals(utils.devuelveNota(3), "Suspenso");
		assertEquals(utils.devuelveNota(6), "Bien");
		assertEquals(utils.devuelveNota(6.6), "Notable");
		assertEquals(utils.devuelveNota(8.4), "Notable");
		assertEquals(utils.devuelveNota(8.5), "Sobresaliente");
		assertEquals(utils.devuelveNota(9), "Sobresaliente");
		assertEquals(utils.devuelveNota(10), "Matrícula");
	}

	@Test
	void testCalculaSalario() {
		assertEquals(utils.calculaSalario(6, 2, 4), 12.0);
		assertEquals(utils.calculaSalario(39, 2, 4), 72.0);
	}

	@Test
	void testCuentaDivisores() {
		assertEquals(utils.cuentaDivisores(7), 0);
		assertEquals(utils.cuentaDivisores(6), 6);
		assertEquals(utils.cuentaDivisores(8), 8);
	}
	
	@Test
	void testDevuelveMenor() {
		int v [] = { 0, 1, 2, 3, 4, 5 };
		assertEquals(utils.devuelveMenor(v), 0);
		int f [] = { 5, 1, 2, 3, 4, 0 };
		assertEquals(utils.devuelveMenor(f), 0);
		int k [] = { 5, 1, -1, 0, 4, 3 };
		assertEquals(utils.devuelveMenor(k), -1);
	}
	
	@Test
	void testBurbuja() {
		int x [] = {5, 3, 4, 2, 1};
		int ordenado [] = {1, 2, 3, 4, 5};
		assertArrayEquals(utils.burbuja(x), ordenado);
	}
}