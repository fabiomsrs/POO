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
public class Fibonacci {
    
    
    public String getFibonacci(int t1 , int t2){       
        String message = t1 + " " + t2;
        System.out.print("teste");
        if(t2 > 8){
            return message;
        }    
        else{
            t2 += t1;
            t1 = t2 - t1;
            message += t2; 
            getFibonacci(t1,t2) ;
        }
        return message;
    }
}
