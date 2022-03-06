package agregadas;

public class MiArray {
	private int[] arrayEnteros;
	private int nElementos;

	// TODO: Añadir documentación para javadoc
	public MiArray(int[] arrayEnteros) {
		this.arrayEnteros = arrayEnteros;
		this.nElementos = arrayEnteros.length;
	}
	
		
		/** 
		 * @return int[]
		 */
		// TODO: A�adir documentaci�n para javadoc
	public int[] getArrayEnteros() {
		return arrayEnteros;
	}

	// TODO: A�adir documentaci�n para javadoc
	public void recorrerParaPresentarEnPantalla() {
		for (int elemento: arrayEnteros) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}

	/** 
	 * Este método cambia el signo a los valores pares del array
	 * @param desde Nos inidica donde comenzamos a recorrer el array
	 * @param hasta	Es el último valor hasta el que llegamos en el array
	 */
	// TODO: Añadir documentación para javadoc
	public void recorrerCambiarSignoValoresPares(int desde, int hasta) {
		if (nElementos == 0) {
			return;
		}
		if(hasta >= nElementos) {
			return;
		}
		for(int i = desde; i <= hasta; i++) {
			if (arrayEnteros[i] % 2 == 0) {
				arrayEnteros[i] = -arrayEnteros[i];
			}
		}
	}
		
}
