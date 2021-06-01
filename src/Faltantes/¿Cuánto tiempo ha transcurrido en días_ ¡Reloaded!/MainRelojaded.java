
/**
 * Use los comentarios para explicar el objetivo de este programa MainRelojaded .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 3.111
 */
public class MainRelojaded
{
    public static void main (String [] args)
    {
        Relojaded r = new Relojaded ();
        Consola c = new Consola ();

        r.fecha1 = c.leerEntero("Fecha 1");
        r.fecha2 = c.leerEntero ("Fecha 2");
        
        r.algoritmo();
        
        c.imprimir ("Diferencia en días = "+ r.diferenciaEnDias);
    }
}
