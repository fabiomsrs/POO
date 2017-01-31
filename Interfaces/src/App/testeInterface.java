/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Domain.*;


/**
 *
 * @author ClienteAOC
 */
public class testeInterface {

    /**
     * @param args the command line arguments
     */
    public static void test(AreaCalculavel a){
        System.out.println(a.calculaArea());
    }
    public static void main(String[] args) {
        Retangulo a = new Retangulo(2,2); 
        test(a);
        
    }
    
}
