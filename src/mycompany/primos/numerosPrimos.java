package com.mycompany.primos;
    import java.util.Scanner;
public class numerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        long numero = sc.nextLong();
        //
        boolean primo = true; 
        int i = 0;
        //
        for(i = 2; i < numero; i++) {
        if (numero % i == 0) {
            primo = false;
            break;
            }
        }
        //
        if (primo){
            System.out.println("Primo: SI");
        }else{
            System.out.println("Primo: NO");
        }
    }
}                   

        
        
    
    

