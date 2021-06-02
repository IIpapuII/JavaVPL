class MainProducto
{
    /**Metodo principal (main) ejecutable*/
    public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        Producto p = new Producto();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        p.cantidadInicial= c.leerEntero("Cantidad Inicial:");
        p.cantidadComprada= c.leerEntero("Cantidad Comprada:");
        p.cantidadVendida= c.leerEntero("Cantidad Vendida:");
        p.precioCompra= c.leerEntero("Precio de Compra:");

        //invocar el algoritmo o los algoritmos, usando el Modelo
         if (p.cantidadInicial < 0 || p.cantidadComprada < 0 || p.cantidadVendida < 0 || p.precioCompra < 0){
         c.imprimir("Error, los siguientes datos son negativos: ");
         if (p.cantidadInicial < 0)
         c.imprimir("Cantidad Inicial:");
         if (p.cantidadComprada < 0)
         c.imprimir("Cantidad Comprada:");
         if (p.cantidadVendida < 0)
         c.imprimir("Cantidad Vendida:");
         if (p.precioCompra < 0)
         c.imprimir("Precio de Compra:");
       }//end if
    
        else
        
        if ((p.cantidadInicial + p.cantidadComprada) < p.cantidadVendida)
        c.imprimir("Error, la cantidad vendida supera las existencias: ");
            
       
        else{
        p.algoritmo();
        c.imprimir("Precio de Venta = " + p.precioVenta);
        c.imprimir("Ingresos = " + p.ingresos);        
        c.imprimir("Egresos = " + p.egresos);
        c.imprimir("Ganancias Brutas = " + p.gananciasBrutas);      
        c.imprimir("Impuestos= " + p.impuestos);
        c.imprimir("Ganancias Netas= " + p.gananciasNetas);
       }
    } 
}//fin class Producto
