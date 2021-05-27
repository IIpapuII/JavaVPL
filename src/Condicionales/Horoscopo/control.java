/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.Horoscopo;

/**
 *
 * @author IIpapuII
 */
public class control {

    /**
     * @param args the command line arguments
     */
   public static void main (String [] args)
    {
        funcion h = new funcion ();
        Consola c = new Consola ();

        h.fechaDeNacimiento = c.leerEntero ();

        h.algoritmo ();
        if (!h.capricornio && !h.acuario && !h.piscis && !h.aries && !h.tauro && !h.geminis && !h.cancer && !h.leo && !h.virgo && !h.libra && !h.escorpion &&  !h.sagitario)
            System.out.println ("Fecha no válida");
        else
        {
            if (h.capricornio)
                System.out.print ("Su Horóscopo es Capricornio / " );
            if (h.acuario)
                System.out.print ("Su Horóscopo es Acuario / ");
            if (h.piscis)
                System.out.print ("Su Horóscopo es Piscis / ");
            if (h.aries)
                System.out.print ("Su Horóscopo es Aries / ");
            if (h.tauro)
                System.out.print ("Su Horóscopo es Tauro / ");
            if (h.geminis)
                System.out.print ("Su Horóscopo es Géminis / ");
            if (h.cancer)
                System.out.print ("Su Horóscopo es Cáncer / ");
            if (h.leo)
                System.out.print ("Su Horóscopo es Leo / ");
            if (h.virgo)
                System.out.print ("Su Horóscopo es Virgo / ");
            if (h.libra)
                System.out.print ("Su Horóscopo es Libra / ");
            if (h.escorpion)
                System.out.print ("Su Horóscopo es Escorpión / ");
            if (h.sagitario)
                System.out.print ("Su Horóscopo es Sagitario / ");

            if (h.horoscopoChino == 0)
                System.out.print ("Mono");
            if (h.horoscopoChino == 1)
                System.out.print ("Gallo");
            if (h.horoscopoChino == 2)
                System.out.print ("Perro");
            if (h.horoscopoChino == 3)
                System.out.print ("Marrano");
            if (h.horoscopoChino == 4)
                System.out.print ("Rata");
            if (h.horoscopoChino == 5)
                System.out.print ("Búfalo");
            if (h.horoscopoChino == 6)
                System.out.print ("Tigre");
            if (h.horoscopoChino == 7)
                System.out.print ("Liebre");
            if (h.horoscopoChino == 8)
                System.out.print ("Dragón");
            if (h.horoscopoChino == 9)
                System.out.print ("Serpiente");
            if (h.horoscopoChino == 10)
                System.out.print ("Caballo");
            if (h.horoscopoChino > 10)
                System.out.print ("Cabra");

        }

    }
    
}
