/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii;

/**
 *
 * @author IIpapuII
 */
public class Ascii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Consola dato = new Consola();
       char toma;
       int conver;
       
       toma = dato.leerCaracter("Caracter: ");
         conver = (int)toma; 
       if(conver>=0 && conver<=31 )
       {
           dato.imprimir("No imprimible");
       }else{
           
           if(conver>=48 && conver<=57 )
           {
               dato.imprimir("1=Dígito");
           }else{
               if(conver==65||conver==69||conver==73||conver==79||conver==85)
               {
                   dato.imprimir("4=Alfabético Vocal MAYÚSCULA");
               }else{
                  if(conver>=66 && conver<=68 || conver>=70 && conver<=72||conver>=74 && conver<=78||conver>=80 && conver<=84||conver>=86 && conver<=90 ) 
                  {
                      dato.imprimir("2=Alfabético Consonante MAYÚSCULA");
                  }else{
                      if(conver==97||conver==101||conver==105||conver==111||conver==117)
                      {
                           dato.imprimir("5=Alfabético Vocal minúscula");
                      }else{
                          if(conver>=98 && conver<=100 || conver>=102 && conver<=104||conver>=106 && conver<=110||conver>=112 && conver<=116||conver>=118 && conver<=122 )
                          {
                               dato.imprimir("3=Alfabético Consonante minúscula");
                          }else{
                              dato.imprimir("6=Otro tipo de símbolo");
                          }
                      }
                  }
               }
           }
       }
    }
    
}
