
package probando;

import javax.swing.JOptionPane;


/**
 * 
 * @author HAROLD
 * Pedir dos numeros y decir cual es el mayor o si son iguales
 */


public class Probando {

    
    public static void main(String[] args) {
       
               int num1 , num2;
               
               num1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
                
                // verificar cual es el numero mayor 
                
                
                if (num1>num2){
                    JOptionPane.showMessageDialog(null, "El numero  mayor es "+num1);
                }else if(num2>num1) {
                    JOptionPane.showMessageDialog(null, "El numero  menor es "+num2);
                }else{
                     JOptionPane.showMessageDialog(null, "Los numeros son iguales");
                }
     
        }
        
    }
    

