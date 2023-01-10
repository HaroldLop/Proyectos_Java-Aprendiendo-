
package probando;

import javax.swing.JOptionPane;


/**
 * 
 * @author HAROLD
 * Programa que lea un caracter y compruebe si es mayuscula
 */


public class Probando {

    
    public static void main(String[] args) {
       
       char letra ; 
       String valor ;
       
       
       letra = JOptionPane.showInputDialog("Digita una letra").charAt(0);
       
     
       valor = (Character.isUpperCase(letra)) ? "La letra es Mayuscula":"La letra es minuscula";
       
       JOptionPane.showMessageDialog(null, valor);
     
        }
        
    }
    

