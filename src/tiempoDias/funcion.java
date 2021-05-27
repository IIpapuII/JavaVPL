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
public class funcion {
    //entradas
    long numero;
    //salidas
    long horaN1;
    long segundos1;
    long minutos1;
    long hora1;
    long horasN2; 
    long segundos2;
    long minutos2;
    long hora2;
    double h1;
    double h2;
    double resta;
    double tiempoDias;
    
    //algoritmo
    
    void algoritmo( ){
    horaN1 = numero/1000000;
    segundos1 = horaN1/10000;
    minutos1 = (horaN1%10000)/100;
    hora1 = (horaN1%10000)%100;
    horasN2 = numero%1000000; 
    segundos2 = horasN2/10000;
    minutos2 = (horasN2%10000)/100;
    hora2 = (horasN2%10000)%100;
    h1= hora1*60*60+minutos1*60+segundos1;
    h2= hora2*60*60+minutos2*60+segundos2;
    resta= h2-h1;
    tiempoDias= resta/(24*60*60);
    
    
    
    }//fin method
}
