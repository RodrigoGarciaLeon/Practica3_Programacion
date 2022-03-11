import agregadas.Estudiante;
import agregadas.MiArray;
import agregadas.MiAsignatura;

/*
 * Al finalizar la sesi�n de laboratorio, el alumno deber� subir su soluci�n
 * al VPL que tiene en el Campus virtual de la asignatura y, pulsando en el
 * bot�n de "Evaluar" comprobar que su resultado es correcto; a continuaci�n 
 * lo notifica al profesor quien evaluar� su entrega.
 * 
 * La entrega se evaluar� atendiendo a los siguientes aspectos: verificaci�n
 * de funcionamiento, claridad del c�digo, comentarios adecuados y respuestas
 * adecuadas a las preguntas del profesor.
 */

public class Practica_L3 {

	// AVISO: No subas este fichero al VPL.
	
	public static void main(String[] arg) {
		VPL_Utils.run_checks();
		
		MiAsignatura a = new MiAsignatura("Programacion", 10);
		Estudiante es = new Estudiante("Carmelo", 18, new double[] {5.0,2.0,});
		MiArray array = new MiArray(null);

		

	}
	
}
