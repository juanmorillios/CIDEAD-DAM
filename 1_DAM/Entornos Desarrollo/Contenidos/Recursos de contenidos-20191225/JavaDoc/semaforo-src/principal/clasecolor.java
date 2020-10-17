package principal;
import clases.profesor;

/**
 * Implementa el inicio del programa. El profesor inicia la consulta del estado del semaforo
 * @author entornos
 * @version 1.0
 * @since 26/10/2018
 */
public class clasecolor {
	public static void main(String[] args) {
		profesor teacher = new profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	} 
}
