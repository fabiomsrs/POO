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
public class ContaPoupanca extends Conta{
    
    public void atualiza(double taxa){
        this.saldo = this.getSaldo() + taxa * 3;
    }
}
