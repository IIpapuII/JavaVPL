

import java.util.Scanner;

public class Math_pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Base : ");
        long b = sc.nextInt();
        System.out.println("Exponente : ");
        long n = sc.nextInt();
        //
        if (n == 1) {
            System.out.println("La potencia de " + b + " con exponente " + n + " es: " + b);
        } else {
            long r = 1;
            for (int i = 1; i <= n; i++) {
                r *= b;
            }
            System.out.println("La potencia de " + b + " con exponente " + n + " es: " + r);
        }
    }

}