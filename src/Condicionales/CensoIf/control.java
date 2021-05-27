/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.CensoIf;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        funcion ce = new funcion();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        ce.edad= c.leerDouble("Edad");
        ce.estatura= c.leerDouble("Estatura");
        ce.peso= c.leerDouble("Peso");
        
        
        
        ce.algoritmo();

        if(ce.edadFuera || ce.estaturaFuera || ce.pesoFuera){
            if(ce.edadFuera)
                c.imprimir("Edad fuera de rango.");
            if(ce.estaturaFuera)
                c.imprimir("Estatura fuera de rango.");
            if(ce.pesoFuera)
                c.imprimir("Peso fuera de rango");
        }
        //mostrar / imprimir los datos de salida
        if(!ce.edadFuera){
            if(ce.joven)
                c.imprimir("Joven.");
            if(ce.adulto)
                c.imprimir("Adulto.");
            if(ce.segundaEdad)
                c.imprimir("Segunda Edad.");
        }
        if(!ce.estaturaFuera){
            if(ce.estaturaBaja)
                c.imprimir("Estatura baja.");
            if(ce.estaturaPromedio)
                c.imprimir("Estatura Promedio.");
            if(ce.estaturaAlta)
                c.imprimir("Estatura Alta.");
        }
        if(!ce.pesoFuera){
            if(ce.pesoBajo)
                c.imprimir("Peso Bajo.");
            if(ce.pesoPromedio)
                c.imprimir("Peso Promedio.");
            if(ce.pesoAlto)
                c.imprimir("Peso Alto.");
        }
        } 
    
}
