
/**
 * Use los comentarios para explicar el objetivo de este programa Divisores .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class Divisores
{
    //entradas
    int numero;
    //salidas
    int [] a;
    //algoritmo
    void algoritmo() {
        int n = contarDivisores(numero);
        a = new int [n];
        calcularDivisores(numero);
    }
    
    int contarDivisores(int numero) {
           int n = 2;
            for (int i=2; i <= (int) Math.sqrt(numero);i++) {
                if(numero%i==0)  {
                    if( i == Math.sqrt(numero)) n++;
                    else n+=2;
                }
            }
            return n;
    }
        
    void calcularDivisores(int numeros ){
          // Aqui ponga su algoritmo
          int n = 1, m = a.length-2;
          a [0]=1;
          a[a.length-1] = numero;
          for (int i=2; i <= (int) Math.sqrt(numero); i++)  {
                if(numeros%i==0)  {
                    if( i == Math.sqrt(numero)) a[n++]=i;
                    else{
                        a[n++] = i;
                        a[m--] = numero/i;
                    }//fin method
                }
          }
    }
}//fin class Divisores
