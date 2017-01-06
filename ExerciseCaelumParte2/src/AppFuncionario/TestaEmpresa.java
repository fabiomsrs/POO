/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFuncionario;

import domain.Empresa;
import domain.Funcionario;

/**
 *
 * @author ClienteAOC
 */
public class TestaEmpresa {
    
    public static void main(String []args){
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();        
        Empresa ep1 = new Empresa();      
        /*ep1.adiciona(f1);
        ep1.adiciona(f2);
        ep1.empregados[0].salario = 10;
        ep1.empregados[1].salario = 2000;
        ep1.empregados[2] = new Funcionario();
        ep1.empregados[2].dataEntrada.dia = 10;
        ep1.empregados[2].dataEntrada.mes = 10;
        ep1.empregados[2].dataEntrada.ano = 10;*/
        
        for(int i = 0; i < 18; i++){
            ep1.adiciona(f2);
        }
        ep1.mostraEmpregados();
        /* questao 6
        for(Funcionario f : ep1.empregados){
        ep1.contem(f);
        }*/
        
        /*questao 5
        for(Funcionario f : ep1.empregados){
            try{
            System.out.println(f.toString());
            }catch(NullPointerException e){                
            }
        }*/
        
        /* questao 4
        ep1.mostraEmpregados();*/
        
        
        /*Empresa empresa = new Empresa();
        Funcionario f = new Funcionario();
        for (int i = 0; i < 5; i++) {
            
            f.salario = 1000 + i * 100;
            empresa.adiciona(f);
        }
        for(int i = 0; i < 5; i++){
        System.out.println(empresa.empregados[i].salario);
        }*/
    }
            
        
}
    

