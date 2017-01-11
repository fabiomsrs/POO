/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import domain.Estacionamento;
import domain.Veiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class TesteEstacionamento {
    
    public static void main(String []args){
        //Só excuta o main professor, ja ta tudo implementado
        Estacionamento e = null;        
        Estacionamento.instancia(e);
        int num = 0; 
        
        while(num != 4){
            num = Integer.parseInt(JOptionPane.showInputDialog("1-Entrada\n 2-Saida\n3-Listar situacao atual\n4-Fim do Programa"));
            switch(num){
                case 1:
                    e.getEntrada();
                    break;
                case 2:
                    e.getSaida();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,e.getListarVagas());
                case 4:
                    JOptionPane.showMessageDialog(null,"BYE");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Numero Invalido");
                    break;

            }
        }
    }
   
    
}
