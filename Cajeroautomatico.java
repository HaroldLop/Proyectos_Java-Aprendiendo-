
package cajeroautomatico;

import javax.swing.JOptionPane;

/**
 *
 * @author HAROLD
 * 
 /**
 *
 * @author HAROLD
 * Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:

1. Ingresar dinero a la cuenta.
2. Retirar dinero de la cuenta.
3. Salir
 */
public class Cajeroautomatico {

    
    public static void main(String[] args) {
        
        
        
        
        final int saldo_inicial = 1000;
        int opcion ;
        float ingreso,retiro,saldo_actual;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Digita la Operacion que vas a realizar
                                                               1. Ingresar dinero a la cuenta. 
                                                              2. Retirar dinero de la cuenta.
                                                              3.Salir"""));
       switch(opcion){
           case 1: 
               
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digita el dinero a ingresar"));
                saldo_actual = ingreso+saldo_inicial;
                JOptionPane.showMessageDialog(null, "Ahora tu dinero es  "+saldo_actual);
                break;
                 case 2:
                retiro=Float.parseFloat(JOptionPane.showInputDialog("Digita el monto a retirar"));
                
                if(retiro>saldo_inicial){
                    JOptionPane.showMessageDialog(null, "No tienes el saldo suficiente para realizar el retiro");
                }else{
                    saldo_actual =saldo_inicial-retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta : "+saldo_actual);
                    
                }
                   break;
                   
            case 3:
                break;
            default : 
                JOptionPane.showMessageDialog(null, "Se equivoco de opcion de menu");
       }
        
    
        }
        
        
        
      
                
        
        
    }
    

