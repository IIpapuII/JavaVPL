/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author IIpapuII
 */
public class Despresiacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consola dato = new Consola();
        
        //entrada de datos
        int valorTotal;
        int valorMensual;
        //Variables de salidad
        float Despresiacion;
        //pidiendo datos al usuario
       valorTotal = dato.leerEntero("Ingrese el valor total del producto");
       valorMensual = dato.leerEntero("Ingrese el valor total mensual");
       //Operacion de resultado
       Despresiacion = (valorTotal/(float)(valorMensual*12));
       //Salidad del progra
       dato.imprimir("Años Depreciación : "+Despresiacion);
        
    }
    
}
