
/**
 * Use los comentarios para explicar el objetivo de este programa MainTorneoDeFutbol .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 3.1
 */
public class MainTorneoDeFutbol
{
    public static void main(String [] args){
       //Crear objeto del modelo "M" o negocio
        TorneoDeFutbol t = new TorneoDeFutbol();    
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        t.numero1 =   c.leerLong ("Escriba el número 1");
        t.numero2 =   c.leerLong ("Escriba el número 2");

        //Evaluar datos

        //Invocar los métodos/algoritmos usando el modelo
        t.algoritmo();

        //mostrar / imprimir los datos de salida
        c.imprimir ("Partidos Ganados:   " + t.ganados);
        c.imprimir ("Partidos Empatados: " + t.empatados);
        c.imprimir ("Partidos Perdidos:  " + t.perdidos);
        c.imprimir ("Puntos:             " + t.puntos);
        c.imprimir ("Goles a favor:      " + t.golesFavor);
        c.imprimir ("Goles en contra:    " + t.golesContra);
    }
}//fin class MaintorneoDeFutbolDeMatemáticos
