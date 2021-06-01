package CalendarioLunar;

public class control
{
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           funcion cl = new funcion();

       //Leer datos de entrada usando la vista
           cl.dia = c.leerEntero("Dia");
           cl.mes = c.leerEntero("Mes");
           cl.año = c.leerEntero("Añ");

       //Invocar los métodos/algoritmos del modelo
           cl.algoritmo();

       if((cl.total>=0 && cl.total<=6) || (cl.total==29)){
           c.imprimir("Luna Nueva");
    }
    else if(cl.total>=7 && cl.total<=13){
           c.imprimir("Cuarto Creciente");
    }
    else if(cl.total>=14 && cl.total<=20){
           c.imprimir("Luna Llena");
    }
    else{
        c.imprimir("Cuarto Menguante");
    }
    
}//
}//fin class MainCalendarioLunar