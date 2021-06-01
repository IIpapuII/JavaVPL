
/**
 *    Numerology .
 *    @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co 
 *    @version 4.0
 */
public class Mainnumerology 
{    
     public static void main (String [] args )
    {
        Numerology n = new Numerology ();
        Consola c = new Consola ();

        n.numero = c.leerLong ("Número");

        n.calcularNumerology ();

        System.out.print ("Divisores = " + n.divisores + ". ");
        if (n.cumple == true)
            System.out.print ("Cumple = SI.");
        else
            System.out.print ("Cumple = NO.");
    }
} 