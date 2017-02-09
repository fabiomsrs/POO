/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ClienteAOC
 */
public class Banco {
    private static int qtdConta = 0;
    private List<Conta> conta = new ArrayList();
    private String nome;
    private Map<String,Conta> mapaContas = new HashMap();
        
    
    public void adicionConta(Conta c, String nome){       
        mapaContas.put(nome, c);
        conta.add(c);
    }
    
    public Conta pegaConta(String nome){
        return this.mapaContas.get(nome);
    }
    public Conta pegaConta(int i){
        return conta.get(i);
    }
    public int pegaTotalDeContas(){
        return conta.size();
    }
    
    
}
