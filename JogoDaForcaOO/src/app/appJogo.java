/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import domain.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ClienteAOC
 */
public class appJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BancoDeDados bp = new BancoDeDados();
        bp.setTemaEPalavra("Lixoso".toLowerCase(), "Python".toLowerCase());
        int menu = 0;                
        do{
            menu = Integer.valueOf(JOptionPane.showInputDialog("1 - Jogar\n2 - Adicionar Palavras\n3 - Sair"));
            switch(menu){
                case 1:
                    int numJogadores = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero de jogadores"));
                    Rodada rodada = new Rodada(numJogadores,bp);
                    rodada.partida();
                    break;
                case 2:
                    String conteudoTema = JOptionPane.showInputDialog("Digite o Tema");
                    String conteudoPalavra = JOptionPane.showInputDialog("Digite a Palavra");
                    bp.setTemaEPalavra(conteudoTema.toLowerCase(), conteudoPalavra.toLowerCase());
                    break;
                case 3:
                    break;
            }
        }while(menu != 3);
    }
    
}
 