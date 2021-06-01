/**
 * Use los comentarios para explicar el objetivo de este programa 
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 4.0
 */
public class FechaValida
{
    //entradas
    int dia;
    int año;
    char mes;
    //salidas
        boolean meses30,meses31,bisiesto,f1,f2;
        boolean datosIncorrectos;
    //Ingresar algoritmo
    void algoritmo()
    {
        meses30 = calcularMes30Días(mes,dia);
        meses31 =  calcularMes31Días(mes,dia);
        bisiesto = calcularAñoBisiesto(mes,año,dia);
        datosIncorrectos = calcularDatosIncorrectos (mes,año,dia);

    }

    boolean calcularMes30Días(char m,int d){
        boolean meses30;
        meses30 = (m=='A'||m=='N'||m=='J'||m=='S') && d<=30 ;
        return meses30;
    }

    boolean calcularMes31Días(char m,int d){
        boolean meses31;
        meses31 =  (m=='E'||m=='M'||m=='Y'||m=='L'||m=='G'||m=='O'||m=='D')&& d<=31;
        return meses31;
    }

    boolean calcularAñoBisiesto(char m,int a,int d){


        bisiesto = (a%4==0 && (a%100!=0 || a%400==0));
        if (bisiesto)
            f1= (d<= 29 && m=='F');
        else
             f2=(d<=28 && m =='F');
        
        
        return bisiesto;
    }
    boolean calcularDatosIncorrectos (char m,int a, int d){
    boolean datosIncorrectos;
     datosIncorrectos= ((d<=0 || a<=0) ||(m!='E'&& m!='F'&& m!='M'&& m!='A'&& m!='Y'&& m!='J'&& m!='L'&& m!='G'
     && m!='S'&& m!='O'&& m!='N'&& m!='D'));
    
    return datosIncorrectos;
    }
    
    
}