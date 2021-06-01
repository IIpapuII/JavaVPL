
/**
 * Use los comentarios para explicar el objetivo de este programa MainFechaDias .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 3.0
 */
public class MainFechaDias
{
    public static void main(String [] args){
           //Crear la vista
                Consola c = new Consola();
           //Crear el modelo
                 FechaDias x = new FechaDias();
           //Leer datos de entrada usando la vista
              x.fecha= c.leerEntero (/*""*/);
              x.diasTrancurridos= c.leerEntero (/*""*/);
           //Invocar los métodos/algoritmos del modelo
              x.algoritmo();
       //Mostrar los datos de salida usando la vista
        if (x.fechaNuevaDia < 10 && x.fechaNuevaMes <10 && x.diasTrancurridos != 0  ){
            c.imprimir("Dentro de " + x.diasTrancurridos + " días será " + "0"  + x.fechaNuevaDia + "/" + "0"   + x.fechaNuevaMes + "/" + x.fechaNuevaAño );

        } else {
            if ( x.fechaNuevaDia < 10 && x.diasTrancurridos != 0){
                c.imprimir("Dentro de " + x.diasTrancurridos + " días será " + "0"  + x.fechaNuevaDia + "/"  + x.fechaNuevaMes + "/" + x.fechaNuevaAño );
            } 
            if ( x.fechaNuevaMes <10 && x.diasTrancurridos != 0){
                c.imprimir("Dentro de " + x.diasTrancurridos + " días será "  + x.fechaNuevaDia + "/" + "0"  + x.fechaNuevaMes + "/" + x.fechaNuevaAño );
            }
        }
        // 19941231
        
        if (x.dia >= 10 && x.mes >= 10 && x.diasTrancurridos == 0  ){
            c.imprimir("Dentro de " + x.diasTrancurridos + " días será "  + x.dia + "/" + x.mes + "/" + x.año );
        }
        
        if(x.fechaNuevaDia >= 10 && x.fechaNuevaMes >= 10 && x.diasTrancurridos != 0){
              c.imprimir("Dentro de " + x.diasTrancurridos + " días será "  + x.fechaNuevaDia + "/" + x.fechaNuevaMes + "/" + x.fechaNuevaAño );
            }
            
    }//end main
}//end class MainFechaDias 

