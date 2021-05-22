/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Velocidadnet;

/**
 *
 * @author IIpapuII
 */
public class Internet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int velocidad;
        int bytes;
        int megas;
        float segundos;
        Consola datos = new Consola();
        velocidad = datos.leerEntero("Ingrese la velocidad");
        bytes = datos.leerEntero("Ingrese datos a decargar");
        megas = (velocidad * 1000000)/8;
        
        segundos=(bytes/megas);
        datos.imprimir(megas);
        datos.imprimir("Tiempo de Transferencia : "+ (int)segundos);
    }
    
}
