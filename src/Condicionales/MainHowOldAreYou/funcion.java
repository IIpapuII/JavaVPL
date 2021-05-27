/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales.MainHowOldAreYou;

/**
 *
 * @author IIpapuII
 */
public class funcion {
    //entradas

    int fecha1;
    int fecha2;
    //salidas

    int año1;
    int cocienteFecha1;
    int mes1;
    int dia1;

    int año2;
    int cocienteFecha2;
    int mes2;
    int dia2;

    boolean dia1Valido;
    boolean mes1Valido;
    boolean año1Valido;
    boolean año1DivisiblePor4;
    boolean año1DivisiblePor100;
    boolean año1DivisiblePor400;
    boolean fecha1Valida;

    boolean dia2Valido;
    boolean mes2Valido;
    boolean año2Valido;
    boolean año2DivisiblePor4;
    boolean año2DivisiblePor100;
    boolean año2DivisiblePor400;
    boolean fecha2Valida;

    int edad;

    void algoritmo() {
        año1 = fecha1 % 10000;
        cocienteFecha1 = fecha1 / 10000;

        mes1 = cocienteFecha1 % 100;

        dia1 = cocienteFecha1 / 100;

        año1Valido = (año1 > 0);

        año1DivisiblePor4 = ((año1 % 4) == 0);
        año1DivisiblePor100 = ((año1 % 100) != 0);
        año1DivisiblePor400 = ((año1 % 400) == 0);

        mes1Valido = (mes1 >= 1 && mes1 <= 12);

        dia1Valido = ((mes1 == 1) && (dia1 > 0) && (dia1 <= 31))
                || ((mes1 == 2) && (dia1 > 0) && (dia1 <= 28))
                || (((mes1 == 2) && (dia1 > 0) && (dia1 <= 29)) && ((año1DivisiblePor4 == true) && (año1DivisiblePor100 == true))
                || ((año1DivisiblePor4 == true) && (año1DivisiblePor100 == false) && (año1DivisiblePor400 == true)))
                || ((mes1 == 3) && (dia1 > 0) && (dia1 <= 31))
                || ((mes1 == 4) && (dia1 > 0) && (dia1 <= 30))
                || ((mes1 == 5) && (dia1 > 0) && (dia1 <= 31))
                || ((mes1 == 6) && (dia1 > 0) && (dia1 <= 30))
                || ((mes1 == 7) && (dia1 > 0) && (dia1 <= 31))
                || ((mes1 == 8) && (dia1 > 0) && (dia1 <= 31))
                || ((mes1 == 9) && (dia1 > 0) && (dia1 <= 30))
                || ((mes1 == 10) && (dia1 > 0) && (dia1 <= 31))
                || ((mes1 == 11) && (dia1 > 0) && (dia1 <= 30))
                || ((mes1 == 12) && (dia1 > 0) && (dia1 <= 31));

        fecha1Valida = (mes1Valido == true) && (dia1Valido == true) && (año1Valido == true);

        año2 = fecha2 % 10000;
        cocienteFecha2 = fecha2 / 10000;

        mes2 = cocienteFecha2 % 100;

        dia2 = cocienteFecha2 / 100;

        año2Valido = (año2 > 0);

        año2DivisiblePor4 = ((año2 % 4) == 0);
        año2DivisiblePor100 = ((año2 % 100) != 0);
        año2DivisiblePor400 = ((año2 % 400) == 0);

        mes2Valido = (mes2 >= 1 && mes2 <= 12);

        dia2Valido = ((mes2 == 1) && (dia2 > 0) && (dia2 <= 31))
                || ((mes2 == 2) && (dia2 > 0) && (dia2 <= 28))
                || (((mes2 == 2) && (dia2 > 0) && (dia2 <= 29)) && ((año2DivisiblePor4 == true) && (año2DivisiblePor100 == true))
                || ((año2DivisiblePor4 == true) && (año2DivisiblePor100 == false) && (año2DivisiblePor400 == true)))
                || ((mes2 == 3) && (dia2 > 0) && (dia2 <= 31))
                || ((mes2 == 4) && (dia2 > 0) && (dia2 <= 30))
                || ((mes2 == 5) && (dia2 > 0) && (dia2 <= 31))
                || ((mes2 == 6) && (dia2 > 0) && (dia2 <= 30))
                || ((mes2 == 7) && (dia2 > 0) && (dia2 <= 31))
                || ((mes2 == 8) && (dia2 > 0) && (dia2 <= 31))
                || ((mes2 == 9) && (dia2 > 0) && (dia2 <= 30))
                || ((mes2 == 10) && (dia2 > 0) && (dia2 <= 31))
                || ((mes2 == 11) && (dia2 > 0) && (dia2 <= 30))
                || ((mes2 == 12) && (dia2 > 0) && (dia2 <= 31));

        fecha2Valida = (mes2Valido == true) && (dia2Valido == true) && (año2Valido == true);

        edad = año2 - año1;

    }
}
