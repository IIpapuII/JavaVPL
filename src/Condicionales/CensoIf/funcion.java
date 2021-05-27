/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.CensoIf;

/**
 *
 * @author IIpapuII
 */
public class funcion {
    //variables de entrada
     double edad;
     double estatura;
     double peso;
     
     //variables de salida
     boolean datosSoninvalidos;
     boolean edadFuera;
     boolean estaturaFuera;
     boolean pesoFuera;
     boolean joven;
     boolean adulto;
     boolean segundaEdad;
     boolean estaturaBaja;
     boolean estaturaPromedio;
     boolean estaturaAlta;
     boolean pesoBajo;
     boolean pesoPromedio;
     boolean pesoAlto;
     
     void algoritmo(){
         
        edadFuera = (16 >= edad) || ( edad >= 50);
        estaturaFuera = (1 >= estatura) || ( estatura >= 1.8);
        pesoFuera = (40 >= peso) || ( peso >= 100);
        joven = (16 <= edad) && ( edad <= 25);
        adulto = (25 < edad) && ( edad <= 40);
        segundaEdad = (40 < edad) && ( edad <= 50);
        estaturaBaja = (1 <= estatura) && ( estatura <= 1.6);
        estaturaPromedio = (1.6 < estatura) && ( estatura <= 1.7);
        estaturaAlta = (1.7 < estatura) && ( estatura <= 1.8);
        pesoBajo = (40 <= peso) && ( peso <= 60);
        pesoPromedio = (60 < peso) && ( peso <= 80);
        pesoAlto = (80 < peso) && ( peso <= 100);
         
        }
}
