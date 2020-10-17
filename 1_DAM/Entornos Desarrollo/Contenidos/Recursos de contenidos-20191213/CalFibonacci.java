import java.util.Scanner;

public class CalFibonacci {
	public static void main(String[] args) {
		CalFibonacci misCal = new CalFibonacci();
		misCal.Fibonacci();
	}

	public void Fibonacci() {
		Scanner miScan = new Scanner(System.in);
		String sSalir = miScan.nextLine();
		int iValor = 0;
		String sResultado = "";
		String sAux;
		while (!(sSalir.equals("S") || sSalir.equals("s"))) {
			System.out.println("¿Cuantos numeros de la serie deseas mostrar?");
			sAux = miScan.nextLine();
			iValor = Integer.parseInt(sAux);
			switch (iValor) {
			case 3:
				sResultado = " 1";
			case 2:
				sResultado = " 1" + sResultado;
			case 1:
				sResultado = " 0" + sResultado;
			}
			System.out.println("Los " + iValor + " numeros son: " + sResultado);
			System.out.println("Si deseas salir, pulsa: S o s");
			sSalir = miScan.nextLine();
		}
	}
}