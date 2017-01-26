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
public class Banco {
    private static int qtdConta = 0;
    private Conta []conta = new Conta[10];
    
    public void adicionConta(Conta c){
        if(qtdConta == 10){
            System.out.println("Conta lotada");            
        }
        else{
            conta[qtdConta] = c;
            qtdConta++;
        }
    }
    public Conta pegaConta(int x){
        return conta[x];
    }
    public int pegaTotalDeContas(){
        return qtdConta;
    }
    
    
}
