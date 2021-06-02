package CredidoDouble;

public class funcion {
    Consola a = new Consola();
    long totalcredito;
    int interes;
    int cantidaCuotas;
    long cuota;
    long valorinteres;
    long valortoalinteres;
    long excedente;
    long totalPagar;

    void EntradaDatos(){
        totalcredito = a.leerLong("Total del credido: ");
        interes = a.leerEntero("Tasa de interes: ");
        cantidaCuotas = a.leerEntero("Cantidad de cuotas: ");

    }

    void Operaciones(){
        cuota = (totalcredito/cantidaCuotas);
        int t=0;
        while(t < cantidaCuotas){
            excedente = totalcredito-cuota;
            valortoalinteres = (excedente*interes)/100;
            valorinteres = valortoalinteres + valorinteres;
            t++;
        }
        totalPagar = totalcredito + valorinteres;
    }
    void SalidaDatos(){
        a.imprimir(totalPagar);
    }
}
