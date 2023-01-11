package probando;

import javax.swing.JOptionPane;


/**
 * 
 * @author HAROLD
 *  Pedir 3 numeros y mostrarlos ordenados de mayor a menor
 */


public class Probando {

    
    public static void main(String[] args) {
       
             
          int num1, num2, num3 ;

   num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: ")) ;
   num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: ")) ;
   num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer y ultimo numero: ")) ;

   if ((num1>num2) && (num2>num3) ){
       JOptionPane.showMessageDialog(null,"El orden es: " +num1 +"-" +num2 + "-" +num3);

   }else if ((num1>num3) && (num3>num2)){
       JOptionPane.showMessageDialog(null,"El orden es: " +num1 +"-" +num3 + "-" +num2);
   }else if ((num2>num1) && (num1>num3)){
       JOptionPane.showMessageDialog(null,"El orden es: " +num2 +"-" +num1 + "-" +num3);
   }else if ((num2>num3) && (num3>num1)){
       JOptionPane.showMessageDialog(null,"El orden es: " +num2 +"-" +num3 + "-" +num1);
   }else if ((num3>num1) && (num1>num2)){
       JOptionPane.showMessageDialog(null,"El orden es: " +num3 +"-" +num1 + "-" +num2);
   }else if ((num3>num2) && (num2>num1) ){
       JOptionPane.showMessageDialog(null,"El orden es: " +num3 +"-" +num2 + "-" +num1);
   }
   else{
       JOptionPane.showMessageDialog(null,"Los numeros son iguales mi chamo");
     }
            
       
       
       
      
     
        }
        
    }