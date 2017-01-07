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
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private int contFuncionario = 0;
    
    public Empresa(int quantidadeFuncionario){
        this.empregados = new Funcionario[quantidadeFuncionario];
    }
    
    public void setAdiciona(Funcionario f){     
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
    
    public void getMostraEmpregados(){
        try{
        for(Funcionario f : this.empregados){
            System.out.println("Funcionario: " + f.getNome() + " Salario: " + f.getSalario());
        }
        }catch(NullPointerException e){               
        }
    }
    public void contem(Funcionario f){
        try{
            System.out.println("Funcionaro " + f.getNome() + " confirmado");        
        }catch(NullPointerException e){            
            System.out.println("Nao existe esse funcionario");
        }
          
        
    }

}