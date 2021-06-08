/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

/**
 *
 * @author Daniela
 */
public class Buscador {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           funcion b = new funcion();

       //Leer datos de entrada usando la vista
         int n = c.leerEntero("Cantidad de Elementos: ");
         b.numeros = new int [n];
         for(int i=0; i<b.numeros.length; i++){
            b.numeros[i]= c.leerEntero("numero["+i+"]"); 
            }
          b.numero = c.leerEntero("Escriba el numero: "); 
          b.algoritmo();
          c.imprimir("Numero " + b.numero + (b.existe ? " SI" : " No") + " existe");
       
    
    }
    
}
