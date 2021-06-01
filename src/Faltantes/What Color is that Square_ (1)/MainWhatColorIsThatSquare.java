
/**
 * Use los comentarios para explicar el objetivo de este programa MainWhatColorIsThatSquare .
 *
 * @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co
 * @version 2.1
 */
public class MainWhatColorIsThatSquare
{
    public static void main(String [] args){
            //Crear objeto del modelo "M" o negocio
            WhatColorThatSquare m = new WhatColorThatSquare();
                //Crear objeto Vista "V"
                Consola c = new Consola();

        //leer los datos de entrada
        m.columna =  c.leerCaracter("Ingrese la columna: ");
        m.fila = c.leerCaracter("Ingrese la fila: ");

        m.algoritmo();
        //mostrar / imprimir los datos de salida
        //validar datos
        if(!m.coordenadasValidas){
            c.imprimir("Datos Incorrectos");
        }
    }
}
