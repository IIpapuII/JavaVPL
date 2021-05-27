/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.CasaCambio;

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
        funcion cc = new funcion();
        //Crear objeto Vista "V"
        Consola c = new Consola(); 

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        cc.preciodeCompradelDolar= c.leerDouble("Precio de compra del Dolar:");
        cc.preciodeVentadelDolar= c.leerDouble("Precio de venta del Dolar:");
        cc.cantidadInicialdePesos= c.leerDouble("Cantidad Inicial de Pesos:");
        cc.cantidadInicialdeDolares= c.leerDouble("Cantidad Inicial de Dolares:");
        cc.cantidaddeDolaresComprados= c.leerDouble("Cantidad Dolares Comprados:");
        cc.cantidaddeDolaresVendidos= c.leerDouble("Cantidad Dolares Vendidos:");

        //invocar el algoritmo o los algoritmos, usando el Modelo
        cc.algoritmo();
        c.imprimir("Cantidad Final de Pesos: " + cc.cantidadFinaldePesos);
        c.imprimir("Cantidad Final de Dolares: " + cc.cantidadFinaldeDolares);
        if((cc.cantidadFinaldePesos>0) && (cc.cantidadFinaldeDolares>0)){
            c.imprimir("El negocio va bien ;)");
        }
        if((cc.cantidadFinaldePesos<0) || (cc.cantidadFinaldeDolares<0)){
            c.imprimir("Hay pérdidas. Cambie de Casa de Cambio.");
        }

    } 
    
}
