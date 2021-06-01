
/**
 * Use los comentarios para explicar el objetivo de este programa MainCalendarioRaroPeroInteligente .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class MainCalendarioRaroPeroInteligente
{
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
          CalendarioRaroPeroInteligente r = new CalendarioRaroPeroInteligente ();
       //Leer datos de entrada usando la vista
           r.fecha = c.leerLong ("Fecha");

       //Invocar los métodos/algoritmos del modelo
           r.algoritmo();
       //Mostrar los datos de salida usando la vista
           c.imprimir("Fecha Rara: " + r.fechaRara);
           
    }
    
}//fin class MainCalendarioRaroPeroInteligente
