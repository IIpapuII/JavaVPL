/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoTrianguloSimple;

/**
 *
 * @author IIpapuII
 */
public class funcion {
    Consola a = new Consola();
    int lado1;
    int lado2;
    int lado3;
    boolean eq;
    boolean iso;
    boolean esc;

    void EntradaDAtos() {
        lado1 = a.leerEntero("Lado 1: ");
        lado2 = a.leerEntero("Lado 2");
        lado3 = a.leerEntero("lado 3");
    }
    
    void Operaciones(){
        
        eq = lado1 == lado2 && lado3== lado1;
        iso = (lado1 == lado2 || lado2==lado3 || lado1 == lado3) && (lado1 != lado2 || lado1 != lado3 || lado2 != lado3);
        esc = lado1 != lado2 && lado1 != lado3 && lado2 != lado3;
    }
    
    void Salidad(){
        a.imprimir("Equilátero: "+ eq);
        a.imprimir("Isósceles: "+ iso);
        a.imprimir("Escaleno:"+ esc);
   
    }

}
