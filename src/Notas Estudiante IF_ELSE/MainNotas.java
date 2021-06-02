

public class MainNotas
{
    public static void main(String [] args){

        //Crear el modelo
        Notas n = new Notas();
        //Crear la vista
        Consola c = new Consola();
        //Leer datos de entrada usando la vista
        n.nota = c.leerDouble("Escriba la nota");

        n.algoritmo();

        if(!n.notaValida){
            c.imprimir("La calificación no es válida (fuera del rango [0,5]).");
        }
        
        
        else{
            if(n.notaMuyDeficiente){
                c.imprimir("La calificación es muy deficiente.");
            }
            if(n.notaDeficiente){
                c.imprimir("La calificación es deficiente.");
            }
            if(n.notaAceptable){
                c.imprimir("La calificación es aceptable.");
            }
            if(n.notaBuena){
                c.imprimir("La calificación es buena.");
            }
            if(n.notaExcelente){
                c.imprimir("La calificación es excelente.");  
            }

        }
    }
}//fin class MainNotas
