
/**
 * Use los comentarios para explicar el objetivo de este programa MainKaprekar .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 4.0
 */
public class MainKaprekar
{
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
           
       //Crear objeto del modelo "M" o negocio
            Kaprekar kr = new Kaprekar();    
        

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
                kr.numero = c.leerEntero("Número de 4 Dígitos");

        //Evaluar datos

        //Invocar los métodos/algoritmos usando el modelo
                    kr.calcularKaprekar();

        //mostrar / imprimir los datos de salida
        if(kr.numero<9999)
        c.imprimir ("Ciclos Kaprekar: " + kr.ciclos);
        else
        c.imprimir ("Datos Inválidos");
    }
}//fin class MainKaprekar
