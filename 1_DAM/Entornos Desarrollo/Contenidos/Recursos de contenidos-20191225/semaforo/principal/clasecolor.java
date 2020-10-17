package principal;
import clases.profesor;
// Clase color, el profesor pregunta a un alumno por un color entre (rojo, amarillo y verde)
public class clasecolor {
	public static void main(String[] args) {
		profesor teacher = new profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	} 
}
