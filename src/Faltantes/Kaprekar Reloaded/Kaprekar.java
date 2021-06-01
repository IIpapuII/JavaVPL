
/**
 * Use los comentarios para explicar el objetivo de este programa Kaprekar .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 4.0
 */
public class Kaprekar
{
    //entrada
    int numero;
    //salida
    int ciclos;
    String datosInvalidos;

    void calcularKaprekar(){
        if(numero>9999){
            datosInvalidos="Datos Inválidos";
        }
        else
        {
            int n1 = numero, n2 = 0, resta = -1;
            ciclos = 0;    

            while(resta!=6174 && resta!=0){
                n1 = ordenarDigitos(n1);
                n2 = invertirnumero(n1);
                resta = n2 - n1;
                numero = resta;
                ciclos ++;

            }
            if(resta == 0) ciclos = 8; 
        }
    }

    int ordenarDigitos(int descendente){
        descendente =0;
        int n1 = descendente;
        int parte1, parte2, parte3, parte4, aux;

        parte4 = numero%10;
        parte3 = (numero/10)%10;
        parte2 = (numero/100)%10;
        parte1 = numero/1000;

        if (parte1 > parte2)
        {
            aux = parte1;
            parte1 = parte2;
            parte2 = aux;
        }
        if (parte3 > parte4)
        {
            aux = parte3;
            parte3 = parte4;
            parte4= aux;
        }
        if (parte1 > parte3)
        {
            aux = parte1;
            parte1 = parte3;
            parte3 = aux;
        }
        if (parte2 > parte4)
        {
            aux = parte2;
            parte2 = parte4;
            parte4 = aux;
        }
        if (parte2 > parte3)
        {
            aux = parte2;
            parte2 = parte3;
            parte3 = aux;
        }

        descendente = (parte1 * 1000) + (parte2 * 100) + (parte3 * 10) + (parte4);
        return descendente;
    }

    int invertirnumero(int descendente){
        int ascendente=0;
        int n1 = numero;
        int numero = ordenarDigitos(descendente);
        int parte1, parte2, parte3, parte4, aux;

        parte4 = numero%10;
        parte3 = (numero/10)%10;
        parte2 = (numero/100)%10;
        parte1=  numero/1000;

        ascendente = (parte4 * 1000) + (parte3 * 100) + (parte2 * 10) + (parte1);
        return ascendente;
    }//fin method
}//fin class Kaprekar