
package nuevii;

import javax.swing.JOptionPane;

/**
 *
 * @author HAROLD
 * CALCULADORA ARITMETICA
 * Construir un programa que simule el funcionamiento de una calculadora que pueda
 * realizar las 4 operaciones aritmeticas basicas suma resta producto y division con valores enteros
 * el usuario debe especificar la operacion con el primer caracter del promer parametro de la linia de comandos  So S para suma
 * r o R para resta , p o P  para el producto y d oD para la division
 */
public class Nuevii {

    
    public static void main(String[] args) {
    
        int  num1, num2,suma,resta,mul,div;
        char operacion ; 
        
       
       num1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
       
       operacion = JOptionPane.showInputDialog("Digita la operacion a realizar\n"
               + "S o s para suma\n"
               + "R o r para resta\n "
               + "M o m pra multiplicar\n "
               + "D o d para dividir: ").charAt(0);
       
    
       
       switch(operacion){
           case 'S': 
           case 's' :
               
               suma =num1+num2;  JOptionPane.showMessageDialog(null, "La suma es "+suma);
               break;
           case 'R':
           case 'r': 
                    resta= num1-num2; JOptionPane.showMessageDialog(null, "La resta es "+resta);
                    break;
           case 'M':
           case 'm':
                   mul =num1*num2 ; JOptionPane.showMessageDialog(null, "La multiplicacion  es "+mul);
                   break ;
           case 'D':
           case 'd':
               div=num1/num2; JOptionPane.showMessageDialog(null, "La division es  "+div);
               break;
           default: JOptionPane.showMessageDialog(null, "Escribe bien las letras correspondientes");
           break;
                   
       }
    }
    
}
