
/**
 * Use los comentarios para explicar el objetivo de este programa MayorYMenor .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 5.0
 */
public class MayorYMenor
{
    //entradas
    int [] numeros;
    //salidas
    int posicionMayor;
    int mayor;
    int posicionMenor;
    int menor;
    
    
    void calcularMenor( ){ 
        // Aqui ponga su algoritmo
        menor = numeros[0];
        posicionMayor = 0;
        for(int i=0; i<numeros.length; i++) {
        if(numeros[i] < menor)  {
            menor = numeros[i];
            posicionMenor=i;
    }
  }     
 }  
 void calcularMayor() {
       // Aqui ponga su algoritmo 
       mayor = numeros[0];
        posicionMayor = 0;
        for(int i=0; i<numeros.length;i++) 
        { if(numeros[i] > mayor)  {
            mayor = numeros[i];
            posicionMayor=i;
        
    }
  }     
 }  
}