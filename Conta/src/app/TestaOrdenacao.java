/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import domain.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
/**
 *
 * @author ClienteAOC
 */
public class TestaOrdenacao {
    public static void main(String []args){
        List<ContaPoupanca> lista = new LinkedList<>();
        
        /*for(int i = 0; i < 10; i++){
            Random random = new Random();            
            ContaPoupanca cc = new ContaPoupanca();
            int saldo = random.nextInt(1000)+1;
            cc.deposito(saldo);
            lista.add(cc);
        }*/
        ContaPoupanca cc = new ContaPoupanca();
        cc.setNomeClient("Fabiano");
        cc.deposito(100);
        lista.add(cc);
        
        ContaPoupanca cc1 = new ContaPoupanca();
        cc1.setNomeClient("babi");
        cc1.deposito(1000);
        lista.add(cc1);
        
        ContaPoupanca cc2 = new ContaPoupanca();
        cc2.setNomeClient("dada");
        cc2.deposito(10);
        lista.add(cc2);
        
        Collections.sort(lista);
        
        /*for (ContaPoupanca contaPoupanca : lista) {
            System.out.println(contaPoupanca);
        }*/
        System.out.println(lista);
    }
}
