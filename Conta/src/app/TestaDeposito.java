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
public class TestaDeposito {
    public static void main(String []args){
        ContaPoupanca cp = new ContaPoupanca();
        try{
            cp.deposito(-1);
        }catch(InvalidValueException e){
            System.out.println(e.getMessage());
        }
    }
}
