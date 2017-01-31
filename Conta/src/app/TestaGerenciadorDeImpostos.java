/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import domain.ContaCorrente;
import domain.GerenciadorImpostoDeRenda;
import domain.SeguroDeVida;

/**
 *
 * @author ClienteAOC
 */
public class TestaGerenciadorDeImpostos {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        SeguroDeVida s1 = new SeguroDeVida();
        c1.deposito(100);
        c2.deposito(100);
        
        System.out.println(c1.calculaTributo() + " " + c2.calculaTributo() + " " + s1.calculaTributo());
        GerenciadorImpostoDeRenda g1 = new GerenciadorImpostoDeRenda();
        g1.adiciona(s1);
        g1.adiciona(c1);
        g1.adiciona(c2);
        System.out.printf("O total eh = %.2f",g1.geTotal());
    }
}
