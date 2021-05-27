/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.EdadDelPerro;

/**
 *
 * @author IIpapuII
 */
public class EdadPerro {

   
     public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        funcion e = new funcion();
        //Crear objeto Vista "V"
        Consola c = new Consola(); 

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        e.edadDelhumano= c.leerDouble("Edad del Humano:");

        if(e.edadDelhumano <0)
            c.imprimir("Datos no Válidos");

        //invocar el algoritmo o los algoritmos, usando el Modelo
        else{

            e.algoritmo();
            if(e.edadDelhumano == 0){
                c.imprimir("Edad del Perro:" + e.cero);}
            if(e.edadDelhumano == 1){
                c.imprimir("Edad del Perro:" + e.unAño);}
            if(e.edadDelhumano == 2){
                c.imprimir("Edad del Perro:" + e.dosAños);}
            if(e.edadDelhumano >= 3){
                c.imprimir("Edad del Perro:" + e.masAños);}

            //invocar el algoritmo o los algoritmos, usando el Modelo
        }
    } 
    
}
