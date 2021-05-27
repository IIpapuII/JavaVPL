package com.mycompany.AyB;
    import java.util.Scanner;
public class sumaEntreAyB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        long a = sc.nextLong();
        long b = sc.nextLong();
        //
        
        long c = 0;
        long B = 0;
        long A = 0;
        //
        if(a>b){
            A = b;
            B = a;
        }else{
            A = a;
            B = b;
        }
        long i = A; 
        //
        while (i <= B){
            c += i;
            i++;
        }
        System.out.println(c);
    }
    
}