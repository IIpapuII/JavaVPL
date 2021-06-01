/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoPrevio;

/**
 *
 * @author IIpapuII
 */
public class funcion {

    Consola a = new Consola();
    String Acccion;
    String claveletras;
    int k;
    int numeroclave;
  
    void Encriptar() {
        int generado = 0;
        int inicial2=1;
        int inicial=0;
        numeroclave = a.leerEntero("Clave sin incriptar:");
        k = a.leerEntero("K:");
        for (int i=0; i > k;i++ ){
            
            generado = inicial + inicial2;
            inicial = inicial2;
            inicial2 = generado;
            
            a.imprimir(generado);
        }
    }

    void Desipcriptar() {
        
    }
}
