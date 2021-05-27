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
public class funcion {
    //entradas
    int dia;
    int mes;
    int año;
    //salidas
    int factorC;
    int mesZeller;
    int añoZeller;
    int diaZeller;
    
    //algoritmo
    
    void algoritmo( ){
      factorC=(14-mes)/12;
      mesZeller= mes-2+(12*factorC);
      añoZeller= (año-factorC);
      diaZeller= (dia + añoZeller + añoZeller/4 - añoZeller/100 + añoZeller/400 + (31 * mesZeller)/12)%7;
    }//fin method
}
