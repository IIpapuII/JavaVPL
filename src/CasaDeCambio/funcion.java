/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasaDeCambio;

/**
 *
 * @author IIpapuII
 */
public class funcion {

    Consola a = new Consola();
    double compraDolar;
    double ventaDolar;
    double inicialPesos;
    double inicialDolares;
    double dolaresComparados;
    double dolaresvendidos;
    //variables de salida
    double finalpesos;
    double finalDolares;
    boolean validad;

    void EntradaDatos() {
        compraDolar = a.leerDouble("Precio de Compra de dolar:");
        ventaDolar = a.leerDouble("Precio de Venta del Dolar:");
        inicialPesos = a.leerDouble("Cantidad Inicial de Pesos:");
        inicialDolares = a.leerDouble("Cantidad Inicial Dolares:");
        dolaresComparados = a.leerDouble("Cantidad Dolares Comprados:");
        dolaresvendidos = a.leerDouble("Cantidad Dolares vendidos");
    }

    void Operaciones() {
        finalpesos = (inicialPesos + (dolaresvendidos * ventaDolar)) - (dolaresComparados * compraDolar);
        finalDolares = (inicialDolares + (dolaresComparados)) - dolaresvendidos;
        validad = finalpesos > 0 && finalDolares > 0;
    }

    void SalidaDatos() {
        a.imprimir("Cantidad Final de Pesos: " + finalpesos);
        a.imprimir("Cantidad Final de Dolares: " + finalDolares);
        a.imprimir("Informacion valida: " + validad);

    }

}
