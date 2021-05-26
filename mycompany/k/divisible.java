package com.mycompany.k;
    import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        long numero = sc.nextLong();
        //
        numero %= 11;
        if (numero == 0){
            System.out.println("DivisiblePor11: SI");
        }else{
            System.out.println("DivisiblePor11: NO");
        }
    }
    
}
