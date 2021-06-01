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
public class funcion {

    Consola a = new Consola();
    //Entrada de datos
    int horas;
    int minutos;
    int segundos;
    boolean ValorHora;
    boolean ValorMinutos;
    boolean valorSegundos;
    boolean salidad;

    void algoritmo() {
        ValorHora = 0 >= horas || horas <= 23;
        ValorMinutos = 0 >= minutos || minutos <= 59;
        valorSegundos = 0 >= segundos || segundos <= 59;
        salidad = (ValorHora && ValorMinutos)&& (ValorHora && valorSegundos) ;
  
    }

}
