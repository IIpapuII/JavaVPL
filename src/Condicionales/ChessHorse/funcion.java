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
public class funcion {
    //entradas
    char columnaInicial;
    char filaInicial;
    char columnaFinal;
    char filaFinal;
    //salidas
    boolean coordenadaInicialValida;
    boolean coordenadaFinalValida;
    int columnaAumenta1;
    int columnaAumenta2;
    int columnaDisminuye1;
    int columnaDisminuye2;
    int filaAumenta1;
    int filaAumenta2;
    int filaDisminuye1;
    int filaDisminuye2; 
    int movimiento;
    //algoritmo
    
    void algoritmo( ){
      coordenadaInicialValida= (columnaInicial>='a' && columnaInicial<='h') &&(filaInicial>='1' && filaInicial<='8');
      coordenadaFinalValida= (columnaFinal>='a' && columnaFinal<='h') && (filaFinal>='1' && filaFinal<='8');
      columnaAumenta1= columnaInicial+1;
      columnaAumenta2= columnaInicial+2;
      columnaDisminuye1= columnaInicial-1;
      columnaDisminuye2= columnaInicial-2;
      filaAumenta1= filaInicial+1;
      filaAumenta2= filaInicial+2;
      filaDisminuye1= filaInicial-1;
      filaDisminuye2=  filaInicial-2;
       if(((char)columnaAumenta1==columnaFinal) && ((char)filaAumenta2==filaFinal)){
          movimiento=1;
       }
       if(((char)columnaAumenta2==columnaFinal) && ((char)filaAumenta1==filaFinal)){
         movimiento=2;
       }
       if(((char)columnaAumenta2==columnaFinal) && ((char)filaDisminuye1==filaFinal)){
         movimiento=3;
       }
       if(((char)columnaAumenta1==columnaFinal) && ((char)filaDisminuye2==filaFinal)){
           movimiento=4;
       }
       if(((char)columnaDisminuye1==columnaFinal) && ((char)filaDisminuye2==filaFinal)){
           movimiento=5;
       }
       if(((char)columnaDisminuye2==columnaFinal) && ((char)filaDisminuye1==filaFinal)){
           movimiento=6;
       }
       if(((char)columnaDisminuye2==columnaFinal) && ((char)filaAumenta1==filaFinal)){
          movimiento=7;
       }
       if(((char)columnaDisminuye1==columnaFinal)&&((char)filaAumenta2==filaFinal)){
          movimiento=8;
       }  
    
    }//fin method
}
