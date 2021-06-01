
/**
 * Use los comentarios para explicar el objetivo de este programa Relojaded .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 3.111
 */
public class Relojaded
{
    //entradas
    int fecha1;
    int fecha2;
    //salidas
    int diferenciaEnDias= 0;

    void algoritmo ()
    {
        int dia2;
        int mes2;
        int año2;

        boolean añoDivisiblePor4;
        boolean añoDivisiblePor100;
        boolean añoDivisiblePor400;
        boolean bisiesto;

        dia2 = fecha2%100;
        mes2 = (fecha2/100)%100;
        año2 = fecha2/10000;

        while (fecha1 > fecha2)
        {
            dia2 = dia2 + 1;
            diferenciaEnDias = diferenciaEnDias + 1;

            añoDivisiblePor4 = ((año2%4)== 0);
            añoDivisiblePor100 = ((año2%100)!= 0);
            añoDivisiblePor400 = ((año2%400)== 0);

            bisiesto = ((añoDivisiblePor4 == true) && (añoDivisiblePor100== true)) ||
            ((añoDivisiblePor4 == true) && (añoDivisiblePor100== false) && (añoDivisiblePor400 == true));

            if (bisiesto && dia2 > 29 && mes2== 2)
            {
                dia2 = 1;
                mes2 = mes2 + 1;
            }

            if (bisiesto==false && dia2 > 28 && mes2== 2)
            {
                dia2 = 1;
                mes2 = mes2 + 1;
            }

            if (dia2 > 30 && (mes2== 2 || mes2== 4 || mes2== 6 || mes2== 9 || mes2== 11 ))
            {
                dia2 = 1;
                mes2 = mes2 + 1;
            }

            if (dia2 > 31 && (mes2== 1 || mes2== 3 || mes2== 5 || mes2== 7 || mes2== 8 || mes2== 10 || mes2== 12))
            {
                if (dia2 > 31 && mes2 ==12)
                {
                    dia2 = 1;
                    mes2 = 1;
                    año2 = año2 + 1;
                }
                else
                {
                    dia2 = 1;
                    mes2 = mes2 + 1;
                }
            }
            fecha2 = año2*10000 + mes2*100 + dia2;
        }
    }
}