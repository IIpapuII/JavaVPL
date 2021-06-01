
/**
 * Use los comentarios para explicar el objetivo de este programa MainNumerosPoliticos .
 *
 * @author Ricard Yovanny Riveros Rangel ricardyovannyrr@ufps.edu.co
 * @version 2.0
 */
public class MainNumerosPoliticos
{
    public static void main(String [] args){
       //Crear objeto del modelo "M" o negocio
        NumerosPoliticos p = new NumerosPoliticos();    
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        p.numero1 = c.leerLong ("Número: ");

        //Evaluar datos
        
        if (p.numero1 < 9)
            c.imprimir ("ERROR");
        else
        {
            p.algoritmo ();
            
            if (p.numeroPolit)
                c.imprimir ("El número " + p.numero1 + " SI es político y la suma de sus dígitos es " + p.sumas);
            else 
                c.imprimir ("El número " + p.numero1 + " NO es político. La suma de sus dígitos es " + p.sumas + " y el residuo de la división es " + p.residuo + ".");
        }
    }
}
