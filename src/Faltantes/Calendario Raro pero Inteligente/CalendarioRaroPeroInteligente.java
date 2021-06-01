
/**
 * Use los comentarios para explicar el objetivo de este programa CalendarioRaroPeroInteligente .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class CalendarioRaroPeroInteligente
{
    //entradas
    long fecha;
    //salidas
    long año;
    long mesSegundoDigito;
    long mesSegundoDigito1;
    long mesPrimerDigito;
    long mesPrimerDigito1;
    long diaSegundoDigito;
    long diaSegundoDigito1;
    long diaPrimerDigito;
    
    long codigoDiaSegundoDigito;
    long codigoDiaPrimerDigito;
    long codigoMesSegundoDigito;
    long codigoMesPrimerDigito;
    long codigoAño;
    
    long fechaRara;
    //algoritmo
    void algoritmo( ){
      año = fecha % 10000;    
      
      mesSegundoDigito = fecha/10000;
      mesSegundoDigito1 = mesSegundoDigito%10;
      
      mesPrimerDigito = mesSegundoDigito/10;
      mesPrimerDigito1 = mesPrimerDigito%10;
      
      diaSegundoDigito =  mesPrimerDigito/10;
      diaSegundoDigito1 = diaSegundoDigito%10;
      
      diaPrimerDigito =  diaSegundoDigito/10;
      
      codigoDiaPrimerDigito  = 48 + diaPrimerDigito;
      codigoDiaSegundoDigito = 48 + diaSegundoDigito1;
      
      codigoMesPrimerDigito = 48 + mesPrimerDigito1;
      codigoMesSegundoDigito = 48 + mesSegundoDigito1;
      
      codigoAño = 9999-año;
      
      fechaRara = (codigoDiaPrimerDigito * 10000000000l) + (codigoDiaSegundoDigito* 100000000) + (codigoMesPrimerDigito * 1000000) +
                  (codigoMesSegundoDigito * 10000) + codigoAño;
    }//fin method
    
}//fin class CalendarioRaroPeroInteligente
