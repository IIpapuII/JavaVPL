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
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear la vista
        Consola c = new Consola();
        //Crear el modelo
        funcion dc = new funcion();

        //Leer datos de entrada usando la vista
        dc.radioC1 = c.leerEntero("Radio circunferencia 1");
        dc.centroX1 = c.leerEntero("Centro x circunferencia 1");
        dc.centroY1 = c.leerEntero("Centro y circunferencia 1");
        dc.radioC2 = c.leerEntero("Radio circunferencia 2");
        dc.centroX2 = c.leerEntero("Centro x circunferencia 2");
        dc.centroY2 = c.leerEntero("centro y circunferencia 2");
        //Invocar los métodos/algoritmos del modelo
        dc.algoritmo();

        //Mostrar los datos de saluda usando la vista
        c.imprimir("Distancia entre centros = " + dc.distanciaEntreCentros);
        c.imprimir("Suma de radios          = " + dc.sumaDeRadios);
        c.imprimir("Resta de radios         = " + dc.restaDeRadios);
        c.imprimir("Exteriores           = " + dc.exteriores);
        c.imprimir("Tangentes Exteriores = " + dc.tangentesExteriores);
        c.imprimir("Secantes             = " + dc.secantes);
        c.imprimir("Tangentes Interiores = " + dc.tangentesInteriores);
        c.imprimir("Interiores           = " + dc.interiores);
        c.imprimir("Concéntricas         = " + dc.concentricas);

    }
}
