/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosrectangulos;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           funcion dt = new funcion();

       //Leer datos de entrada usando la vista
           dt.rectangulo1X1 = c.leerEntero("Rectángulo 1 x1");
           dt.rectangulo1Y1 = c.leerEntero("Rectángulo 1 y1");
           dt.rectangulo1Ancho = c.leerEntero("Rectángulo 1 ancho");
           dt.rectangulo1Alto = c.leerEntero("Rectángulo 1 alto");
           dt.rectangulo2X1 = c.leerEntero("Rectángulo 2 x1");
           dt.rectangulo2Y1 = c.leerEntero("Rectángulo 2 y1");
           dt.rectangulo2Ancho = c.leerEntero("Rectángulo 2 ancho");
           dt.rectangulo2Alto = c.leerEntero("Rectángulo 2 alto");

       //Invocar los métodos/algoritmos del modelo
           dt.algoritmo();

       //Mostrar los datos de saluda usando la vista
           c.imprimir("Puntos del Rectángulo 1: ("+ dt.r1X1 +","+ dt.r1Y1 +"), ("+ dt.r1X2 +","+ dt.r1Y2 +"), ("+ dt.r1X3 +","+ dt.r1Y3 +"), ("+ dt.r1X4 +","+ dt.r1Y4+")");
           c.imprimir("Puntos del Rectángulo 2: ("+ dt.r2X1 +","+ dt.r2Y1 +"), ("+ dt.r2X2 +","+ dt.r2Y2 +"), ("+ dt.r2X3 +","+ dt.r2Y3 +"), ("+ dt.r2X4 +","+ dt.r2Y4+")");
           c.imprimir("Rectángulos Interiores: " + dt.interiores);
           c.imprimir("Rectángulos Exteriores: " + dt.exteriores);
           c.imprimir("Rectángulos Secantes: " + dt.secantes);
           c.imprimir("Rectángulos Tangentes: " + dt.tangentes);
    }
    
}
