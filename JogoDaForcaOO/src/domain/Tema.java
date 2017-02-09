/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ClienteAOC
 */
public class BancoDePalavras {
    static private Map<String, String> palavras = new HashMap<>();
    
    public void setPalavra(String nomePalavra, String nomeTema){
        palavras.put(nomeTema, nomePalavra);
    }
    public Map getPalavra(){
        return palavras;
    }
}
