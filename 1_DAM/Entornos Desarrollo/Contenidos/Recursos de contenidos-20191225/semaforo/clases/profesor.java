package clases;

public class profesor  extends persona{
    	public profesor() {}				// Constructor

	// Hace la pregunta al estudiante sobre el color
    	public String preguntacolor(){

		estudiante alumno = new estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
    	}
}
