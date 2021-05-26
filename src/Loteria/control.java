/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loteria;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           funcion l = new funcion();

       //Leer datos de entrada usando la vista
           l.ganador = c.leerEntero("Numero Ganador");//maximo 4 digitos
           l.apostado = c.leerEntero("Numero Apostado");//maximo 4 digitos  
           l.apuestaPleno = c.leerEntero("Apuesta a Pleno");
           l.apuestaPlenoInvertido = c.leerEntero("Apuesta a Pleno Invertido");
           l.apuestaPata = c.leerEntero("Apuesta a Pata");

       //Invocar los métodos/algoritmos del modelo
           l.algoritmo();

       //Mostrar los datos de saluda usando la vista
        c.imprimir("Gana Pleno : " + l.ganaPleno);
        c.imprimir("Gana Pleno Invertido : " + l.ganaPlenoInvertido);
        c.imprimir("Gana Pata : " + l.ganaPata);
        c.imprimir("Valor Gana Pleno: " + l.valorPleno);
        c.imprimir("Valor Gana Pleno Invertido: " + l.valorPlenoInvertido);
        c.imprimir("Valor Gana Pata: " + l.valorPata);
        c.imprimir("Valor Gana Total: " + l.valorTotal);
    }
    
}
