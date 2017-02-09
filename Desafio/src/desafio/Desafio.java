/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ClienteAOC
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<inteiro> test = new TreeSet();
        
        for(int i = 1; i <= 100; i++){
            inteiro a = new inteiro(i);
            test.add(a);
        }
        System.out.println(test);
        
    }
    
    public static class inteiro implements Comparable<inteiro>{
        int i;
        public inteiro(int i) {
            this.i = i;
        }
        public inteiro() {
           
        }
        @Override
        public int compareTo(inteiro o) {            
            if(this.i < o.i)
                return 1;
            else if(this.i > o.i)
                return -1;
            return 0;
        }

        @Override
        public String toString() {
            return ""+i; //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
}
