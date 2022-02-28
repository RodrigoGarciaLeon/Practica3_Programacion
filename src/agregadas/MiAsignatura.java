package agregadas;

public class MiAsignatura {
	private String nombre;
	private Estudiante[] estudiantes;
	private int numeroEstudiantes;

	public MiAsignatura(String nombre, int maximoNumeroDeEstudiantes) {
		super();
		this.nombre = nombre;
		this.estudiantes = new Estudiante[maximoNumeroDeEstudiantes];
		this.numeroEstudiantes = 0;
	}

	// TODO: A�adir documentaci�n para javadoc
    public int anadirEstudiante(Estudiante estudiante) {
    	return 0;
	}

	// TODO: A�adir documentaci�n para javadoc
    public void mostrarEstudiantesConEdad (int desdeEdad, int hastaEdad) {

    }
    
}
