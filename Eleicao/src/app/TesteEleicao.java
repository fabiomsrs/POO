/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import domain.Eleicao;
import javax.swing.JOptionPane;

/**
 *
 * @author ClienteAOC
 */
public class TesteEleicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eleicao e = Eleicao.getInstance();        
        e.setCandidato();
        e.setCandidato();
        JOptionPane.showMessageDialog(null,e.resultadoGeral());
        JOptionPane.showMessageDialog(null,e.resultadoFinal());
        JOptionPane.showMessageDialog(null,e.getAbstencao());
    }
    
}
