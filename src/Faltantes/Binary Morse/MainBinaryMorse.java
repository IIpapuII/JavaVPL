
/**
 * Use los comentarios para explicar el objetivo de este programa MainBinaryMorse .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
    public class MainBinaryMorse
{
 public static void main(String [] args){
     //Crear objeto Vista
    Consola c = new Consola();
    //Crear objeto del Modelo 
     BinaryMorse b = new BinaryMorse(); 
     
     //Leer datos de entrada usando Vista 
     b.binaryMorse = c.leerLong(); 
   
     //invocar los metodos/algoritmos del modelo 
     b.algoritmo(); 
     
     //Mostrar los datos de salida usando la Vista 
     if(b.binaryMorse<0){
         c.imprimir("Error, número negativo");
        }
        else {
        c.imprimir("Salida Binary Morse:  " + b.decimal);
        }
        
    }
}//Fin Class MainBinaryMorse