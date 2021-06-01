
/**
 * Use los comentarios para explicar el objetivo de este programa BinaryMorse .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class BinaryMorse
{
    //Entradas 
    long binaryMorse; 
    //Salidas 
    long decimal; 
    
    //Algoritmo 
    void algoritmo( ){ 
        //Aqui ponga su algoritmo 
        //Analisis, descomponer la entrada, desarmar. 
        long a = 0, b = 0, c = 0; 
        a = (binaryMorse/10000000000L);
        b = ((binaryMorse%10000000000L)/100000);
        c = ((binaryMorse%10000000000L)%100000);
        
        //Usar If/Else para convertir binario a decimal segun tabla Morse 
        if(a == 1) a = 9; 
        if(a == 10000) a = 1;
        if(a == 11000) a = 2;
        if(a == 11100) a = 3;
        if(a == 11110) a = 4;
        if(a == 11111) a = 5;
        if(a == 1111) a = 6;
        if(a == 111) a = 7;
        if(a == 11) a = 8;
        
        if(b == 1) b = 9; 
        if(b == 10000) b = 1;
        if(b == 11000) b = 2;
        if(b == 11100) b = 3;
        if(b == 11110) b = 4;
        if(b == 11111) b = 5;
        if(b == 1111) b = 6;
        if(b == 111) b = 7;
        if(b == 11) b = 8;
    
        if(c == 1) c = 9; 
        if(c == 10000) c = 1;
        if(c == 11000) c = 2;
        if(c == 11100) c = 3;
        if(c == 11110) c = 4;
        if(c == 11111) c = 5;
        if(c == 1111) c = 6;
        if(c == 111) c = 7;
        if(c == 11) c = 8;
        
        //Sintesis, componer la salida, armar numero 
        decimal = a * 100 + b * 10 + c; 
    }//Fin method 
}// Fin Class BinaryMorse
