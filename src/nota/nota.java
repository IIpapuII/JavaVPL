/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

/**
 *
 * @author IIpapuII
 */
public class nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consola d = new Consola();
        //Declaramos variables
        float nota;
        nota = d.leerFloat("ingrese una nota: ");
        //declaramos salidas
        boolean muydeficiente;
        boolean deficiente;
        boolean aceptable;
        boolean buena;
        boolean excelente;
        boolean notavalida;
        
        // procesamiento de las salidas
        notavalida = nota < 5 && nota >0;
        String  f = String.valueOf(notavalida);
        muydeficiente = nota <= 3 && nota > 0;
        String a = String.valueOf(muydeficiente);
        deficiente = nota > 3 && nota <3.5;
        String b = String.valueOf(deficiente);
        aceptable = nota >= 3.5 && nota <4;
        String c = String.valueOf(aceptable);
        buena = nota >=4 && nota <4.5;
        String q = String.valueOf(buena);
        excelente = nota >= 4.5 && nota <=5;
        String w = String.valueOf(excelente);
        d.imprimir("Nota valida         : "+f);
        d.imprimir("Nota Muy Deficiente : "+a);
        d.imprimir("Nota Deficiente     : "+b);
        d.imprimir("Nota Aceptable      : "+c);
        d.imprimir("Nota Buena          : "+q);
        d.imprimir("Nota Excelente      : "+w);
    }
    
}
