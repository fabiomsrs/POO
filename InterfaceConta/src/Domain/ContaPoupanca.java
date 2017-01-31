/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author ClienteAOC
 */
public class ContaPoupanca implements Conta {
    private double saldo = 0;
    
    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void atualiza(double taxa){
        this.saldo = this.saldo + taxa * 3;
    }

}
