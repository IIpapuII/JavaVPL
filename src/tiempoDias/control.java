/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempoDias;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           funcion td = new funcion();

       //Leer datos de entrada usando la vista
           td.numero = c.leerLong("Escriba el Numero");

       //Invocar los métodos/algoritmos del modelo
           td.algoritmo();

       //Mostrar los datos de saluda usando la vista
           c.imprimir("El tiempo transcurrido en días es: " + td.tiempoDias);
    }
    
}
