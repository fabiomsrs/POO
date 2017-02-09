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
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
    public String nomeClient;
    
    public void setNomeClient(String nomeClient) {
        this.nomeClient = nomeClient;
    }
    public void atualiza(double taxa){
        this.saldo = this.getSaldo() + taxa * 3;
    }
    
    @Override
    public int compareTo(ContaPoupanca o) {
        return this.nomeClient.compareToIgnoreCase(o.nomeClient);
    }

    @Override
    public String toString() {
        return "Nome: "+ this.nomeClient+" Saldo: " + this.getSaldo(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
