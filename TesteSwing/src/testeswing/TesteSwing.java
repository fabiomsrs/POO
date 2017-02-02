/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeswing;

import javax.swing.*;

/**
 *
 * @author ClienteAOC
 */
public class TesteSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JButton test1 = new JButton("teste1");
        JButton test2 = new JButton("teste2");
        JPanel panel = new JPanel();
        panel.add(test1);
        panel.add(test2);
        JFrame frame = new JFrame("Argetum");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
