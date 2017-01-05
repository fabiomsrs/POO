/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFuncionario;

import domain.Fibonacci;

/**
 *
 * @author ClienteAOC
 */
public class AppFibonacci {
    public static void main(String []args){
        int t1 = 1;
        int t2 = 1;
        String fibonacci = getFibonacci(t1 , t2);
        System.out.println(fibonacci);
        /*int t2 = 1;
        Fibonacci f1 = new Fibonacci();
        System.out.print(f1.getFibonacci(t1, t2));*/
        
        
        
    }
    public static String getFibonacci(int t1 , int t2){       
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
