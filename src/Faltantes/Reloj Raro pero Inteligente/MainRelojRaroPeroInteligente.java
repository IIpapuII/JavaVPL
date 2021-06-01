
/**
 * Use los comentarios para explicar el objetivo de este programa MainRelojRaroPeroInteligente .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class MainRelojRaroPeroInteligente
{
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           RelojRaroPeroInteligente r = new RelojRaroPeroInteligente();
       //Leer datos de entrada usando la vista
           r.numero = c.leerEntero();
           r.letra = c.leerCaracter();

       //Invocar los métodos/algoritmos del modelo
           r.algoritmo();
       //Mostrar los datos de salida usando la vista
           c.imprimir("Hora Valida: " + r.valida);
           
    }
    
}//fin class MainRelojRaroPeroInteligente
