package CalendarioLunar;
public class funcion {
    // entradas
    int dia;
    int mes;
    int año;
    // salidas
    int metonico;
    int epacta;
    int epactaConcreta;
    int total;
    // algoritmo

    void algoritmo() {
        metonico = (año + 1) % 19;
        epacta = ((metonico - 1) * 11) % 30;
        if (mes == 1 || mes == 3) {
            epactaConcreta = dia;
        }
        if (mes == 2) {
            epactaConcreta = (1) + dia;
        }
        if (mes == 4 || mes == 5 || mes == 6 || mes == 7 || mes == 8 || mes == 9 || mes == 10 || mes == 11
                || mes == 12) {
            epactaConcreta = ((mes - 3)) + dia;
        }
        total = (epacta + epactaConcreta);
        if (total >= 30)
            total = total % 30;

    }// fin method

}// fin class CalendarioLunar