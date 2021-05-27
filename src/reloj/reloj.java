/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author IIpapuII
 */
public class reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int horas;
        float minutos;
        int segundos;
        
        Consola d = new Consola();
        numero = d.leerEntero("Ingrese segundos: ");
         horas = (int)((float)numero/60)/60;
        minutos = (horas-(int)horas)*60;
        segundos = (int)(minutos - (int)minutos)*60;
        d.imprimir((int)horas+":"+(int)minutos+":"+segundos);
    }
    
}
