/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fabiano
 */
class Item {
    private int porcentualCorrespondente;
    private String descricaoExecucao;
    private Data dataExecucao;
    
    public Item(int porcentual,String descricao){
        this.porcentualCorrespondente = porcentual;
        this.descricaoExecucao = descricao;        
    }
    
    public void setDataExecucao(int dia, int mes, int ano){
        this.dataExecucao = new Data(dia,mes,ano);
    }

    @Override
    public String toString() {
        return "[" +this.porcentualCorrespondente +"%]" +this.descricaoExecucao +"-" +this.dataExecucao;
    }
    
    
}   

