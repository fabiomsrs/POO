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
public class TestaHashCode {
    public static void main(String []args){
        Conta cc = new ContaCorrente();
        Conta cc1 = new ContaCorrente();
        cc.deposito(100);
        cc1.deposito(100);
        cc.setNumero(0);
        cc1.setNumero(0);
        
        System.out.println(cc.equals(cc1));
    }
}
