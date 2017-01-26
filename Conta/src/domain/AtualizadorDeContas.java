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
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    public void roda(Conta c){
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo final: " + c.getSaldo());
        saldoTotal += c.getSaldo();
    }
    public double getSaldoTotal(){
        return this.saldoTotal;
    }
}
