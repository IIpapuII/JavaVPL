
/**
 * Use los comentarios para explicar el objetivo de este programa WhatColorThatSquare .
 *
 * @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co
 * @version 2.1
 */
public class WhatColorThatSquare
{
    //entradas
    char columna;
    char fila;
            //salidas
            boolean columnaValida;
            boolean filaValida;
            boolean coordenadasValidas;
            int casilla;
            int casillaValor;

    void algoritmo(){
        //transformar las entradas en salidas
        columnaValida = columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h';
        filaValida = fila >= '1' && fila <= '8';
        columnaValida = columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h';
        filaValida = fila >= '1' && fila <= '8';
        coordenadasValidas = columnaValida && filaValida;
        if( columnaValida && filaValida){ 
            casillaValor =(int) (fila + columna);
            casilla = casillaValor % 2;
            if(casilla == 0) 
                System.out.print("Casilla de color negro,");
            else{
                System.out.print("Casilla de color blanco,");
            }
            if ((fila == '2' || fila == '7' ) && ( columna == 'a' ||  columna == 'b' ||   columna == 'c' || columna == 'd' ||  columna == 'e' ||  columna == 'f' ||  columna == 'g' ||  columna == 'h')){
                System.out.println("por defecto debería contener peón");
            }
            else{
                if ((fila == '1' || fila == '8' ) && ( columna == 'a' ||  columna == 'h')){
                    System.out.println("por defecto debería contener torre");
                }
                else{
                    if ((fila == '1' || fila == '8' ) && ( columna == 'b' ||  columna == 'g')){
                        System.out.println("por defecto debería contener caballo");
                    }
                    else{
                        if ((fila == '1' || fila == '8' ) && ( columna == 'c' ||  columna == 'f')){
                            System.out.println("por defecto debería contener alfil");
                        }
                        else{
                            if ((fila == '1' || fila == '8' ) && ( columna == 'd')){
                                System.out.println("por defecto debería contener dama");
                            }
                            else{
                                if ((fila == '1' || fila == '8' ) && ( columna == 'e')){
                                    System.out.println("por defecto debería contener rey");
                                }
                                else{
                                    System.out.println("por defecto debería contener vacío");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}