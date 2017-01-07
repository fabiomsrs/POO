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
public class Funcionario {
    private String nome;
    private String departamento;
    private Data dataEntrada = new Data();
    private String rg;
    private double salario;
    private static int indentificador = 0;
    
    public static int getIdentificador(){
        return Funcionario.indentificador;
    }
    
    public Funcionario(String nome){
        this.nome = nome;
        Funcionario.indentificador++;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Funcionario(){
        Funcionario.indentificador++;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void setNumeroDeClientes(int num){
        if(num > 100){
            this.setBonus(100);
        }
    }
    
    public double setBonus(int bonus){
        return salario + bonus;
    }
    
    public void setRecebeAumento(double aumento){
        this.salario += aumento;
    }
    
    public double getCalculaGanhoAnual(){
        double anual = salario*12;
        return anual;
    }
    
    public String mostra(){
        //return this.toString();
        return dataEntrada.toString();
    }
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nSalario: " + this.salario + "\nDepartamento: " + this.departamento + "\nRg: " + this.rg;
    }
        
    
    
}
