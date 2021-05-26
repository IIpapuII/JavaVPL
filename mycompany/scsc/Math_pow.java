package com.mycompany.scsc;
import java.util.Scanner;
public class Math_pow {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Base : ");
        int b = sc.nextInt();
        System.out.println("Exponente : ");
        int n = sc.nextInt();
        //
        if (n == 1 ){
            System.out.println("La potencia de " + b + " con exponente " + n + " es: " + b);
        }else{
            int r = 1;
            for (int i=1; i<=n; i++) {
            r *= b;           
            }System.out.println("La potencia de " + b + " con exponente " + n + " es: " + r);
        }
    }
    
}