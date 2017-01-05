/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import domain.domain;
import javax.swing.JOptionPane;

public class app {
    
    public static void main(String []args){
        
        int auxQ;
        do{
        String questao = JOptionPane.showInputDialog("Digite o numero da questao (1 a 5) digite 0 pra sair");
        auxQ = Integer.parseInt(questao);
        
        switch (auxQ){
            case 1:
                domain.quest1();
                break;
            case 2:
                domain.quest2();
                break;
            case 3:
                domain.quest3();
                break;                
            case 4:
                domain.quest4();
                break;      
            case 5:
                domain.quest5();
                break;                                                        
            default:
                if (auxQ == 0){
                    JOptionPane.showMessageDialog(null, "BYE");
                    break;
                }               
                JOptionPane.showMessageDialog(null, "Numero invalido BYE");
                break;                      
                   
        }
        }while(auxQ > 0 && auxQ <=5);
            
    }
}
   

