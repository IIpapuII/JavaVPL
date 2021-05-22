/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosrectangulos;

/**
 *
 * @author IIpapuII
 */
public class funcion {

    //entradas
    int rectangulo1X1;
    int rectangulo1Y1;
    int rectangulo1Ancho;
    int rectangulo1Alto;
    int rectangulo2X1;
    int rectangulo2Y1;
    int rectangulo2Ancho;
    int rectangulo2Alto;
    //salidas
    char puntosDelR1;
    char puntosDelR2;
    int r1X1;
    int r1Y1;
    int r1X2;
    int r1Y2;
    int r1X3;
    int r1Y3;
    int r1X4;
    int r1Y4;
    int r2X1;
    int r2Y1;
    int r2X2;
    int r2Y2;
    int r2X3;
    int r2Y3;
    int r2X4;
    int r2Y4;

    boolean p1;
    boolean p2;
    boolean q1;
    boolean q2;
    boolean r1;
    boolean r2;
    boolean s1;
    boolean s2;
    boolean exteriores;
    boolean interiores;
    boolean secantes;
    boolean tangentes;

    //algoritmo
    void algoritmo() {
        r1X1 = rectangulo1X1;
        r1Y1 = rectangulo1Y1;
        r1X2 = rectangulo1Ancho + rectangulo1X1;
        r1Y2 = r1Y1;
        r1X3 = rectangulo1Ancho + rectangulo1X1;
        r1Y3 = rectangulo1Y1 - rectangulo1Alto;
        r1X4 = r1X1;
        r1Y4 = rectangulo1Y1 - rectangulo1Alto;
        r2X1 = rectangulo2X1;
        r2Y1 = rectangulo2Y1;
        r2X2 = rectangulo2Ancho + rectangulo2X1;
        r2Y2 = r2Y1;
        r2X3 = rectangulo2Ancho + rectangulo2X1;
        r2Y3 = rectangulo2Y1 - rectangulo2Alto;
        r2X4 = r2X1;
        r2Y4 = rectangulo2Y1 - rectangulo2Alto;

        p1 = r2X1 < rectangulo1X1 || r2X1 > rectangulo1X1 + rectangulo1Ancho || r2Y1 > rectangulo1Y1 || r2Y1 < rectangulo1Y1 - rectangulo1Alto;
        p2 = r2X1 > rectangulo1X1 && r2X1 < rectangulo1X1 + rectangulo1Ancho && r2Y1 < rectangulo1Y1 && r2Y1 > rectangulo1Y1 - rectangulo1Alto;
        q1 = r2X2 < rectangulo1X1 || r2X2 > rectangulo1X1 + rectangulo1Ancho || r2Y2 > rectangulo1Y1 || r2Y2 < rectangulo1Y1 - rectangulo1Alto;
        q2 = r2X2 > rectangulo1X1 && r2X2 < rectangulo1X1 + rectangulo1Ancho && r2Y2 < rectangulo1Y1 && r2Y2 > rectangulo1Y1 - rectangulo1Alto;
        r1 = r2X3 < rectangulo1X1 || r2X3 > rectangulo1X1 + rectangulo1Ancho || r2Y3 > rectangulo1Y1 || r2Y3 < rectangulo1Y1 - rectangulo1Alto;
        r2 = r2X3 > rectangulo1X1 && r2X3 < rectangulo1X1 + rectangulo1Ancho && r2Y3 < rectangulo1Y1 && r2Y3 > rectangulo1Y1 - rectangulo1Alto;
        s1 = r2X4 < rectangulo1X1 || r2X4 > rectangulo1X1 + rectangulo1Ancho || r2Y4 > rectangulo1Y1 || r2Y4 < rectangulo1Y1 - rectangulo1Alto;
        s2 = r2X4 > rectangulo1X1 && r2X4 < rectangulo1X1 + rectangulo1Ancho && r2Y4 < rectangulo1Y1 && r2Y4 > rectangulo1Y1 - rectangulo1Alto;
        exteriores = p1 && q1 && r1 && s1;
        interiores = p2 && q2 && r2 && s2;
        System.out.println(interiores + " " + exteriores);
        secantes = !interiores && (p2 || q2 || r2 || s2);
        tangentes = (!exteriores && !interiores && !secantes);
        // Aqui ponga su algoritmo

    }//fin method
}
