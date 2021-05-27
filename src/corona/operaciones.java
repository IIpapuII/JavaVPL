/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corona;

/**
 *
 * @author IIpapuII
 */

public class operaciones {
    Consola d = new Consola();
    //definicion de variables globales 
    int dia1;
    int dia2;
    int dia3;
    int dia4;
    int dia5;
    int dia6;
    //definicion de la funcion de calcula los porcentajes
     void porcentaje(){
         int sal1;
         float sal2;
         float sal3;
         float sal4;
         float sal5;
         float sal6;
         //opeaciones realizadas para la optecion de los porcentajes
         sal2 = ((float)(dia2-dia1)/dia2)*100;
         sal3 = ((float)(dia3-dia2)/dia3)*100;
         sal4 = ((float)(dia4-dia3)/dia4)*100;
         sal5 = ((float)(dia5-dia4)/dia5)*100;
         sal6 =((float)(dia6-dia5)/dia6)*100;
         sal1 = ((int)sal2+(int)sal3+(int)sal4+(int)sal5+(int)sal6)/5;
         //salida de los valores
         d.imprimir("Porcentaje de Contagio 1: "+(int)sal2);
         d.imprimir("Porcentaje de Contagio 2: "+(int)sal3);
         d.imprimir("Porcentaje de Contagio 3: "+(int)sal4);
         d.imprimir("Porcentaje de Contagio 4: "+(int)sal5);
         d.imprimir("Porcentaje de Contagio 5: "+(int)sal6);
         d.imprimir("Promedio del Porcentaje : "+sal1);
    }
       
}
