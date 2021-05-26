/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loteria;

/**
 *
 * @author IIpapuII
 */
public class funcion {
    //entradas
    int ganador;
    int apostado;
    int apuestaPleno;
    int apuestaPlenoInvertido;
    int apuestaPata;
    //salidas
    int valorPleno;
    int valorPlenoInvertido;
    int valorPata;
    int valorTotal;
    double a;
    double b;
    double c;
    double d;
    double p;
    double q;
    double r;
    double s;
    boolean ganaPleno;
    boolean ganaPlenoInvertido;
    boolean ganaPata;
    
    //algoritmo
    
    void algoritmo( ){
    valorPleno=(apuestaPleno*5000);
    valorPlenoInvertido=(apuestaPlenoInvertido*2500);
    valorPata=(apuestaPata*1000);
    valorTotal=(valorPleno+valorPlenoInvertido+valorPata);
    a=ganador/1000;
    b=ganador%1000/100;
    c=(ganador%1000%100)/10;
    d=(ganador%1000%100)%10;
    p=apostado/1000;
    q=apostado%1000/100;
    r=(apostado%1000%100)/10;
    s=(apostado%1000%100)%10;
    ganaPleno= (a==p)&&(b==q)&&(c==r)&&(d==s);
    ganaPlenoInvertido= (a==s)&&(b==r)&&(c==q)&&(d==p);
    ganaPata= (c==r)&&(d==s);
    }//fin method
}
