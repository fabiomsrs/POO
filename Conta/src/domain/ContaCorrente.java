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
public class ContaCorrente extends Conta implements Tributavel{
    
    
    public void atualiza(double taxa){
        this.saldo = this.getSaldo() + taxa * 2;
    }
    
    public void deposito(double valor) {
        super.deposito(valor - 0.10);
    }
    
    @Override
    public double calculaTributo() {
        return this.getSaldo() * 0.01;
    }
    
}
