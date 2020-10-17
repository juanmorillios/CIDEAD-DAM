package clases;

/**
 * Los profesores comprueban si el alumno conoce el color del semaforo
 * 
 * @author entornos
 * @version 1.0
 * @since 26/10/2018
 */
public class profesor extends persona {
	public profesor() {
	} // Constructor

	/**
	 * Inicia la consulta del color del semaforo
	 * @return Color recibido como respuesta del alumno
	 */
	// Hace la pregunta al estudiante sobre el color
	public String preguntacolor() {

		estudiante alumno = new estudiante(20,"Noa",1);
		String colorRec = alumno.preguntacolor();
		return colorRec;
	}
}
