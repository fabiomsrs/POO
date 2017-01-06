/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFuncionario;

import domain.Fibonacci;
import domain.FibonacciArray;

/**
 *
 * @author ClienteAOC
 */
public class AppFibonacci {
    public static void main(String []args){

        /*Fibonacci f1 = new Fibonacci();
        f1.getFibonacci(f1.t1, f1.t2, f1.message);*/
        
        /*questão 2 Por que o modo acima é extremamente mais lento para calcular a série do que o modo iterativo (que se usa um laço)?
        Pois o modo acima executa varias instancias de funções, enquanto o laço não
        */
        
        /*questão 3 Não é possivel colocar mais de um statemant em java, então deixa quieto*/
        
        FibonacciArray f1 = new FibonacciArray(); 
        f1.t[0] = 1;
        f1.t[1] = 1;
        f1.getFibonacci(f1.t, f1.message, 2);
    }
  
}
