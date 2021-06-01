package Numerosbinarios;

public class control {
    public static void main(String[] args) {
        // Crear objeto del modelo "M" o negocio
        funcion b = new funcion();
        // Crear objeto Vista "V"
        Consola c = new Consola();

        // leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        b.numeroBinario = c.leerLong("Número Binario (sólo 1 y 0):");
        // Invocar los métodos/algoritmos usando el modelo
        b.algoritmo();

        // mostrar / imprimir los datos de salida
        if (b.esBinario == false)
            c.imprimir("Datos Inválidos");
        else
            c.imprimir("Decimal: " + b.decimal);
    }
}
