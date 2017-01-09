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
    String modelo;
    String placa;   
    public int numVaga;
    
    public Veiculo(String placa, String modelo, int numVaga){
        this.placa = placa;
        this.modelo = modelo;
        this.numVaga = numVaga;        
    }
}
