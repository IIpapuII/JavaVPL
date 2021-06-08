
/**
 * Use los comentarios para explicar el objetivo de este programa MainMayorYMenor .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 5.0
 */
public class MainMayorYMenor
{
    public static void main(String [] args){
       //Crear la vista
           Consola c = new Consola();
       //Crear el modelo
           MayorYMenor m = new MayorYMenor ();
       //Leer datos de entrada usando la vista
           int n = c.leerEntero (" Tamaño: ");
           m.numeros = new int [n];
           for(int i=0;i < m.numeros.length; i ++) {
       m.numeros[i] = c.leerEntero( " numeros[" +i+ "] = ");
    }
    m.calcularMenor();
    m.calcularMayor();
    
    c.imprimir("Posicion Mayor: "+m.posicionMayor +" Mayor: " +m.mayor + ", Posicion Menor: "+m.posicionMenor + ", Menor: " +m.menor);

  }
}