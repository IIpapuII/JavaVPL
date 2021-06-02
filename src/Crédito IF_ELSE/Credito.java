class Credito{
    //entradas
    long montodelCredito;
    long tasadeInteres; 
    long plazoenMeses;
    //salidas
    long valorCuotaMensual;
    long valorMensualCapital;
    long valorMensualInteres;
    long gananciaTotal;

        void algoritmo(){
      //transformar las entradas en salidas
     valorMensualCapital = montodelCredito/plazoenMeses;
     valorMensualInteres = (montodelCredito * tasadeInteres)/100;
     valorCuotaMensual = valorMensualCapital + valorMensualInteres;
     gananciaTotal = (valorMensualInteres*plazoenMeses*100)/montodelCredito;
    }
}  