/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencias;

/**
 *
 * @author IIpapuII
 */
public class funcion {
    //entradas

    int radioC1;
    int centroX1;
    int centroY1;
    int radioC2;
    int centroX2;
    int centroY2;
    //salidas
    double distanciaEntreCentros;
    double sumaDeRadios;
    double restaDeRadios;
    boolean exteriores;
    boolean tangentesExteriores;
    boolean secantes;
    boolean tangentesInteriores;
    boolean interiores;
    boolean concentricas;
    double x;
    double y;
    double numero;
    //algoritmo

    void algoritmo() {
        x = (centroX2 - centroX1);
        y = (centroY2 - centroY1);
        numero = (x * x) + (y * y);
        distanciaEntreCentros = Math.sqrt(numero);
        sumaDeRadios = radioC1 + radioC2;
        restaDeRadios = radioC1 - radioC2;
        exteriores = (distanciaEntreCentros > sumaDeRadios);
        tangentesExteriores = (distanciaEntreCentros == sumaDeRadios);
        secantes = (distanciaEntreCentros < sumaDeRadios) && (distanciaEntreCentros > restaDeRadios);
        tangentesInteriores = (distanciaEntreCentros == restaDeRadios);
        concentricas = (distanciaEntreCentros == 0);
        interiores = (distanciaEntreCentros < restaDeRadios) && !concentricas;

    }//fin method
}
