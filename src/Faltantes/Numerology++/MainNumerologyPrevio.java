
/**
 * Use los comentarios para explicar el objetivo de este programa MainNumerologyPrevio .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 3.3
 */
public class MainNumerologyPrevio
{
    public static void main(String [] args){
        NumerologyPrevio n = new NumerologyPrevio();
        Consola c = new Consola ();

        n.numero = c.leerLong ("Número");

        n.algoritmo ();

        if(n.numeroValido){
            if(n.numerologyValido){
                c.imprimir("¡Buena Suerte: juegue en la lotería el número " + n.residuo + " y será millonario!");
            }
            else{
                c.imprimir("¡Incertidumbre: pruebe su suerte en la lotería con el número " + n.residuo + "!");
            }
        }
        else{
            if(!n.numeroValido){
               c.imprimir("¡Mala Suerte!");
            }
        }
    }
}

