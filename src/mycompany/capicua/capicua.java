package com.mycompany.capicua;
import java.util.Scanner;
public class capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        long numero = sc.nextLong();
        long aux = 0;
        long inverso = 0;
        long residuo = 0;
        //
        aux = numero;
        //
            while (aux != 0){
            residuo = aux % 10;
            inverso = (inverso * 10) + residuo;
            aux /= 10;
        }
        if (inverso == numero){
            System.out.println("Capicúa: SI");
        }else{
            System.out.println("Capicúa: NO"); 
        }
    }
    
}
