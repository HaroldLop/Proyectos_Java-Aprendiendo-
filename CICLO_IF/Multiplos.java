
package probando;

import javax.swing.JOptionPane;


/**
 * 
 * @author HAROLD
 * Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
 */


public class Probando {

    
    public static void main(String[] args) {
       
        int numero; 
        String multiplo;
        
        numero =Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entero....."));
        
        multiplo = (numero%10==0) ? "El numero "+numero+" es multiplo de 10":"No es multiplo";
        
        JOptionPane.showMessageDialog(null, multiplo);
        }
        
    }
    

