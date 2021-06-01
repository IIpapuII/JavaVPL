
/**
 *    Polidivisible .
 *    @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co 
 *    @version 4.0
 */
 class Polidivisible
{
    int numero;
    boolean polidivisible;
    
    void algoritmo(){
     int digitos = contarDigitos(numero);
     int tmp = numero;
     int d = 1;
     for(int i = digitos; i>=2; i--){
       if(tmp % i == 0) d++;
       tmp = tmp/ 10;
     }
     polidivisible = d == digitos;
    }

    int contarDigitos(int entrada){//Reutilizar el código fuente, organizarlo / estructura / orden
        int numero = entrada;
        int digitos=1;
        while(numero >= 10){
            numero = numero/10;
            digitos++;
        }
        return digitos;
    }

}//fin class Metodo