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
public class Candidato {
    private String nome;
    private String numero;
    private String slogan;
    private String sexo;
    public Votacao v;
    
    public Candidato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public String getNome(){
        return this.nome;
    }
}
