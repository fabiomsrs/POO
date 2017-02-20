/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        /**
 *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
 * @author fabiano                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
 */
public class Tarefa implements Comparable<Tarefa>{
    private int prioridade;
    private String nome;
    private String detalhamento;
    private Data dataLimite;
    private int percentual;
    private List<Item> itens= new ArrayList<>();
    
    public Tarefa(int prioridade,String nome,String detalhamento){
        this.prioridade = prioridade;        
        this.nome = nome;
        this.detalhamento = detalhamento;
    }
    public Tarefa(int prioridade,String nome,Data data){
        this.prioridade = prioridade;
        this.nome = nome;
        this.dataLimite = data;
    } 
    public void setItem(int percentual, String nome){
        Item item = new Item(percentual, nome);
        itens.add(item);
    }

    @Override
    public int compareTo(Tarefa o) {
        
        if(this.prioridade < o.prioridade)
            return -1;
        else if(this.prioridade > o.prioridade)
            return 1;
        
        return 0;
    }
    
    
}
