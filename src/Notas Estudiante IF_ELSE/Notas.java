
public class Notas
{
    //entradas
    double nota;

    //salidas
    boolean notaValida;
    boolean notaMuyDeficiente;
    boolean notaDeficiente;
    boolean notaAceptable;
    boolean notaBuena;
    boolean notaExcelente;

    //algoritmo
    
    void algoritmo( ){
      notaValida = nota>=0 && nota<=5;
      notaMuyDeficiente = nota>=0 && nota<3;
      notaDeficiente = nota>=3 && nota<3.5;
      notaAceptable = nota>=3.5 && nota<4;
      notaBuena = nota>=4 && nota<4.5;
      notaExcelente = nota>=4.5 && nota<=5;
      // Aqui ponga su algoritmo
    
    }//fin method
}//fin class Notas
