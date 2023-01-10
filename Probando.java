
package probando;

import javax.swing.JOptionPane;


/**
 * 
 * @author HAROLD
 * En realplaza se hace un 20% de descuento alos clientes
 * cuya compra supere los $300 ¿Cual sera la cantidad qque pagara una persona x su compra?
 */


public class Probando {

    
    public static void main(String[] args) {
       
       float precio ,descuento; 
       
       
       precio = Float.parseFloat(JOptionPane.showInputDialog("Digita el monto de la compra"));
       
       //calculo si es que se le hace descuento o no 
        if(precio >=300){
            descuento = precio -(precio *0.2f);
            
            JOptionPane.showMessageDialog(null,"El precio con descuento es : "+descuento);
        }else 
            JOptionPane.showMessageDialog(null,"El precio  es : "+precio);
        }
        
    }
    

