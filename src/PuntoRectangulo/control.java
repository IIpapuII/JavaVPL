<<<<<<< HEAD
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
public class control {

    /**
     * @param args the command line arguments
     */
   public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           funcion p = new funcion();

       //Leer datos de entrada usando la vista
            p.coordenadaXEsquina = c.leerDouble("Coordenada X Esquina");
           p.coordenadaYEsquina = c.leerDouble("Coordenada Y Esquina");
           p.ancho = c.leerDouble("Ancho");
           p.alto = c.leerDouble("Alto");
           p.coordenadaXDelPunto = c.leerDouble("Coordenada X del Punto");
           p.coordenadaYDelPunto = c.leerDouble("Coordenada Y del Punto");

       //Invocar los métodos/algoritmos del modelo
           p.algoritmo();

       //Mostrar los datos de saluda usando la vista
           c.imprimir("Punto Dentro: " + p.puntoDentro);
           c.imprimir("Punto Fuera: " + p.puntoFuera);
           c.imprimir("Punto En Borde Superior: " + p.puntoBordeSuperior);
           c.imprimir("Punto En Borde Inferior: " + p.puntoBordeInferior);
           c.imprimir("Punto En Borde Izquierdo: " + p.puntoBordeIzquierdo);
           c.imprimir("Punto En Borde Derecho: " + p.puntoBordeDerecho);
    }
}
=======
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
public class control {

    /**
     * @param args the command line arguments
     */
   public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           funcion p = new funcion();

       //Leer datos de entrada usando la vista
            p.coordenadaXEsquina = c.leerDouble("Coordenada X Esquina");
           p.coordenadaYEsquina = c.leerDouble("Coordenada Y Esquina");
           p.ancho = c.leerDouble("Ancho");
           p.alto = c.leerDouble("Alto");
           p.coordenadaXDelPunto = c.leerDouble("Coordenada X del Punto");
           p.coordenadaYDelPunto = c.leerDouble("Coordenada Y del Punto");

       //Invocar los métodos/algoritmos del modelo
           p.algoritmo();

       //Mostrar los datos de saluda usando la vista
           c.imprimir("Punto Dentro: " + p.puntoDentro);
           c.imprimir("Punto Fuera: " + p.puntoFuera);
           c.imprimir("Punto En Borde Superior: " + p.puntoBordeSuperior);
           c.imprimir("Punto En Borde Inferior: " + p.puntoBordeInferior);
           c.imprimir("Punto En Borde Izquierdo: " + p.puntoBordeIzquierdo);
           c.imprimir("Punto En Borde Derecho: " + p.puntoBordeDerecho);
    }
}
>>>>>>> 3ea05c40f59abc000eeba64719aba10155ee6d66
