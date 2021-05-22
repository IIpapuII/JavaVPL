/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclokaprecar;

/**
 *
 * @author IIpapuII
 */
public class kaprecar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consola dato = new Consola();
        int numero =0;
        int d1;
        int d2;
        int d3;
        int d4;
        int residuo =0;
        int ciclos=0;
        int n1;
        int n2;
        int aux;
        
        //leer entrada
        numero = dato.leerEntero();
        
        if (numero >=0 && numero <= 9999){
            
            d1 = numero / 1000;
            residuo = numero % 1000;
            d2 = residuo /100;
            residuo = residuo % 100;
            d3 = residuo / 10;
            d4 = residuo % 10;
            
            if (d1 >=d2){
                aux = d1;
                d1 = d2;
                d2 = aux;
            }
            if (d1 >=d3){
                aux = d1;
                d1 = d3;
                d3 = aux;
            }
            if (d1 >=d4){
                aux = d1;
                d1 = d4;
                d4 = aux;
            }
            if (d1 >=d2){
                aux = d1;
                d1 = d2;
                d2 = aux;
            }
            
            
        }else {
            System.out.println("Datos Invalidos");
        }
             
    }
    
}
