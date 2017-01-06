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
    public int t1 = 1;
    public int t2 = 1;
    public String message = t1 + " " + t2 + " ";
    
    public void getFibonacci(int t1 , int t2, String message){       

        if(t2 > 5){
            System.out.println(message);
        }    
        else{
            t2 += t1;
            t1 = t2 - t1;
            message += t2 + " "; 
            getFibonacci(t1,t2,message) ;
        }
    }
    
  
}
