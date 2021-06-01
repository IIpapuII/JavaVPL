
/**
 * Use los comentarios para explicar el objetivo de este programa NumerologyPrevio .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 3.3
 */
public class NumerologyPrevio
{
    //entradas
    long numero;
    //salidas
    long residuo;
    boolean numeroValido;
    boolean numerologyValido;
    
    void algoritmo(){
        //transformar las entradas en salidas
        long f;
        long divisionNumero;
        long divisionValida;
        long contador;
        long numerology;
        f = numero;
        divisionNumero = 0;
        residuo = 0;
        contador = 0;
        while( f!= 0){
            f = f/ 10;
            contador++;
        }
        if(numero < 0  || contador < 18){
            numeroValido = false;
        }
        else{
           f = numero;
              while(f != 0){
                divisionNumero = f % 10;
                if(divisionNumero != 1 && divisionNumero != 0){
                divisionValida = numero % divisionNumero;
                 if(divisionValida == 0){
                    residuo = residuo + divisionNumero;
                }
               }
               f = f /10;
           }
           numerology = numero % residuo;
           if(numerology == 0){
                numerologyValido = true;
               }
            else{
                numerologyValido = false;
               }
           numeroValido = true;
        }
    }
}

      
