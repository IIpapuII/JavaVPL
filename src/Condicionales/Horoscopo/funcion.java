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
public class funcion {
    //entradas
    int fechaDeNacimiento;
    int fechaCociente;
    int dia;
    int mes;
    int año;
    //salidas
    boolean añoDivisiblePor4;
    boolean añoDivisiblePor100;
    boolean añoDivisiblePor400;
    boolean esAñoBisiesto;

    boolean capricornio;
    boolean acuario;
    boolean piscis;
    boolean aries;
    boolean tauro;
    boolean geminis;
    boolean cancer;
    boolean leo;
    boolean virgo;
    boolean libra;
    boolean escorpion;
    boolean sagitario;

    int horoscopoChino;
    
    
    void algoritmo()
    {
        dia = fechaDeNacimiento%100;
        fechaCociente = fechaDeNacimiento/100;
        mes = fechaCociente%100;
        año = fechaCociente/100;
        
       añoDivisiblePor4 = ((año%4)== 0);
       añoDivisiblePor100 = ((año%100)!= 0);
       añoDivisiblePor400 = ((año%400)== 0);
        
        esAñoBisiesto = ((añoDivisiblePor4 == true) && (añoDivisiblePor100== true)) ||
                        ((añoDivisiblePor4 == true) && (añoDivisiblePor100== false) && (añoDivisiblePor400 == true));
        
        
        capricornio = (dia >= 22 && dia <= 31 && mes == 12) || (dia >=  1 && dia <= 19 && mes == 1 );
                      
        acuario = (dia >= 20 && dia <= 31 && mes == 1) || (dia >=  1 && dia <= 18 && mes == 2 );
                  
        piscis = ((dia >= 19 && dia <= 28 && mes == 2) || (dia >=  1 && dia <= 20 && mes == 3 )) ||
                 (((esAñoBisiesto == true) && (dia >= 19 && dia <= 29 && mes == 2))|| (dia >=  1 && dia <= 20 && mes == 3 ));
                 
        aries =(dia >= 21 && dia <= 31 && mes == 3) || (dia >=  1 && dia <= 19 && mes == 4 );
        
        tauro = (dia >= 20 && dia <= 30 && mes == 4) || (dia >=  1 && dia <= 20 && mes == 5 );
        
        geminis = (dia >= 21 && dia <= 31 && mes == 5) || (dia >=  1 && dia <= 20 && mes == 6 );
        
        cancer = (dia >= 21 && dia <= 30 && mes == 6) || (dia >=  1 && dia <= 22 && mes == 7 );
        
        leo = (dia >= 23 && dia <= 31 && mes == 7) || (dia >=  1 && dia <= 22 && mes == 8 );
        
        virgo = (dia >= 23 && dia <= 31 && mes == 8) || (dia >=  1 && dia <= 22 && mes == 9 );
        
        libra = (dia >= 23 && dia <= 30 && mes == 9) || (dia >=  1 && dia <= 22 && mes == 10 );
        
        escorpion = (dia >= 23 && dia <= 31 && mes == 10) || (dia >= 1 && dia <= 21 && mes == 11 );
        
        sagitario = (dia >= 22 && dia <= 30 && mes == 11) || (dia >= 1 && dia <= 21 && mes == 12 );
        
        horoscopoChino = año%12;
        
                      
    }
}
