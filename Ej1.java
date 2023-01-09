
package ej1;

import java.util.Scanner;



/**
 * @author Harold Lopez Jimenez
 * PROGRAMA QUE CALCULA  LAS RAICES DE ECUACION DE SEGUNDO GRADO DE COEFICIENTES REALES
 */
 
public class Ej1 {

  
    public static void main(String[] args) {
       Scanner datos = new Scanner (System.in);
       double a,b,c ,res,res2;
       
        System.out.println("Digita  el valor de letra a ");
        a = datos.nextDouble();
        System.out.println("Digita  el valor de la letra b ");
        b = datos.nextDouble();
        System.out.println("Digita  el valor de la letra c ");
        c = datos.nextDouble();
        
        //Realizar la Operacion
        
        res = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        res2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        System.out.println("El resultados es: "+res+" ,"+res2);
    }

    
    
}
