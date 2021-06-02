package fechaValidad;

public class funcion {
    Consola a = Consola();
    int dia;
    char mes;
    int anio;

    void EntradaDAtos(){
        dia = a.leerEntero("Ingrese dia: ");
        mes = a.leerCaracter("Ingrese mes");
    }

}
