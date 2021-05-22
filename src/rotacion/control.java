/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotacion;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           funcion r = new funcion();

       //Leer datos de entrada usando la vista
           r.x1 = c.leerDouble("x1");
           r.y1 = c.leerDouble("y1");
           r.x2 = c.leerDouble("x2");
           r.y2 = c.leerDouble("y2");
           r.x3 = c.leerDouble("x3");
           r.y3 = c.leerDouble("y3");
           r.x4 = c.leerDouble("x4");
           r.y4 = c.leerDouble("y4");

       //Invocar los métodos/algoritmos del modelo
           r.algoritmo();

       //Mostrar los datos de saluda usando la vista
           c.imprimir ("Puntos del Rectángulo Rotado:\n" 
                 + ("(" + r.x1Rotado + "," + r.y1Rotado + "),"+ "\n")
                 + ("(" + r.x2Rotado + "," + r.y2Rotado + "),"+ "\n") 
                 + ("(" + r.x3Rotado + "," + r.y3Rotado + ")," + "\n") 
                 + ("(" + r.x4Rotado + "," + r.y4Rotado + ")"));
            c.imprimir("Ángulo de Rotación: " + r.anguloRotacion);
    }
    
}
