package ejercicio1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IIpapuII
 */
public class producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Consola control = new Consola();
        
        int cantidaInicial ;
        int CantidaComprada;
        int CantidaVendida;
        int PrecioDeCompra;
        int precioDeVenta;
        int Ingresos;
        int Egresos;
        int GananciaBrutas;
        int Impuestos;
        int Ganancias;
        //calculos realizados
        cantidaInicial = control.leerEntero("Ingrese cantidad inicial");
        CantidaComprada = control.leerEntero("Ingrese la cantida comprada");
        CantidaVendida = control.leerEntero("Ingrese cantida Vendida");
        PrecioDeCompra = control.leerEntero("Ingrese la cantidad comprada");
        precioDeVenta = ((PrecioDeCompra*29)/100)+PrecioDeCompra;
        Ingresos = precioDeVenta * CantidaVendida;
        Egresos = PrecioDeCompra * CantidaComprada;
        GananciaBrutas = Ingresos - Egresos;
        Impuestos = (Ingresos *19)/100;
        Ganancias = GananciaBrutas - Impuestos;
        
        //Valores de salida
        control.imprimir("Precio de Venta: "+precioDeVenta);
        control.imprimir("Ingresos: "+Ingresos);
        control.imprimir("Egresos: "+Egresos);
        control.imprimir("Ganancias Brutas: "+GananciaBrutas);
        control.imprimir("Impuestos: "+ Impuestos);
        control.imprimir("Ganancias Netas: "+Ganancias);
        
        
        
        
        
    }
    
}
