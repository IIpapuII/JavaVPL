package contadorDigitos;
import java.util.Scanner;
public class contadorDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero = sc.nextLong();
        long cantidad = 0;
	//	
	if (numero == 0){
	    System.out.println( "1");
	}else{
	    while (numero!=0){
            numero /= 10;
            cantidad++;
        }
        System.out.println(cantidad);
	    }
    }
    
}
