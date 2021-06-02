class Tienda{
    //entradas
    int dineroInicial;
    int totalIngresos;
    int totalEgresos;
    //salidas
    double valorImpuesto;
    double gananciasBrutas;
    double gananciasNetas;
    double dineroFinal;

    void algoritmo(){
        //transformar las entradas en salidas
        valorImpuesto = (totalIngresos*19)/100;
        gananciasBrutas = totalIngresos-totalEgresos;
        gananciasNetas = gananciasBrutas-valorImpuesto;
        dineroFinal = dineroInicial + gananciasNetas;
    } 
}