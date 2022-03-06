package agregadas;

public class Estudiante {
	private String nombre;
	private int edad;
	private double[] notas;

	// TODO: A�adir documentaci�n para javadoc
	public Estudiante(String nombre, int edad, double[] notas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.setNotas(notas);
	}

	
	/** 
	 * @param desdeNota
	 * @param hastaNota
	 */
		public void mostrarNotasEntreValores (double desdeNota, double hastaNota) {
		System.out.print(nombre + ": ");
		for (int i = 0; i < notas.length; i++){
			if (notas[i] <= hastaNota && notas[i] >= desdeNota) {
				System.out.print(notas[i] + " ");
			}
		}
		System.out.println();	
	}
	
	
	/** 
	 * Este metodo calcula la nota media de un estudiante dadas las notas del mismo.
	 * @return double
	 */
	public double notaMedia() {
		double result = 0.0;
		if (notas.length == 0){
			return 0.0;
		}
		for (int i = 0; i < notas.length; i++) {
			result = result + notas[i];
		}
		return result / (double)notas.length;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
}
