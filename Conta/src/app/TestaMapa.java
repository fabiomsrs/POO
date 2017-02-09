/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import domain.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ClienteAOC
 */
public class TestaMapa {
    public static void main(String []args){
        Conta c1 = new ContaCorrente();
        c1.deposito(100);
        
        Conta c2 = new ContaCorrente();
        c2.deposito(1000);
        
        Map<String,Conta> contas = new HashMap();
        
        contas.put("diretor", c1);
        contas.put("gerente", c2);
        
        System.out.println(contas);
    }
}
