/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.DiaDeLaSemana;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){
           Consola c = new Consola();
           funcion q = new funcion ();

       //Leer datos de entrada usando la vista
           q.dia = c.leerEntero("Dia: ");
           q.mes = c.leerEntero("Mes: ");
           q.año = c.leerEntero("Año: ");
       //Invocar los métodos/algoritmos del modelo
           q.algoritmo();
           
             if(q.diaZeller==0){
                 c.imprimir("Domingo");
                }
             if(q.diaZeller==1){
                 c.imprimir("Lunes");
                }
             if(q.diaZeller==2){
              c.imprimir("Martes");
             }
             if(q.diaZeller==3){
              c.imprimir("Miércoles");
             }
             if(q.diaZeller==4){
              c.imprimir("Jueves");
             }
             if(q.diaZeller==5){
              c.imprimir("Viernes");
             }
             if(q.diaZeller==6){
              c.imprimir("Sábado");
             }
            }
    
}
