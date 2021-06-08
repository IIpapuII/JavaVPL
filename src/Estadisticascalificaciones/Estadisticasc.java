/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estadisticascalificaciones;

/**
 *
 * @author Daniela
 */
public class Estadisticasc {

    /**
     * @param args the command line arguments
     */
   public static void main(String [] args){
        //Crear la vista
        Consola c = new Consola();
        //Crear el modelo
        funcion r = new funcion();

        int n = c.leerEntero();
        
        r.notas = new float [n];
        for(int i=0; i<n; i++){
            r.notas[i] = c.leerFloat();
        }
        
        r.estadistica();
    
        c.imprimir("% Excelente:" +  r.ex);
        c.imprimir("% Bueno:" +  r.bu);
        c.imprimir("% Aprobado:" +  r.ac);
        c.imprimir("% Condicional:"  + r.co);
        c.imprimir("% Reprobado:"  + r.re);
    }
    
}
