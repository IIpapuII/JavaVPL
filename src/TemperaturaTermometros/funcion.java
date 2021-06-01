/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperaturaTermometros;

/**
 *
 * @author IIpapuII
 */
public class funcion {

    Consola a = new Consola();
    double c;
    double k;
    double f;
    double kc;
    double fc;
    double ck;
    double kf;
    double fk;
    double cf;
    boolean equivalentes;

    void Entradatos() {
        c = a.leerDouble("Celcius: ");
        f = a.leerDouble("farenheit: ");
        k = a.leerDouble("Kelvin: ");

    }

    void Operaciones() {
        kc = k - 273;
        fc = (5 * (f - 32)) / 9;
        ck = c + 273;
        kf = ((9 * (k - 273)) / 5) + 32;
        fk = ((5 * (f - 32)) / 9) + 273;
        cf = ((9 * c) / 5) + 32;
        equivalentes =(Math.round(cf) == Math.round(kf))&& (Math.round(ck) == Math.round(fk))&& (Math.round(fc) ==Math.round(kc));
    }

    void Salidad() {
        a.imprimir("Celsius a Farenheit: " + cf);
        a.imprimir("Celsius a Kelvin: " + ck);
        a.imprimir("Farenheit a Celsius: " + fc);
        a.imprimir("Farenheit a Kelvin: " + fk);
        a.imprimir("Kelvin a Celsius: " + kc);
        a.imprimir("kelvin a Farenheit: " + kf);
        a.imprimir("Equivalentes: "+equivalentes);

    }
}
