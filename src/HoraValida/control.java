/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoraValida;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consola a = new Consola();
        funcion p = new funcion();
        
       p.horas = a.leerEntero("Horas: ");
       p.minutos = a.leerEntero("Minutos: ");
       p.segundos = a.leerEntero("Segundos: ");
       
       p.algoritmo();
       a.imprimir("¿Hora es válida? " + p.salidad);
    }
    
}
