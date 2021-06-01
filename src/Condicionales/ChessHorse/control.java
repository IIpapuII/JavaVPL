/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.ChessHorse;

/**
 *
 * @author IIpapuII
 */
public class control {

    //presenta errores 
    public static void main(String [] args){
        //Crear la vista
        Consola c = new Consola();
        //Crear el modelo
        funcion cs = new funcion();

        //Leer datos de entrada usando la vista
        cs.columnaInicial = c.leerCaracter("Columna Inicial: ");
        cs.filaInicial = c.leerCaracter("Fila Inicial: ");
        cs.columnaFinal = c.leerCaracter("Columna Final: ");
        cs.filaFinal = c.leerCaracter("Fila Final: ");

        //Invocar los métodos/algoritmos del modelo
        cs.algoritmo();
        if(cs.coordenadaInicialValida && cs.coordenadaFinalValida){
            if(cs.movimiento>=1)
                c.imprimir(("Movimiento ")+ cs.movimiento);
            if(cs.movimiento==0)
                c.imprimir("No es un caballo");
        }
        else{   
            if(cs.coordenadaInicialValida==false || cs.coordenadaFinalValida==false){
                if(cs.coordenadaInicialValida ==false){
                    c.imprimir("Coordenada Inicial no Válida"); 
                }
                if(cs.coordenadaFinalValida==false ){
                    c.imprimir("Coordenada Final no Válida"); 
                }
            }
        }

    }
    
}
