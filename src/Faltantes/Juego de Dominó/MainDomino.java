
/**
 * Use los comentarios para explicar el objetivo de este programa MainDomino .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 3.2
 */
public class MainDomino
{
    public static void main(String [] args){
        //Crear objeto del modelo "M" o negocio
        Domino d = new Domino();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada
        d.numero1 = c.leerEntero("Número 1:");
        d.numero2 = c.leerEntero("Número 2:");
        d.numero3 = c.leerEntero("Número 3:");

        
        d.algoritmo();
        
        if (d.numero1Valido && d.numero2Valido && d.numero3Valido){
            if (d.fichasDuplicadas){
                c.imprimir("Hay un error de fichas duplicadas");
            }
            else{
                if (d.dosExtremos){
                    c.imprimir("Se puede jugar a cualquiera de los dos extremos");
                }
                else{
                    if (d.extremoDerecho){
                        c.imprimir("Se  puede jugar al extremo derecho");
                    }
                    else{
                        if (d.extremoIzquierdo){
                            c.imprimir("Se  puede jugar al extremo izquierdo");
                        }
                        else{
                            if (d.noJugar){
                                c.imprimir("No se puede jugar, debe pasar");
                            }
                        }
                    }
                }
            }    
        }
        else{    
            if (!d.numero1Valido && !d.numero2Valido && !d.numero3Valido){
                System.out.println("Los tres números no corresponden a una ficha de dominó");
            }
            else{
                System.out.println("Alguno de los tres números no corresponde a una ficha de dominó");
            }
        }
    }
}//end class
