/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author IIpapuII
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consola dato = new Consola();
        //Definiendo variables
        int DineroInicial;
        int Ingresos;
        int Egresos;
        float  Impuestos;
        float  GananciasBrutas;
        float GananciasNetas;
        float DineroFinal;
        //Solicitando datos al usuario
        DineroInicial = dato.leerEntero("Ingrese dinero inicial");
        Ingresos = dato.leerEntero("Ingrese Ingresos");
        Egresos = dato.leerEntero("Igrese Egresos");
        //operaciones matematicas
        Impuestos = (Ingresos *19)/100;
        GananciasBrutas = Ingresos-Egresos;
        GananciasNetas = GananciasBrutas - Impuestos;
        DineroFinal =DineroInicial + GananciasNetas;
        //Salidad de  los datos
        dato.imprimir("Impuestos = "+ Impuestos);
        dato.imprimir("Ganancias Brutas = "+ GananciasBrutas);
        dato.imprimir("Ganancias Netas = "+ GananciasNetas);
        dato.imprimir("Dinero Final = "+ DineroFinal);
       
       
        
    }
    
}
