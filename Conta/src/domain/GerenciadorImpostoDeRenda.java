/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ClienteAOC
 */
public class GerenciadorImpostoDeRenda {
    static private double total = 0;
    
    public void adiciona(Tributavel t){
        total += t.calculaTributo();
    }
    
    public double geTotal(){
        return total;
    }
}
