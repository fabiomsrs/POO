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
public class FibonacciArray {
    public int[] t = new int[10];  
    
    public String message = "1 1 ";
    
    public void getFibonacci(int []t, String message,int cont){                    
        if(t[cont - 1] > 5){
            System.out.println(message);
        }    
        else{
            t[cont] = t[cont-1] + t[cont-2];            
            message += t[cont] + " "; 
            getFibonacci(t,message,cont+1);
        }
    }
}
