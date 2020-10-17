package clases;
public class estudiante extends persona{
	// Incluye un metodo de clase que se une a los heredados
	int i_Curso;
    	public estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
	public String preguntacolor(){
		presentarse();
		ordenador mipc = new ordenador();
        	return mipc.color();
    	}
}
