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
public class Conta {
    protected double saldo = 0;
    
    public void deposito(double valor){
        this.saldo += valor;
    }
    public void saque(double valor){
        this.saldo -= valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }

    @Override
    public String toString() {
        return "Saldo: "+ this.getSaldo(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
