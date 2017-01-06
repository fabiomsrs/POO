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
public class Empresa {
    public String nome;
    public String cnpj;
    public Funcionario[] empregados = new Funcionario[10];
    private int contFuncionario = 0;
    
    public void adiciona(Funcionario f){     
        try{
        this.empregados[this.contFuncionario] = f;              
        this.contFuncionario += 1;
       
        }catch(IndexOutOfBoundsException e){
            
            Funcionario[] novosEmpregados = new Funcionario[this.contFuncionario + 10];
            for(int i = 0; i < this.empregados.length; i++){
                novosEmpregados[i] = this.empregados[i];
            }            
            this.empregados = novosEmpregados;  
        }
    }   
    
    public void mostraEmpregados(){
        try{
        for(Funcionario f : this.empregados){
            System.out.println("Funcionario: " + f.nome + " Salario: " + f.salario);
        }
        }catch(NullPointerException e){               
        }
    }
    public void contem(Funcionario f){
        try{
            System.out.println("Funcionaro " + f.nome + " confirmado");        
        }catch(NullPointerException e){            
            System.out.println("Nao existe esse funcionario");
        }
          
        
    }

}