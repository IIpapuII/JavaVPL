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
public class funcion {
    //entradas
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    double x4;
    double y4;
    //salidas
    double cAdyacente;
    double cOpuesto;
    double hipotenusa;
    double seno;
    double coseno;
    int x1Rotado;
    int y1Rotado;
    int x2Rotado;
    int y2Rotado;
    int x3Rotado;
    int y3Rotado;
    int x4Rotado;
    int y4Rotado;
    int anguloRotacion;
    
    //algoritmo
    
    void algoritmo( ){
     cAdyacente=Math.abs(x2-x1);
     cOpuesto= Math.abs(y2-y1);
     hipotenusa=Math.sqrt((cAdyacente*cAdyacente)+(cOpuesto*cOpuesto));
     seno=cOpuesto/hipotenusa;
     coseno=cAdyacente/hipotenusa;
     
     x1Rotado= (int) Math.round((x1*coseno) - (y1*seno));
     y1Rotado= (int) Math.round((x1*seno) + (y1*coseno));
     
     x2Rotado= (int) Math.round((x2*coseno) - (y2*seno));
     y2Rotado= (int) Math.round((x2*seno) + (y2*coseno));
     
     x3Rotado= (int) Math.round((x3*coseno) - (y3*seno));
     y3Rotado= (int) Math.round((x3*seno) + (y3*coseno));
     
     x4Rotado= (int) Math.round((x4*coseno) - (y4*seno));
     y4Rotado= (int) Math.round((x4*seno) + (y4*coseno));
     
     anguloRotacion=(int)(Math.round(Math.toDegrees(Math.acos(coseno))));
     
      
    
    }//fin method
}
