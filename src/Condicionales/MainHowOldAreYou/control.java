/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.MainHowOldAreYou;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        funcion h = new funcion();
        Consola c = new Consola();

        h.fecha1 = c.leerEntero("Fecha 1 DDMMYYYY");
        h.fecha2 = c.leerEntero("Fecha 2 DDMMYYYY");

        h.algoritmo();

        if ((!h.fecha1Valida) && (!h.fecha2Valida)) {
            c.imprimir("Ninguna de las fechas  es válida");
        } else {
            if ((!h.fecha1Valida) || (!h.fecha2Valida)) {
                c.imprimir("Alguna de las fechas no es válida");
            } else {

                if (h.edad < 3) {
                    c.imprimir("Las fechas corresponden a un bebé");
                }
                if ((h.edad >= 3) && (h.edad < 6)) {
                    c.imprimir("Las fechas corresponden a un párvulo");
                }
                if ((h.edad >= 6) && (h.edad < 10)) {
                    c.imprimir("Las fechas corresponden a un infante");
                }
                if ((h.edad >= 10) && (h.edad < 17)) {
                    c.imprimir("Las fechas corresponden a un adolescente");
                }
                if ((h.edad >= 17) && (h.edad < 25)) {
                    c.imprimir("Las fechas corresponden a un universitario");
                }
                if (h.edad >= 25) {
                    c.imprimir("¿Cuándo se gradúa?");
                }
            }
        }
    }

}
