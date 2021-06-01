package MayorMenorMedio;

public class control {
    public static void main(String[] args) {
        // Crear la vista
        Consola c = new Consola();
        // Crear el modelo
        funcion m = new funcion();

        // Leer datos de entrada usando la vista
        System.out.println("Escriba tres números separados por espacios:");
        m.a = c.leerEntero();
        m.b = c.leerEntero();
        m.c = c.leerEntero();

        // Invocar los métodos/algoritmos del modelo
        m.algoritmo();

        // Mostrar los datos de saluda usando la vista
        c.imprimir("Mayor= " + m.mayor);
        c.imprimir("Medio= " + m.medio);
        c.imprimir("Menor= " + m.menor);
    }
}
