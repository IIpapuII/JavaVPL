
/**
 * Use los comentarios para explicar el objetivo de este programa Domino .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 3.2
 */
public class Domino
{
    //entradas
    int numero1;
    int numero2;
    int numero3;
    //salidas
    int numero1PrimeraParte;
    int numero1SegundaParte;
    int numero2PrimeraParte;
    int numero2SegundaParte;
    int numero3PrimeraParte;
    int numero3SegundaParte;
    boolean numero1Valido;
    boolean numero2Valido;
    boolean numero3Valido;
    boolean fichasDuplicadas;
    boolean dosExtremos;
    boolean extremoDerecho;
    boolean extremoIzquierdo;
    boolean noJugar;

    void algoritmo(){
        //transformar las entradas en salidas
        numero1SegundaParte = numero1 % 10;
        numero1PrimeraParte = numero1 / 10;
        numero2SegundaParte = numero2 % 10;
        numero2PrimeraParte = numero2 / 10;
        numero3SegundaParte = numero3 % 10;
        numero3PrimeraParte = numero3 / 10;
        numero1Valido = (numero1PrimeraParte >= 0 && numero1PrimeraParte <= 6) && (numero1SegundaParte >= 0 && numero1SegundaParte <= 6);
        numero2Valido = (numero2PrimeraParte >= 0 && numero2PrimeraParte <= 6) && (numero2SegundaParte >= 0 && numero2SegundaParte <= 6);
        numero3Valido = (numero3PrimeraParte >= 0 && numero3PrimeraParte <= 6) && (numero3SegundaParte >= 0 && numero3SegundaParte <= 6);
        if ( numero1Valido && numero2Valido && numero3Valido){
            if ((numero1SegundaParte == numero2PrimeraParte) && (numero2SegundaParte == numero1PrimeraParte) || (numero1SegundaParte == numero3PrimeraParte) && (numero3SegundaParte == numero1PrimeraParte) || (numero3SegundaParte == numero2PrimeraParte) && (numero2SegundaParte == numero3PrimeraParte)){
                fichasDuplicadas = true;
            }
            else{
                if (((numero3SegundaParte == numero2SegundaParte) || (numero2SegundaParte == numero3PrimeraParte)) && ((numero3SegundaParte == numero1PrimeraParte) || (numero3PrimeraParte == numero1PrimeraParte))){
                    dosExtremos = true;
                }
                else{
                    if ((numero3SegundaParte == numero2SegundaParte) || (numero2SegundaParte == numero3PrimeraParte) /*|| (numero3PrimeraParte == numero2SegundaParte) || (numero3SegundaParte == numero2SegundaParte)*/){
                        extremoDerecho = true;
                    } 
                    else{
                        if ((numero3SegundaParte == numero1PrimeraParte) || /*(numero1SegundaParte == numero3PrimeraParte) || */(numero3PrimeraParte == numero1PrimeraParte)/* || (numero3SegundaParte == numero1SegundaParte)*/){
                            extremoIzquierdo = true;
                        }
                        else{ 
                            noJugar = true;
                        }
                    }
                }
            }
        }  
    }
}
