/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Censo;

/**
 *
 * @author IIpapuII
 */
public class funcion {

    Consola a = new Consola();
    //Datos de entrada
    double edad;
    double peso;
    double estatura;
    boolean edadFueraRango;
    boolean pesoFueraRango;
    boolean estaturaFueraRangoo;
    boolean joven;
    boolean adulto;
    boolean segundaEdad;
    boolean estaturaBaja;
    boolean estauraPromedio;
    boolean estauraAlta;
    boolean pesoBajo;
    boolean pesoPromedio;
    boolean pesoAlto;
    // Funcion de llamado  de datos

    void entradaDAtos() {

        edad = a.leerDouble("Edad: ");
        estatura = a.leerDouble("Estatura: ");
        peso = a.leerDouble("Peso: ");

    }

    //funcion Operaciones 
    void Operaciones() {
        //clasifiaciones estaturas

        estaturaBaja = 1 <= estatura && estatura <= 1.6;
        estauraPromedio = 1.6 < estatura && estatura <= 1.7;
        estauraAlta = 1.7 < estatura && estatura < 1.8;
        estaturaFueraRangoo = estatura < 1 || estatura > 1.8;
        pesoBajo = 40 <= peso && peso <= 60;
        pesoPromedio = 60 < peso && peso <= 80;
        pesoAlto = 80 < peso && peso <= 100;
        pesoFueraRango = peso < 40 || peso > 100;
        joven = 16 <= edad && edad <= 25;
        adulto = 25 < edad && edad <= 40;
        segundaEdad = 40 < edad && edad < 50;
        edadFueraRango = edad < 16 || edad > 50;
    }

    //salida  de datos 
    void SalidaDatos() {
        a.imprimir("Edad fuera de rango      : " + edadFueraRango);
        a.imprimir("Estatura fuera de rango  : " + estaturaFueraRangoo);
        a.imprimir("Peso fuera de rango      : " + pesoFueraRango);
        a.imprimir("Joven                    : " + joven);
        a.imprimir("Adulto                   : " + adulto);
        a.imprimir("Segunda Edad             : " + segundaEdad);
        a.imprimir("Estatura Baja            : " + estaturaBaja);
        a.imprimir("Estatura Promedio        : " + estauraPromedio);
        a.imprimir("Estatura Alta            : " + estauraAlta);
        a.imprimir("Peso Bajo                : " + pesoBajo);
        a.imprimir("Peso Promedio            : " + pesoPromedio);
        a.imprimir("Peso Alto                : " + pesoAlto);
    }
}
