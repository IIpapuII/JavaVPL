class Producto{
    //entradas
    int cantidadInicial; 
    int cantidadComprada; 
    int cantidadVendida; 
    int precioCompra;

    //salidas
    int precioVenta;
    int ingresos;
    int egresos;
    int perdidasBrutas;
    int impuestos;
    int perdidasNetas;

    void algoritmo(){
        //transformar las entradas en salidas
        precioVenta = precioCompra + (precioCompra*29)/100;
        ingresos = cantidadVendida * precioVenta;
        egresos = cantidadComprada * precioCompra;
        perdidasBrutas = ingresos - egresos;
        impuestos = (ingresos*19)/100;
        perdidasNetas = ingresos - (egresos + impuestos);
    } 
}