
/**
 * Use los comentarios para explicar el objetivo de este programa TorneoDeFutbol .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 3.1
 */
public class TorneoDeFutbol
{
    //entredas
    long numero1,numero2;
    //salidas
    long ganados,perdidos,puntos,golesFavor;
    long empatados,golesContra,partido1=0,partido2=0;

    void algoritmo ()
    {
         long aux1 = numero1;
        long golesEquipoContrario1;
        long goles1;
        long ganados1       = 0;
        long empatados1     = 0;
        long perdidos1      = 0;
        long puntos1        = 0;
        long golesAFavor1   = 0;
        long golesEnContra1 = 0;
        long partidos00     = 0;
        long aux2 = numero2;
        long golesEquipoContrario2;
        long goles2;
        long ganados2       = 0;
        long empatados2     = 0;
        long perdidos2      = 0;
        long puntos2        = 0;
        long golesAFavor2   = 0;
        long golesEnContra2 = 0;       

        //Partidos de local 
        while (numero1 > 0) 
        {
            aux1 = aux1%100;
            golesEquipoContrario1 = aux1%10;
            goles1 = aux1/10;
            if (goles1 > golesEquipoContrario1)
            {
                puntos1 = puntos1 + 3;
                ganados1 = ganados1 + 1;
            }
            if(goles1 == golesEquipoContrario1)
            {
                puntos1 = puntos1 + 1;
                empatados1 = empatados1 + 1;
            }
            if(goles1 < golesEquipoContrario1)
            {
                perdidos1 = perdidos1 + 1;
            }
            golesEnContra1 = golesEnContra1 + golesEquipoContrario1;
            golesAFavor1 = golesAFavor1 + goles1;
            numero1 = numero1 /100;
            aux1 = numero1;
            
            partido1 = partido1 + 1;
        }
        if (partido1 < 9)
        {
        partidos00 = 9 - partido1;
        empatados1 = empatados1 + partidos00;
        puntos1 = puntos1 + partidos00;
        }
        while (numero2 > 0) 
        {
            aux2 = aux2%100;
            goles2 = aux2%10;
            golesEquipoContrario2 = aux2/10;
            if (goles2 > golesEquipoContrario2)
            {
                puntos2 = puntos2 + 3;
                ganados2 = ganados2 + 1;
            }
            if(goles2 == golesEquipoContrario2)
            {
                puntos2 = puntos2 + 1;
                empatados2 = empatados2 + 1;
            }
            if(goles2 < golesEquipoContrario2)
            {
                perdidos2 = perdidos2 + 1;
            }
            golesEnContra2 = golesEnContra2 + golesEquipoContrario2;
            golesAFavor2 = golesAFavor2 + goles2;
            numero2 = numero2 /100;
            aux2 = numero2;
            partido2 = partido2 + 1;
        }
        if (partido2 < 9)
        {
        partidos00 = 9 - partido2;
        empatados2 = empatados2 + partidos00;
        puntos2 = puntos2 + partidos00;
        }
        ganados = ganados1 + ganados2;
        empatados = empatados1 + empatados2;
        perdidos = perdidos1 + perdidos2;
        puntos = puntos1 + puntos2;
        golesFavor = golesAFavor1 + golesAFavor2;
        golesContra = golesEnContra1 + golesEnContra2;
    }//fin method
}//fin class torneoDeFutbolDeMatemáticos
