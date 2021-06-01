
/**
 * Use los comentarios para explicar el objetivo de este programa EcuacionCuadratica .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class EcuacionCuadratica
{
    //entradas
    int a;
    int b;
    int c;
    //salidas
    boolean concavidadHaciaArriba;
    boolean concavidadHaciaAbajo;
    boolean noHaySoluciones;
    boolean hayUnaSolucion;
    boolean hayDosSoluciones;
    int solucion0;
    int solucion;
    //algoritmo
    
    void algoritmo( ){
          concavidadHaciaArriba = a > 0;
          concavidadHaciaAbajo = a < 0;
          noHaySoluciones = ((b*b)-4*a*c) < 0;
          hayUnaSolucion = ((b*b)-4*a*c) == 0;
          hayDosSoluciones = ((b*b)-4*a*c) > 0;
          solucion0 = ((b*b)-4*a*c);
          solucion = 2*a;

    
    }//fin method
    
}//fin class EcuacionCuadratica
