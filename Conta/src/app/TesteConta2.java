/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import domain.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ClienteAOC
 */
public class TesteConta2 {
    public static void main(String[] args){
        Conta cc = new ContaCorrente();
        Conta cc1 = new ContaCorrente();
        cc.setNumero(0);
        cc1.setNumero(0);
        Set<Conta> test = new HashSet();
        
        test.add(cc);
        test.add(cc1);
        
        System.out.println(test+ " "+ cc.equals(cc1));
    }
}
