/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relojinvertido;

/**
 *
 * @author IIpapuII
 */

public class reloinvertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas;
        int minutos;
        int segundos;
        int total;
        
       Consola d = new Consola();
       horas = d.leerEntero("Ingrese horas");
       minutos = d.leerEntero("ingrese minutos");
       segundos = d.leerEntero("Ingrese segundos");
       
       // operaciones
       horas = (horas*60)*60;
       minutos = minutos *60;
       total = horas + minutos + segundos;
       d.imprimir("Tiempo total en segundos: "+total);
    }
    
}
