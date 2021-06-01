
/**
 * Use los comentarios para explicar el objetivo de este programa RelojAtravesDelEspejo .
 *
 * @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co
 * @version 2.1
 */
public class RelojAtravesDelEspejo
{
       //entradas
       int horaNormal;
    //salidas
    int hora;
    int horaEspejo;
    int minuto;
    int minutoEspejo;
    int horaPrimeraParte;
    int horaSegundaParte;
    int minutoPrimeraParte;
    int minutoSegundaParte;
    boolean horaValida;
    boolean minutoValido;
    boolean horaValidaFinal;

    void algoritmo(){
        //transformar las entradas en salidas
        hora = horaNormal / 100;
        horaEspejo  = 12 - (hora  + 1);
        minuto = horaNormal % 100;
        minutoEspejo = 60 - minuto;
        horaValida = hora >= 01 && hora <= 12 ;
        minutoValido = minuto >= 00 && minuto <= 59;
        horaValidaFinal = horaValida && minutoValido;
        if(horaValidaFinal){
            if (minutoEspejo == 60 ){
                minutoEspejo = 00;
                horaEspejo = horaEspejo + 1;
            }
            if (horaEspejo == 0 ){
                horaEspejo = 12;
            }
            if (horaEspejo <= 0 ){
                horaEspejo = 12 + horaEspejo;
            }
        }
        minutoPrimeraParte = minutoEspejo / 10;
        minutoSegundaParte = minutoEspejo % 10;
        horaPrimeraParte = horaEspejo / 10;
        horaSegundaParte = horaEspejo % 10;
    }
}
