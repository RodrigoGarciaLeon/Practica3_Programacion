package agregadas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EstudianteTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEstudianteSinNota() {
		Estudiante obj = new Estudiante("XX", 19, new double[] {});
		assertTrue(0.0 == obj.notaMedia());
	}

	@Test
	public void testEstudianteConNotas() {
		Estudiante obj = new Estudiante("YY", 20, new double[] {5.0, 6.0, 7.0});
		assertTrue(6.0 == obj.notaMedia());
	}

}
