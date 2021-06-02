
class Servicios{ 
    //entradas
    int lecturaAnterior;
    int lecturaActual;
    int tarifaMensual;
    //salidas
    int consumo;
    double agua;
    double aseo;
    double alcantarillado;
    double total;

    void algoritmo(){
        //transformar las entradas en salidas

        consumo = lecturaActual - lecturaAnterior;
        if(consumo<0){
            agua = (tarifaMensual * 30);
            aseo = agua * 10/100;
            alcantarillado = agua * 15/100;
            total = agua + aseo + alcantarillado;
        }
        else{
            if (consumo<=20){
                agua = (consumo * tarifaMensual);
            }
            else{
                agua = (consumo * tarifaMensual + (consumo - 20) * 0.25 * tarifaMensual); 
            }    
            aseo = agua * 10/100;
            alcantarillado = agua * 15/100;
            total = agua + aseo + alcantarillado;
        }
    }
}