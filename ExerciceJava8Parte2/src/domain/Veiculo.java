/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author aluno
 */
public class Veiculo {
    private String modelo;
    private String placa;   
    
    
    public Veiculo(String placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
                
    }
    
    public String getPlaca(){
        return this.placa;
    }
    public String getModelo(){
        return this.modelo;
    }
}
