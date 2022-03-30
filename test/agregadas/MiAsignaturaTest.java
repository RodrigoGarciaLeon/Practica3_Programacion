package agregadas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MiAsignaturaTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAnadirEstudiante() {
		MiAsignatura asignatura = new MiAsignatura("Programacion", 1);
		Estudiante obj1 = new Estudiante("XX", 19, new double[] {});

		int return_value = asignatura.anadirEstudiante(obj1);
		assertTrue(return_value != -1);
	}

	@Test
	public void testAnadirEstudianteAsignaturaLlena() {
		MiAsignatura asignatura = new MiAsignatura("Programacion", 1);
		Estudiante obj1 = new Estudiante("XX", 19, new double[] {});
		Estudiante obj2 = new Estudiante("YY", 19, new double[] {});

		asignatura.anadirEstudiante(obj1);
		int return_value = asignatura.anadirEstudiante(obj2);
		assertTrue(return_value == -1);
	}



}
