/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import domain.*;

/**
 *
 * @author ClienteAOC
 */
public class TesteConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        
        c.deposito(1000);
        cc.deposito(1000);
        cp.deposito(1000);
        
        Banco b = new Banco();
        
        b.adicionConta(c);
        b.adicionConta(cc);
        b.adicionConta(cp);
        
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        for(int i = 0; i < b.pegaTotalDeContas(); i++){
            adc.roda(b.pegaConta(i));
        }        
        
        System.out.println(adc.getSaldoTotal());
        
    }
    
}
