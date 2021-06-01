
/**
 * Use los comentarios para explicar el objetivo de este programa NumerosPoliticos .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class NumerosPoliticos
{
    //entrada
    long numero1;
    //salida
    long sumas;
    long residuo;
    boolean numeroPolit; 

    void algoritmo ()
    {
        long numero = numero1;
        long politico = numero1;
        long aux = numero1;
        while (numero > 0)
        {
            aux = aux % 10;
            sumas = sumas +  aux;
            numero = numero/10;
            aux = numero;
        }
        numeroPolit = (politico%sumas) == 0;
        residuo = politico%sumas;
    }//fin method
}//fin class númerosPolíticos