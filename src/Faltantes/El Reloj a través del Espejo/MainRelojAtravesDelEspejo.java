/**
 * Use los comentarios para explicar el objetivo de este programa MainRelojAravesDelEspejo .
 *
 * @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co
 * @version 2.1
 */
public class MainRelojAtravesDelEspejo
{
    public static void main(String [] args){
        //Crear objeto del modelo "M" o negocio
        RelojAtravesDelEspejo e = new RelojAtravesDelEspejo();
              //Crear objeto Vista "V"
              Consola c = new Consola();
                    //leer los datos de entrada
                    e.horaNormal = c.leerEntero("Hola en el espejo: ");
        
        e.algoritmo();
       
        if ( e.horaValidaFinal ){
            c.imprimir("Hora Real: "+ e.horaPrimeraParte +  e.horaSegundaParte +":"+ e.minutoPrimeraParte + e.minutoSegundaParte);
        }
        else{
            c.imprimir("Datos Incorrectos");
        }
    }
}
