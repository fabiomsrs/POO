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
    public String nome;
    public String departamento;
    public Data dataEntrada = new Data();
    public String rg;
    public double salario;
    
    public void numeroDeClientes(int num){
        if(num > 100){
            this.bonus(100);
        }
    }
    
    public double bonus(int bonus){
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
