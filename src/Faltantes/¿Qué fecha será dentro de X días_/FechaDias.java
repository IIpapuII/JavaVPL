
/**
 * Use los comentarios para explicar el objetivo de este programa FechaDias .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class FechaDias
{
    //entradas
    int fecha;
    int diasTrancurridos;
    //salidas
    int fechaNuevaDia;
    int fechaNuevaMes;
    int fechaNuevaAño;
    int dia;
    int mes;
    int año;
    //algoritmo
    
    void algoritmo( ){
          // Aqui ponga su algoritmo
          boolean añoDivisiblePor4;
            boolean añoDivisiblePor100;
                boolean añoDivisiblePor400;
                    boolean bisiesto;

                    dia = fecha%100;
                    mes = (fecha/100)%100;
                    año = fecha/10000;

                    int i = 1;

        while (i <= diasTrancurridos)
        {
            i++;
            dia = dia + 1;

            añoDivisiblePor4 = ((año%4)== 0);
            añoDivisiblePor100 = ((año%100)!= 0);
            añoDivisiblePor400 = ((año%400)== 0);

            bisiesto = ((añoDivisiblePor4 == true) && (añoDivisiblePor100== true)) ||
            ((añoDivisiblePor4 == true) && (añoDivisiblePor100== false) && (añoDivisiblePor400 == true));

            if (bisiesto && dia > 29 && mes== 2)
            {
                dia = 1;
                mes = mes + 1;
            }

            if (bisiesto==false && dia > 28 && mes== 2)
            {
                dia = 1;
                mes = mes + 1;
            }

            if (dia > 30 && (mes== 2 || mes== 4 || mes== 6 || mes== 9 || mes== 11 ))
            {
                dia = 1;
                mes = mes + 1;
            }

            if (dia > 31 && (mes== 1 || mes== 3 || mes== 5 || mes== 7 || mes== 8 || mes== 10 || mes== 12))
            {
                if (dia > 31 && mes ==12)
                {
                    dia = 1;
                    mes = 1;
                    año = año + 1;
                }
                else
                {
                    dia = 1;
                    mes = mes + 1;
                }
            }
            fechaNuevaDia = dia;
            fechaNuevaMes = mes;
            fechaNuevaAño = año;
        }
    }//fin method
}//fin class xdias
