
package probando;

import javax.swing.JOptionPane;


/**
 * 
 * @author HAROLD
 * Un obrero necesita calcular su salario semanal
 * el cual se obtiene de la sgt manera : 
 * 
 * 1. Si trabaja 40 horas o menos se le paga $16 xhora
 * 2. Si trabaja mas de 40 horas se le paga $16 x cada una de las primeras 40 horas  y $20 x cada hora extra
 * 
 */


public class Probando {

    
    public static void main(String[] args) {
       
     
         int numHoras;
         float  preciodehora = 16 , salariot; 
       
         
          numHoras = Integer.parseInt(JOptionPane.showInputDialog("Digita cuantas horas haz trabajado"));
          
          //calcularemos su salario total 
          
          if (numHoras <=40){
              salariot = (numHoras*preciodehora);
              JOptionPane.showMessageDialog(null, "El salario total es : "+salariot);
                
          }else{
              salariot = (40*preciodehora)+((numHoras-40)*20);
                 JOptionPane.showMessageDialog(null, "El salario total es : "+salariot);     
          }
         
        }
        
    }
    

