/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoCircunferencia;

/**
 *
 * @author IIpapuII
 */
public class funcion {
    // Entradas de datos
    Consola a = new Consola();
    double coordenadaXcentro;
    double coordenadaYcentro;
    double radio;
    double CoordenadaXpunto;
    double CoordenadaYdelpunto;
    double Distancia;
    boolean puntoDentro;
    boolean puntoFuera;
    boolean puntoBorde;
    void EntradaDatos(){
      coordenadaXcentro=  a.leerDouble("Coordenada X del centro: ");
      coordenadaYcentro=   a.leerDouble("Cordenada Y del centro: ");
      radio = a.leerDouble("Radio: ");
      CoordenadaXpunto = a.leerDouble("Coordenada X del punto: ");
      CoordenadaYdelpunto = a.leerDouble("Cordenada Y del Punto");
    }
    void  procedimiento(){
        Distancia = Math.sqrt(Math.pow((CoordenadaXpunto-coordenadaXcentro),2)+Math.pow((CoordenadaYdelpunto-coordenadaYcentro), 2));
        puntoDentro = radio> Distancia;
        puntoFuera = radio<Distancia;
        puntoBorde = radio == Distancia;
    }
    
    void salida(){
        a.imprimir("Punto Dentro    : "+puntoDentro);
        a.imprimir("Punto Fuera     : "+puntoFuera);
        a.imprimir("Punto En Borde : "+puntoBorde);
    }
}
