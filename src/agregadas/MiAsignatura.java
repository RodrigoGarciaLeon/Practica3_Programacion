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

	
	/** 
	 * @param estudiante
	 * @return int
	 */
	// TODO: A�adir documentaci�n para javadoc
    public int anadirEstudiante(Estudiante estudiante){	
		if(numeroEstudiantes == estudiantes.length){
			return -1;
		}
		for(int i=0; i<estudiantes.length; i++){
			estudiantes[i] = estudiante;
			numeroEstudiantes++;
		}	
		return 1;
	}

	
	/** 
	 * @param desdeEdad
	 * @param hastaEdad
	 */
	// TODO: A�adir documentaci�n para javadoc


	public void mostrarEstudiantesConEdad (int desdeEdad, int hastaEdad) {
		for (int i=0; i<estudiantes.length; i++) {
 			if (estudiantes[i].equals(desdeEdad) && estudiantes[i].equals(hastaEdad) ) {
 				System.out.print("edad " + estudiantes[i] );
 		}
 		System.out.println();
	 }

 }
}
