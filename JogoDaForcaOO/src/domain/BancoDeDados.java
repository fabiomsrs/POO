/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ClienteAOC
 */
public class BancoDeDados {
    private static List<Tema> tema = new ArrayList<Tema>();
    private static List<Palavra> palavra = new ArrayList<Palavra>();    
    
    public void setTemaEPalavra(String conteudoTema, String conteudoPalavra){
            this.tema.add(new Tema(conteudoTema));
            this.palavra.add(new Palavra(conteudoPalavra));
    }
    
    public String getTemaPeloIndice(int indice){
        return tema.get(indice).getTema();
    }
    
    public String getPalavraPeloIndice(int indice){
        return palavra.get(indice).getPalavra();
    }
    
    public int getQtdTema(){
        
        return tema.size();
    }
    
    public int getQtdPalavras(){
        return palavra.size();
    }
}
