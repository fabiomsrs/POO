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
    
        Estacionamento e = new Estacionamento();
        Veiculo v = new Veiculo("84238");
        Veiculo v1 = new Veiculo("458");
        Veiculo v2 = new Veiculo("638");
        Veiculo v3 = new Veiculo("438");
        e.getEntrada(v);
        e.getEntrada(v1);
        e.getEntrada(v2);
        e.getSaida();
        e.getEntrada(v3);
        JOptionPane.showMessageDialog(null,e.getListarVagas());
    }
   
    
}
