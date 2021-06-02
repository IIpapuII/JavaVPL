class MainServicios
{
    /**Metodo principal (main) ejecutable*/
    public static void main(String [] args)
    {

        Servicios s= new Servicios();

        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        s.lecturaAnterior= c.leerEntero ("Lectura Anterior");
        s.lecturaActual= c.leerEntero ("Lectura Actual");
        s.tarifaMensual= c.leerEntero ("Tarifa Mensual");
        //invocar el algoritmo o los algoritmos, usando el Modelo

        if(s.lecturaAnterior < 0 || s.lecturaActual < 0 || s.tarifaMensual < 0){
            c.imprimir("Error, los siguientes datos son negativos:");
            if(s.lecturaAnterior < 0)
                c.imprimir("Lectura Anterior.");
            if (s.lecturaActual < 0)
                c.imprimir("Lectura Actual.");
            if (s.tarifaMensual < 0)
                c.imprimir("Tarifa Mensual.");
        }

        else{ 
            s.algoritmo();
            //mostrar / imprimir los datos de salida
            if(s.lecturaAnterior > s.lecturaActual)
                c.imprimir("Consumo Inconsistente. Se cobra Tarifa Plena");
            else{
                c.imprimir("Consumo: " + s.consumo);
            }

            c.imprimir("Agua: " + s.agua);
            c.imprimir("Aseo: " + s.aseo);
            c.imprimir("Alcantarillado: " + s.alcantarillado);
            c.imprimir("Total: " + s.total);
        }
    } 
}//fin class Credito