
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
public class funcion {
    //entradas
    double coordenadaXDelPrimerPunto;
    double coordenadaYDelPrimerPunto;
    double coordenadaXDelSegundoPunto;
    double coordenadaYDelSegundoPunto;
    //salidas
    double pendiente;
    double b;
    boolean primerCuadrante;
    boolean segundoCuadrante;
    boolean tercerCuadrante;
    boolean cuartoCuadrante;
    boolean unCuadrante;
    boolean dosCuadrantes;
    boolean tresCuadrantes;
    //algoritmo
    
    void algoritmo( ){
    pendiente=(coordenadaYDelSegundoPunto-coordenadaYDelPrimerPunto)/(coordenadaXDelSegundoPunto-coordenadaXDelPrimerPunto);
   b=coordenadaYDelPrimerPunto-(pendiente*coordenadaXDelPrimerPunto);
   
   primerCuadrante=(coordenadaXDelPrimerPunto>=0)&&(coordenadaYDelPrimerPunto>=0)||(coordenadaXDelSegundoPunto>=0)&&(coordenadaYDelSegundoPunto>=0)||
                   ((b>0)&&((coordenadaXDelPrimerPunto<0 && coordenadaYDelPrimerPunto>=0 && coordenadaXDelSegundoPunto>=0 && coordenadaYDelSegundoPunto<0)
                   ||(coordenadaXDelPrimerPunto>=0 && coordenadaYDelPrimerPunto<0 && coordenadaXDelSegundoPunto<0 && coordenadaYDelSegundoPunto>=0)));
   segundoCuadrante=(coordenadaXDelPrimerPunto<0)&&(coordenadaYDelPrimerPunto>=0)||(coordenadaXDelSegundoPunto<0)&&(coordenadaYDelSegundoPunto>=0)||
                    ((b>0)&&((coordenadaXDelPrimerPunto>=0 && coordenadaYDelPrimerPunto>=0 && coordenadaXDelSegundoPunto<0 && coordenadaYDelSegundoPunto<0)
                    ||(coordenadaXDelPrimerPunto<0 && coordenadaYDelPrimerPunto<0 && coordenadaXDelSegundoPunto>=0 && coordenadaYDelSegundoPunto>=0)));
   tercerCuadrante=(coordenadaXDelPrimerPunto<0)&&(coordenadaYDelPrimerPunto<0)||(coordenadaXDelSegundoPunto<0)&&(coordenadaYDelSegundoPunto<0)||
                   ((b<0)&&((coordenadaXDelPrimerPunto<0 && coordenadaYDelPrimerPunto>=0 && coordenadaXDelSegundoPunto>=0 && coordenadaYDelSegundoPunto<0)
                   ||(coordenadaXDelPrimerPunto>=0 && coordenadaYDelPrimerPunto<0 && coordenadaXDelSegundoPunto<0 && coordenadaYDelSegundoPunto>=0)));
   cuartoCuadrante=(coordenadaXDelPrimerPunto>=0)&&(coordenadaYDelPrimerPunto<0)||(coordenadaXDelSegundoPunto>=0)&&(coordenadaYDelSegundoPunto<0)||
                   ((b<0)&& ((coordenadaXDelPrimerPunto>=0 && coordenadaYDelPrimerPunto>=0 && coordenadaXDelSegundoPunto<0 && coordenadaYDelSegundoPunto<0)
                    ||(coordenadaXDelPrimerPunto<0 && coordenadaYDelPrimerPunto<0 && coordenadaXDelSegundoPunto>=0 && coordenadaYDelSegundoPunto>=0)));
   unCuadrante=(coordenadaXDelPrimerPunto>=0)&&(coordenadaYDelPrimerPunto>=0)&&
                (coordenadaXDelSegundoPunto>=0)&&(coordenadaYDelSegundoPunto>=0)||
                (coordenadaXDelPrimerPunto<0)&&(coordenadaYDelPrimerPunto>=0)&&
                (coordenadaXDelSegundoPunto<0)&&(coordenadaYDelSegundoPunto>=0)||
                (coordenadaXDelPrimerPunto<0)&&(coordenadaYDelPrimerPunto<0)&&
                (coordenadaXDelSegundoPunto<0)&&(coordenadaYDelSegundoPunto<0)||
                (coordenadaXDelPrimerPunto>0)&&(coordenadaYDelPrimerPunto<=0)&&
                (coordenadaXDelSegundoPunto>0)&&(coordenadaYDelSegundoPunto<=0);
   
   tresCuadrantes=(primerCuadrante&&segundoCuadrante&&tercerCuadrante)||(segundoCuadrante&&primerCuadrante&&cuartoCuadrante)||
                  (primerCuadrante&&cuartoCuadrante&&tercerCuadrante)|| (cuartoCuadrante&&tercerCuadrante&&segundoCuadrante);
    dosCuadrantes=!tresCuadrantes && !unCuadrante;
    
    }//fin method
}