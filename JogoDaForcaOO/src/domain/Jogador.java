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
public class Jogador {
    private String nick;
    private int pontos = 0;
    private int tentativas = 6;
    
    public Jogador(String nick){
        this.nick = nick;
    }
    public String getNick(){
        return this.nick;
    }
    public void addPontos(int qtd){
        this.pontos += qtd;
    }
    public void perdeuUmaTentativa(){
        tentativas--;
    }
    public int getTentativas(){
        return this.tentativas;
    }
}
