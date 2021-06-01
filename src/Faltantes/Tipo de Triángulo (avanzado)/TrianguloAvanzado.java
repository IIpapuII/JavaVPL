
/**
 * Use los comentarios para explicar el objetivo de este programa TrianguloAvanzado .
 *
 * @author Ricard Yovanny Riveros Rangel - ricardyovannyrr@ufps.edu.co
 * @version 2.1
 */
public class TrianguloAvanzado
{
    //entradas
    double x1;
    double y1;
    double x2;
    double y2;
    double x3; 
    double y3;

    //salidas
    double lado1;
    double lado2;
    double lado3;
    double m1;
    double m2;
    double m3;
    boolean esTriangulo;
    boolean esEquilatero;
    boolean esIsosceles;
    boolean esEscaleno;
    boolean esRectangulo;

    //algoritmo
    
    void algoritmo( ){
     // Aqui ponga su algoritmo
     lado1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
     lado2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)); 
     lado3 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3- y2));
     m1 = (y2 - y1) / (x2 - x1);
     m2 = (y3 - y1) / (x3 - x1);
     m3 = (y3 - y2) / (x3 - x2);
     esTriangulo = (m1 != m2) && (m2 != m3) && (m3 != m1);
     esEquilatero = (lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3);
     esIsosceles = ((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)) && ((lado1 != lado2) || (lado2 != lado3) || (lado3 != lado1));
     esEscaleno = esTriangulo && (lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3);
     esRectangulo = esRectangulo = esTriangulo && (Math.pow(lado1,2)+Math.pow(lado2,2) == Math.pow(lado3,2) || Math.pow (lado1,2)+ Math.pow (lado3,2) == Math.pow(lado2,2) || Math.pow (lado2,2)+Math.pow (lado3,2) == Math.pow (lado1,2));
     
    }//fin method
    
}//fin class TrianguloAvanzado
