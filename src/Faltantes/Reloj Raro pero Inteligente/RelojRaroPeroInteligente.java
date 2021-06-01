
/**
 * Use los comentarios para explicar el objetivo de este programa RelojRaroPeroInteligente .
 *
 * @author Ricard Yovanny Riveros Rangel  ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class RelojRaroPeroInteligente
{
    //entradas
    int numero;
    char letra;
    //salidas
    int segundos;
    int segundos1;
    int minutos;
    int horas;
    boolean m;
    boolean n;
    boolean e;
    boolean a;
    boolean M;
    boolean N;
    boolean valida;

    //algoritmo

    void algoritmo(){
        segundos= numero%100;
        segundos1 = numero/100;
        minutos = segundos1%100;
        horas = segundos1/100;

        m = (horas == 12)&& (minutos >= 0) &&(minutos <= 59)&& (segundos >= 0) &&(segundos <=59);
        n = (horas == 12)&& (minutos >= 0) &&(minutos <= 59)&& (segundos >= 0) &&(segundos <=59);
        e = (horas >= 1) && (horas <= 5)  && (minutos >= 0) &&(minutos <= 59)&& (segundos >=0) &&(segundos <=59);
        a = (horas >= 1) && (horas <= 5)  && (minutos >= 0) &&(minutos <= 59)&& (segundos >=0) &&(segundos <=59);
        M = (horas >= 6) && (horas <= 11) && (minutos >= 0) &&(minutos <= 59)&& (segundos >=0) &&(segundos <=59);
        N = (horas >= 6) && (horas <= 11) && (minutos >= 0) &&(minutos <= 59)&& (segundos >=0) &&(segundos <=59);

        valida = 'm'== letra && m || 'n'== letra && n || 'e'== letra && e || 'a' ==letra && a || 'M'== letra && M || 'N'== letra && N ;

    }//fin method

}//fin class RelojRaroPeroInteligente
