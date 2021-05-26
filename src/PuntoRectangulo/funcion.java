/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoRectangulo;

/**
 *
 * @author IIpapuII
 */
public class funcion {
     //entradas
    double coordenadaXEsquina; 
    double coordenadaYEsquina;
    double ancho;
    double alto;
    double coordenadaXDelPunto;
    double coordenadaYDelPunto;
    //salidas
    double an;
    double al;
    boolean puntoDentro;
    boolean puntoFuera;
    boolean puntoBordeSuperior;
    boolean puntoBordeInferior;
    boolean puntoBordeIzquierdo;
    boolean puntoBordeDerecho;
    //algoritmo
    
    void algoritmo( ){
    an = coordenadaXEsquina+ancho; 
    al = coordenadaYEsquina-alto;
    puntoDentro = ((coordenadaXDelPunto<an)&&(coordenadaXDelPunto>coordenadaXEsquina)&&(coordenadaYDelPunto>al)&&(coordenadaYDelPunto<coordenadaYEsquina));
    puntoFuera = ((coordenadaXDelPunto>an)||(coordenadaXDelPunto<coordenadaXEsquina)||(coordenadaYDelPunto<al)||(coordenadaYDelPunto>coordenadaYEsquina));
    puntoBordeSuperior = ((coordenadaXDelPunto<an)&&(coordenadaXDelPunto>coordenadaXEsquina))&&(coordenadaYDelPunto==coordenadaYEsquina);
    puntoBordeInferior = ((coordenadaXDelPunto<=an)&&(coordenadaXDelPunto>=coordenadaXEsquina))&&(coordenadaYDelPunto==al);
    puntoBordeIzquierdo = (coordenadaXDelPunto==coordenadaXEsquina)&&((coordenadaYDelPunto>=al)&&(coordenadaYDelPunto<=coordenadaYEsquina));
    puntoBordeDerecho = (coordenadaXDelPunto==an)&&((coordenadaYDelPunto>=al)&&(coordenadaYDelPunto<=coordenadaYEsquina));
     
    
    }//fin method
}
