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
public class TestaTributavel {
    public static void main(String []args){
        ContaCorrente cc = new ContaCorrente();
        cc.deposito(100);
        System.out.println(cc.calculaTributo());
        
        Tributavel t = cc;
        
        System.out.println(t.calculaTributo());
    }
}
