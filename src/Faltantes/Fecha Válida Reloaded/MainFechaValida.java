/**
 * Use los comentarios para explicar el objetivo de este programa 
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 4.0
 */
public class MainFechaValida
{
    public static void main(String [] args)

    {
        //Crear objeto del modelo
        FechaValida f = new FechaValida();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        f.dia = c.leerEntero ("Escriba el dia:");
        f.mes = c.leerCaracter("Escriba el mes (E,F,M,A,Y,J,L,G,S,O,N,D)");
        f.año = c.leerEntero ("Escriba el año:");

        //invocar el algoritmo o los algoritmos, usando el Modelo
        f.algoritmo();

        //mostrar / imprimir los datos de salida
        if(f.datosIncorrectos){
            c.imprimir("Datos de entrada incorrectos");
        }
        else{
            if (f.meses30==true||f.meses31==true||f.f1==true||f.f2==true)
                c.imprimir("Fecha Válida");
            else{
                c.imprimir("Fecha NO Válida");
            }
        }   
    }
}