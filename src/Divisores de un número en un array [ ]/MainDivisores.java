
/**
 * Use los comentarios para explicar el objetivo de este programa MainDivisores .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class MainDivisores
{
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           Divisores d = new Divisores();
       //Leer datos de entrada usando la vista
           d.numero = c.leerEntero ("Escriba un numero: ");

       //Invocar los métodos/algoritmos del modelo
           d.algoritmo();
       //Mostrar los datos de salida usando la vista
           c.imprimir(d.numero + " tiene " + d.a.length + " divisores " );
           for(int i = 0; i < d.a.length; i++) 
           c.imprimir (/*"divisores[" + i + "] = " + */ d.a[i]);
    }
    
}//fin class MainDivisores
