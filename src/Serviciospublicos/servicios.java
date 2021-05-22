/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serviciospublicos;
/**
 *
 * @author IIpapuII
 */
public class servicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consola datos = new Consola();
        
        //definir variables de los datos  de entrada
        int LecturaAnterior;
        int LecturaActual;
        int ValorTarifa;
        // definir varibales de los datos de salida
        int Consumo;
        double Agua;
        double Aseo;
        double Alcantarillado;
        double Total;
        //Solicitar los datos al usuario
        
        LecturaAnterior = datos.leerEntero("Ingrese los datos de la lectura anterior");
        LecturaActual = datos.leerEntero("Ingrese los datos de la lectura actual");
        ValorTarifa = datos.leerEntero("Ingrese los datos de la tarifa");
        
        //Procesos matematicos para la salida
         Consumo = LecturaActual-LecturaAnterior;
        Agua = ValorTarifa * Consumo;
        Aseo = (int)(Agua *10)/100;
        Alcantarillado = (Agua*15)/100;
        Total = (float)Aseo+ (float)Alcantarillado + (float)Agua ;
        
        datos.imprimir("Consumo        : "+Consumo );
        datos.imprimir("Agua           : "+Agua );
        datos.imprimir("Aseo           : "+Aseo );      
        datos.imprimir("Alcantarillado : "+Alcantarillado );
        datos.imprimir("Total          : "+Total );
    }
    
}
