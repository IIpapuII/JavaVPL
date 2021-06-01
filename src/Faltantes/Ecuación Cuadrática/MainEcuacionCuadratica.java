
/**
 * Use los comentarios para explicar el objetivo de este programa MainEcuacionCuadratica .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 2.2
 */
public class MainEcuacionCuadratica
{
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           EcuacionCuadratica e = new EcuacionCuadratica();
       //Leer datos de entrada usando la vista
          e.a = c.leerEntero ("a");
          e.b = c.leerEntero ("b");
          e.c = c.leerEntero ("c");
       //Invocar los métodos/algoritmos del modelo
           e.algoritmo();
       //Mostrar los datos de salida usando la vista
           c.imprimir ("Concavidad hacia arriba: " + e.concavidadHaciaArriba);
           c.imprimir ("Concavidad hacia Abajo:  " + e.concavidadHaciaAbajo);
           c.imprimir ("No hay soluciones:       " + e.noHaySoluciones);
           c.imprimir ("Hay una solución:        " + e.hayUnaSolucion);
           c.imprimir ("Hay dos soluciones:      " + e.hayDosSoluciones);
           c.imprimir ("Solucion:                " + "( -" + e.b + " ± " + "√" + "(" + e.solucion0 + ")" + " ) "+"/ " + e.solucion); 
          
    }
    
}//fin class MainEcuacionCuadratica
