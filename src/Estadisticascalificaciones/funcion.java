/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estadisticascalificaciones;

/**
 *
 * @author Daniela
 */
public class funcion {
     //entradas
    float [] notas;
    float n;
    // salidas
    float excelente=0; 
    float bueno=0;
    float aceptable=0;
    float condicional=0;
    float reprobado=0;

    float ex=0,bu=0,ac=0,co=0,re=0;

    void estadistica (){
        for(int i=0; i<notas.length; i++){
            if(notas[i] <=5 && notas[i] >=4.5){
                excelente = excelente + 1;
            }else{
                if(notas[i] <4.5 && notas[i] >=4 ){
                    bueno = bueno + 1;
                }else{
                    if(notas[i] <4.5 && notas[i] >=4 ){
                        bueno = bueno + 1;
                    }else{
                        if(notas[i] <4 && notas[i] >=3.5){
                            aceptable = aceptable + 1;
                        }else{
                            if(notas[i] <3.5 && notas[i] >=3 ){
                                condicional = condicional + 1;
                            }else{
                                if(notas[i] <3){
                                    reprobado = reprobado + 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        ex = ((excelente / notas.length) *100);
        bu = ((bueno / notas.length) * 100);
        ac = ((aceptable / notas.length) * 100);
        co = ((condicional / notas.length) * 100);
        re = ((reprobado / notas.length) * 100);
    }
}
