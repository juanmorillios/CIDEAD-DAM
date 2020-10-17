
public class Contador {
	private int resultado = 0;
	public int getResultado()
	{
		return resultado;
	}
	
	public void contar()
	{
		for(int i=0; i < 100 ; i++)
		{
			resultado = resultado + i + 1;
		}
	}
}
