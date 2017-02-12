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
class Palavra {
    private String conteudo;
    
    public Palavra(String conteudo){
        this.conteudo = conteudo;
    }
    
    public String getPalavra(){
        return this.conteudo;
    }
}
