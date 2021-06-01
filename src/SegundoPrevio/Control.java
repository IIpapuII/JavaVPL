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
public class Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consola a = new Consola();
        funcion t  = new funcion();
        t.Acccion = a.leerCadena("Acccion:");
        if (t.Acccion == "Encriptar"){
            
            t.Encriptar();
        }else {
            t.Desipcriptar();
        }
    }
    
}
