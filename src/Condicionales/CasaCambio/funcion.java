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
public class funcion {
    //entradas
    double preciodeCompradelDolar;
    double preciodeVentadelDolar;
    double cantidadInicialdePesos;
    double cantidadInicialdeDolares;
    double cantidaddeDolaresComprados;
    double cantidaddeDolaresVendidos;
    //salidas
    double cantidadFinaldePesos;
    double cantidadFinaldeDolares;
    boolean informacionValida;
    void algoritmo(){
     //transformar las entradas en salidas
     cantidadFinaldePesos = (cantidadInicialdePesos+(cantidaddeDolaresVendidos*preciodeVentadelDolar))-(cantidaddeDolaresComprados*preciodeCompradelDolar);
     cantidadFinaldeDolares = (cantidadInicialdeDolares+cantidaddeDolaresComprados)-cantidaddeDolaresVendidos;
     informacionValida = (cantidadFinaldePesos>=0 & cantidadFinaldeDolares>=0);
    
    } 
}
