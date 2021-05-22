/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Credito;



/**
 *
 * @author IIpapuII
 */
public class credito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando la clase Consola
        Consola dato = new Consola();
        //llamado  de variables de entrada
        long MontoDelCredito;
        int TasaDeInteres;
        int PlazoEnMes;
        //mmado de variables de salidad 
        long ValorCuotaMensual;
        long ValorMensualCapital;
        long ValorMensualInteres;
        int GananciaTotal;
        
        //llamado de datos de entrada 
        MontoDelCredito = dato.leerEntero("Ingrese el monto del credito");
        TasaDeInteres = dato.leerEntero("Ingrese la tasa de interes");
        PlazoEnMes = dato.leerEntero("Ingrese el plazo en mes");
      
        //Calcular el valor de la cuota mensual
        ValorCuotaMensual = ((MontoDelCredito*TasaDeInteres)/100)+(MontoDelCredito/PlazoEnMes);
        //Calcular el valor mensual del capital 
        ValorMensualCapital = MontoDelCredito/PlazoEnMes;
        //Calcular el valor mensual del interes
        ValorMensualInteres = (MontoDelCredito*TasaDeInteres)/100;
        //Calcular el valor de  la gancia total 
        double diva = (double)(ValorMensualInteres/(double)ValorMensualCapital)*100;
        dato.imprimir(diva);
         GananciaTotal = (int)diva;
         
        //Salida de los valores 
        dato.imprimir("Valor Cuota Mensual   : "+ValorCuotaMensual);
        dato.imprimir("Valor Mensual Capital : "+ValorMensualCapital);
        dato.imprimir("Valor Mensual Interes : "+ValorMensualInteres);
        dato.imprimir("Ganancia Total          : "+GananciaTotal+"%" );
        
    }
    
}
