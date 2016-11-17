
package boletin10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class JuegoNumVsPC {
    
   public void juegoNumPC(){
     
       int nintentosf = 5;
        int numpc = (int)(Math.random()*(50-1)+1);
        
        if (numpc>0&&numpc<=50){        
           
        do {
        int numplayer = Integer.parseInt(JOptionPane.showInputDialog("Xogador: Intente adiviñar o número (entre 0 e 50)"));
        int aux0 = Math.abs(numpc-numplayer);
        
         if (aux0!=0){
         if (aux0<=5){
            System.out.println("Estás moi cerca de acertar o número");
            }
           
         else if (aux0<=20){
            System.out.println("Todavía debes acercarte máis");
            }
         else if (aux0<=35){
            System.out.println("Sorte que non te gañas a vida con esto, estás moi lonxe");
            }
         
         nintentosf--;
         JOptionPane.showMessageDialog(null, "Te quedan " + nintentosf + " número de intentos");
         } else{
            JOptionPane.showMessageDialog(null, "Felicidades, acertache o número");
            break;
         }
    } while (nintentosf!=0);
         JOptionPane.showMessageDialog(null, "Ha agotado o número de intentos ou ha acertado o número");
    }
   }
}

