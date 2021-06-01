
/**
 *    Numerology .
 *    @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co 
 *    @version 4.0
 */
class Numerology
{
    //Entradas
         long numero;
             //salidas
            long divisores;
            boolean cumple;

    //algoritmo
    void calcularNumerology( ){

                long numeroADividir = numero; // numeroADividir
                long tmp = numero; // tmp
                divisores = comprobarDivisores(numeroADividir, tmp, numero);
                cumple = paraVerificar(tmp, divisores);
    }//fin method

            long comprobarDivisores(long numeroDiv, long tzp, long numeroR){
        

            while (numeroDiv > 0)
            {
                numeroDiv = numeroDiv % 10;
                if (numeroDiv != 1 && numeroDiv!= 0)
                {
                   if ((tzp % numeroDiv) == 0)
                       divisores = divisores + 1;
            }
            numeroR = numeroR / 10;
            numeroDiv = numeroR;
        }
        return divisores;
    }
    
    boolean paraVerificar (long tzp , long divisoresZ ){
        boolean cumple = false;
        
        if (divisoresZ == 0 || divisoresZ == 1)
        cumple = false;
        else
        cumple = (tzp % divisoresZ) == 0;
    
        return cumple;
    }
}//fin class Numerology
