/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuacionCuadratica;

/**
 *
 * @author IIpapuII
 */
public class funcion {

    Consola q = new Consola();
    int a;
    int b;
    int c;
    boolean haciArriba;
    boolean haciaAbajo;
    boolean nosoluciones;
    boolean unaSolucion;
    boolean dosSoluciones;
    int decriminante;
    int t;

    void EntradaDAtos() {
        a = q.leerEntero("a:");
        b = q.leerEntero("b");
        c = q.leerEntero("c");

    }

    void Operaciones() {
        decriminante = (int) (Math.pow(b, 2) - 4 * a * c);
        t = 2*a;

        haciArriba = a > 0 &&(decriminante > 0 || decriminante == 0 || decriminante < 0);
        haciaAbajo=a<0 &&(decriminante > 0 || decriminante == 0 || decriminante < 0);
        nosoluciones = decriminante <0;
        unaSolucion =  decriminante ==0;
        dosSoluciones = decriminante >0;
        
        
    }

    void Salida() {

        q.imprimir("Concavidad hacia arriba: " + haciArriba);
        q.imprimir("Concavidad hacia abajo:  "+ haciaAbajo);
        q.imprimir("No hay soluciones:       "+ nosoluciones);
        q.imprimir("Hay una solución:        "+ unaSolucion);
        q.imprimir("Hay dos soluciones:      "+dosSoluciones);
        q.imprimir("Solucion:                "+"( -"+ b+" ± √("+decriminante+") ) / "+t);
        
    }

}
