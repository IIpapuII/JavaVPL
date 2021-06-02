class MainCredito
{
    /**Metodo principal (main) ejecutable*/
    public static void main(String [] args)
    {
        //Crear objeto del modelo "P" o negocio
        Credito j = new Credito();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        j.montodelCredito= c.leerEntero ("Monto Del Credito");
        j.tasadeInteres= c.leerEntero("Tasa De Interes");
        j.plazoenMeses= c.leerEntero("Plazo En Meses");
        //invocar el algoritmo o los algoritmos, usando el Modelo
        if(j.montodelCredito < 0 || j.tasadeInteres < 0  || j.plazoenMeses < 0 )
            c.imprimir("Error, los siguientes datos son negativos:");
        if(j.montodelCredito < 0)
            c.imprimir("Monto.");
        if(j.tasadeInteres < 0)
            c.imprimir("Tasa de interés.");
        if(j.plazoenMeses < 0)  
            c.imprimir("Plazo en meses.");

        if(j.tasadeInteres > 35)
            c.imprimir("Error la tasa de interés supera el umbral de usura.");

        if(!(j.tasadeInteres > 35))
            if(! (j.montodelCredito < 0 || j.tasadeInteres < 0  || j.plazoenMeses < 0 )){
                j.algoritmo();
                c.imprimir("Valor Cuota Mensual: " + j.valorCuotaMensual);
                c.imprimir("Valor Mensual Capital: " + j.valorMensualCapital);        
                c.imprimir("Valor Mensual Interes: " + j.valorMensualInteres);
                c.imprimir("Ganancia Total: " + j.gananciaTotal + "%"); 
            }

    } 
}//fin class Credito