/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Scanner;

/**
 *
 * @author ClienteAOC
 */
public class Quest {
    public static void quest1(){
        System.out.print("Hello World");        
    }
    public static void quest2(){
        System.out.println("Hello");        
        System.out.println("World");        
    }
    public static void quest3(){
        System.out.println("Hello\nWorld");                
    }
    public static void quest4(){
        /*1ª questão capitulo 3 caelum
        Imprima todos os números de 150 a 300.*/
        int number = 150;
        for(;number <= 300;number++){
            System.out.println(number);
        }
    }
    public static void quest5(){
        /*2ª questão capitulo 3 caelum
        Imprima a soma de 1 até 1000.*/
        int number = 1;
        int sum = 0;
        for(;number <= 1000;number++){
            sum += number;
        }
        System.out.println(sum);
    }
    public static void quest6(){
        /*3ª questão capitulo 3 caelum
        Imprima todos os múltiplos de 3, entre 1 e 100.*/
        int number = 1;
        
        for(;number <= 100;number++){
            if(number % 3 == 0)
                System.out.println(number);
        }
    }
    public static void quest7(){
        /*4ª questão capitulo 3 caelum
        Imprima os fatoriais de 1 a 10.*/
        int number = 1;
        
        for(;number <= 10; number++){
            int fatorial = 1;
            
            if(number == 1){
                System.out.println(fatorial);                
            }
            else{
                for(int aux = number;aux > 1;aux--){       
                fatorial *= aux ; 
                }
                System.out.println(fatorial);
            }
        
        }
        
    }
    public static void quest8(){
        /*5ª questão capitulo 3 caelum
        No código do exercício anterior, 
        aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. 
        Em um determinado momento, além desse cálculo demorar, 
        vai começar a mostrar respostas completamente erradas. Por quê?
        Mude de int para long para ver alguma mudança.
        R: O tipo long nao suporta numeros da grandeza de !40*/
        int number = 1;
        
        for(;number <= 40; number++){
            long fatorial = 1;
            
            if(number == 1){
                System.out.println(fatorial);                
            }
            else{
                for(int aux = number;aux > 1;aux--){       
                fatorial *= aux ; 
                }
                System.out.println(fatorial);
            }
        
        }
        
    }
    public static void quest9(){
        /*6ª questão capitulo 3 caelum
        (opcional) Imprima os primeiros números da série de Fibonacci até passar de 100*/
        
        int n1 = 0;
        int n2 = 1;
        int aux;
        System.out.println(n1+"\n"+n2);     
        while(true){
            aux = n2 + n1;
            n1 = n2;
            n2 = aux;
            System.out.println(aux);
            if(aux > 100)
                break;
        }        
    }
    public static void quest10(){
        /*7ª questão capitulo 3 caelum
        opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
        se x é par, x = x / 2
        se x é impar, x = 3 * x + 1
        imprime x
        O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será:40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1*/      
        Scanner input = new Scanner(System.in);  
        System.out.println("Digite um numero x");
        int x = input.nextInt();
        
        while(x != 1){
            if(x % 2 == 0){
                x = x / 2;
                System.out.println(x);                
            }
            else{                
                x = 3 * x + 1;
                System.out.println(x);               
            }
        }
    }
    public static void quest11(){
        /*8ª questão capitulo 3 caelum
        (opcional) Imprima a seguinte tabela, usando fors encadeados: 1 
        2 4 
        3 6 9 
        4 8 12 16 
        n n*2 n*3 .... n*n*/
        Scanner input = new Scanner(System.in);  
        System.out.println("Digite um numero x");
        int x = input.nextInt();
        int aux;
        
        for(aux = 1;aux <= x; aux++){            
            int count = 1;
            for(;count <= aux; count++){                
                System.out.print(aux * count + " ");
            }
            System.out.println("");            
        }
        
        
    }
}
