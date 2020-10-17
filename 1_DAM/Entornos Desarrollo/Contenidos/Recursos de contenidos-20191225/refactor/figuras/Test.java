package figuras;

import utilidades.Circulo;

public class Test {
    public static void main(String[] args)
{
        Circulo c1 = new Circulo(5.5);
        Circulo c2 = new Circulo(10.1);
        Circulo c3 = new Circulo(10.9);

   if (c2.esIgual(c3, false))
            System.out.println("c2 y c3: iguales sin considerar decimales");

   if (c2.esIgual(c3, true))
       System.out.println("c2 y c3: iguales considerando decimales");
}

}
