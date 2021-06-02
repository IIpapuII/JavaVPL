
/**
 * Use los comentarios para explicar el objetivo de este programa MainTienda .
 *
 * @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co
 * @version 2.1
 */
class MainTienda
{
    /**Metodo principal (main) ejecutable*/
    public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        Tienda t = new Tienda();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        t.dineroInicial= c.leerEntero("Dinero Inicial");
        t.totalIngresos= c.leerEntero("Ingresos");
        t.totalEgresos= c.leerEntero("Egresos");
        
        //invocar el algoritmo o los algoritmos, usando el Modelo
        

        //mostrar / imprimir los datos de salida
        if (t.dineroInicial < 0 || t.totalIngresos < 0 || t.totalEgresos < 0){
            c.imprimir ("Error, los siguientes datos son negativos: ");
        if (t.dineroInicial <0)     
            c.imprimir ("Dinero Inicial: ");
        if (t.totalIngresos < 0)
            c.imprimir ("Ingresos: ");
        if (t.totalEgresos < 0)
            c.imprimir ("Egresos: ");}
        
         
            
        else{
        t.algoritmo();
        c.imprimir("Impuestos = " + t.valorImpuesto);
        c.imprimir("Ganancias Brutas = " + t.gananciasBrutas);        
        c.imprimir("Ganancias Netas = " + t.gananciasNetas);
        c.imprimir("Dinero Final = " + t.dineroFinal);
       }
    }
}//fin class MainTienda
