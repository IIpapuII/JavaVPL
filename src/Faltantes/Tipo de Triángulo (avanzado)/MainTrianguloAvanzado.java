/**
 * Use los comentarios para explicar el objetivo de este programa MainTrianguloAvanzado .
 *
 * @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co
 * @version 2.1
 */
public class MainTrianguloAvanzado
{
    public static void main(String [] args){
       //Crear el modelo
       TrianguloAvanzado t = new TrianguloAvanzado();
       //Crear la vista
       Consola c = new Consola();

       //Leer datos de entrada usando la vista
       t.x1 = c.leerDouble("x1");
       t.y1 = c.leerDouble("y1");
       t.x2 = c.leerDouble("x2");
       t.y2 = c.leerDouble("y2");
       t.x3 = c.leerDouble("x3");
       t.y3 = c.leerDouble("y3");

       //Invocar los métodos/algoritmos del modelo
       t.algoritmo();

       //Mostrar los datos de saluda usando la vista
       c.imprimir("Lado 1        : " + t.lado1);
       c.imprimir("Lado 2        : " + t.lado2);
       c.imprimir("Lado 3        : " + t.lado3);
       c.imprimir("m1            : " + t.m1);
       c.imprimir("m2            : " + t.m2);
       c.imprimir("m3            : " + t.m3);
       c.imprimir("Es Triángulo  : " + t.esTriangulo);
       c.imprimir("Es Equilátero : " + t.esEquilatero);
       c.imprimir("Es Isósceles  : " + t.esIsosceles);
       c.imprimir("Es Escaleno   : " + t.esEscaleno);
       c.imprimir("Es Rectángulo : " + t.esRectangulo);
       
       
    }
}//fin class MainTrianguloAvanzado
