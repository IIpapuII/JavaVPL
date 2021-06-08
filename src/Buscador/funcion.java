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
public class funcion {
       //entradas
    int [] numeros;
    int numero;
    //salidas
    boolean existe;
    //algoritmo
    
    void algoritmo( ){
       //void encontrarNumero (){
        existe = false;
        for(int i=0; i<numeros.length; i++){
            if(numero == numeros[i]){
                existe=true;

            }
        }
    }//fin method
}
