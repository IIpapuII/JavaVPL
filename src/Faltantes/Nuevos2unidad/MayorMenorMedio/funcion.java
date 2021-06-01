package MayorMenorMedio;

public class funcion {
  // entradas
  int a;
  int b;
  int c;
  // salidas
  int mayor;
  int medio;
  int menor;
  // algoritmo

  void algoritmo() {
    if (a >= b && a >= c) {
      mayor = a;
      if (b >= c) {
        medio = b;
        menor = c;
      } else {
        medio = c;
        menor = b;
      }
    } else {
      if (b >= a && b >= c) {
        mayor = b;
        if (a >= c) {
          medio = a;
          menor = c;
        } else {
          medio = c;
          menor = a;
        }
      } else {
        mayor = c;
        if (a >= b) {
          medio = a;
          menor = b;
        } else {
          medio = b;
          menor = a;
        }
      }
    }
  }// fin method
}
