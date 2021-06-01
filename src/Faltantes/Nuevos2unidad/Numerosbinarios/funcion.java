package Numerosbinarios;

public class funcion {
    //entradas
    long numeroBinario;
    //salidas
    boolean esBinario;
    long residuo;
    long decimal;

    void algoritmo (){
        long i = 0;
        long ultdigito;
        decimal = 0;

        while (numeroBinario != 0 && (residuo == 0 || residuo == 1))
        {
            residuo = numeroBinario % 10;
            decimal = decimal + residuo *  (long)Math.pow (2,i);
            i = i + 1;
            numeroBinario = numeroBinario / 10;
            esBinario = (residuo == 0 || residuo == 1);
        }
    }//fin method
}
