/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corona;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operaciones a = new operaciones();
        Consola dato = new Consola();
        
        a.dia1 = dato.leerEntero("Contagiados dia1: ");
        a.dia2 = dato.leerEntero("Contagiados dia2: ");
        a.dia3 = dato.leerEntero("Contagiados dia3: ");
        a.dia4 = dato.leerEntero("Contagiados dia4: ");
        a.dia5 = dato.leerEntero("Contagiados dia5: ");
        a.dia6 = dato.leerEntero("Contagiados dia6: ");
        
        a.porcentaje();
    }
    
}
