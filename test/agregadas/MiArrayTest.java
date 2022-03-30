package agregadas;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class MiArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRecorrerCambiarSignoValoresParesArrayVacio() {
		int[] arrayEnteros = new int[] {};
		int[] expected     = new int[] {};

		MiArray obj = new MiArray(arrayEnteros);
		obj.recorrerCambiarSignoValoresPares(2, 4);
		assertTrue(Arrays.equals(expected, obj.getArrayEnteros()));
	}

	@Test
	public void testRecorrerCambiarSignoValoresParesIndiceErroneo() {
		int[] arrayEnteros = new int[] {0,1,2,3,4,5,6};
		int[] expected     = new int[] {0,1,2,3,4,5,6};

		MiArray obj = new MiArray(arrayEnteros);
		obj.recorrerCambiarSignoValoresPares(2, 7);
		assertTrue(Arrays.equals(expected, obj.getArrayEnteros()));
	}

	@Test
	public void testRecorrerCambiarSignoValoresPares() {
		int[] arrayEnteros = new int[] {0,1,2,3,4,5,6};
		int[] expected     = new int[] {0,1,-2,3,-4,5,6};

		MiArray obj = new MiArray(arrayEnteros);
		obj.recorrerCambiarSignoValoresPares(2, 4);
		assertTrue(Arrays.equals(expected, obj.getArrayEnteros()));
	}

	@Test
	public void testElminar() {
		int[] given = new int[] {0,1,2,3,4,5,6};
		int[] expected     = new int[] {0,6};

		MiArray obj = new MiArray(given);
		obj.eliminarElementos(1, 5);
		// assertArrayEquals(expected, given);
		assertEquals(2, given.length);
	}
}
