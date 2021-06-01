/**
 *    Polidivisible .
 *    @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co 
 *    @version 4.0
 */
public class MainPoli 
{    
    public static void main(String [] args){
        //Crear objeto Vista 
        Consola c = new Consola();       

        //Crear objeto del modelo 
        Polidivisible p = new Polidivisible();
        
        //leer los datos de entrada usando la vista
        p.numero= c.leerEntero(/*""*/);
        
    
        // Invocar los étodos/algoritmos del modelo
        p.algoritmo();
    
        //mostrar / imprimir los datos de salida
  
        c.imprimir(p.polidivisible ? "SI": "NO");

    }//end main
}//end class MainPoli 
