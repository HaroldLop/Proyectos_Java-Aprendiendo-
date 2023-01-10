
package probando;

import javax.swing.JOptionPane;


/**
 * 
 * @author HAROLD
 * Hacer un programa que tome dos numros y diga si ambos son pares o
 * impares
 * 
 */


public class Probando {

    
    public static void main(String[] args) {
       
         int num1,num2 ; 
         
         
         
         num1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
         num2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
         
         //calculo si son pares o impares
         
         if((num1%2 ==0) &&(num2%2 ==0)){
             
             JOptionPane.showMessageDialog(null, "Son numeros pares");
             
         }else if((num1%2 !=0) &&(num2%2 !=0)){
              JOptionPane.showMessageDialog(null, "Son numeros impares");
         }else{
              JOptionPane.showMessageDialog(null, "Un numero es par y el otro impar");
         }
         
        }
        
    }
    

