
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LineaCuadrantes;

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
           funcion l = new funcion();

       //Leer datos de entrada usando la vista
           l.coordenadaXDelPrimerPunto = c.leerDouble("Coordenada X del Primer Punto");
           l.coordenadaYDelPrimerPunto = c.leerDouble("Coordenada Y del Primer Punto");
           l.coordenadaXDelSegundoPunto = c.leerDouble("Coordenada X del Segundo Punto");
           l.coordenadaYDelSegundoPunto = c.leerDouble("Coordenada Y del segundo Punto");

       //Invocar los métodos/algoritmos del modelo
           l.algoritmo();

       //Mostrar los datos de saluda usando la vista
        c.imprimir("Primer Cuadrante   : " + l.primerCuadrante);
        c.imprimir("Segundo Cuadrante  : " + l.segundoCuadrante);
        c.imprimir("Tercer Cuadrante   : " + l.tercerCuadrante);
        c.imprimir("Cuarto Cuadrante   : " + l.cuartoCuadrante);
        c.imprimir("Un Cuadrante       : " + l.unCuadrante);
        c.imprimir("Dos Cuadrantes     : " + l.dosCuadrantes);
        c.imprimir("Tres Cuadrantes    : " + l.tresCuadrantes);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LineaCuadrantes;

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
           funcion l = new funcion();

       //Leer datos de entrada usando la vista
           l.coordenadaXDelPrimerPunto = c.leerDouble("Coordenada X del Primer Punto");
           l.coordenadaYDelPrimerPunto = c.leerDouble("Coordenada Y del Primer Punto");
           l.coordenadaXDelSegundoPunto = c.leerDouble("Coordenada X del Segundo Punto");
           l.coordenadaYDelSegundoPunto = c.leerDouble("Coordenada Y del segundo Punto");

       //Invocar los métodos/algoritmos del modelo
           l.algoritmo();

       //Mostrar los datos de saluda usando la vista
        c.imprimir("Primer Cuadrante   : " + l.primerCuadrante);
        c.imprimir("Segundo Cuadrante  : " + l.segundoCuadrante);
        c.imprimir("Tercer Cuadrante   : " + l.tercerCuadrante);
        c.imprimir("Cuarto Cuadrante   : " + l.cuartoCuadrante);
        c.imprimir("Un Cuadrante       : " + l.unCuadrante);
        c.imprimir("Dos Cuadrantes     : " + l.dosCuadrantes);
        c.imprimir("Tres Cuadrantes    : " + l.tresCuadrantes);
    }

    
}

