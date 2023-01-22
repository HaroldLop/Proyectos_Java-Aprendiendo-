
package nuevii;

import javax.swing.JOptionPane;

/**
 *
 * @author HAROLD
 * PEDIR EL DIA MES Y AÑO E INDICAR SI LA FECHA ES CORRECTA  ,SUPONER QUE TODOS LOS MESES TIENEN 30 DIAS
 */
public class Nuevii {

    
    public static void main(String[] args) {
    
        
        int dia ,mes ,año ; 
        
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digita el año: "));
        
        
        if((dia>=1)&& (dia<31) ){
            
            if((mes>=1)&&(mes<=30) ){
                if(año!=0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Año incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "mes incorrecto");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Dia incorrecto");
        }
                
        
    }
    
}
