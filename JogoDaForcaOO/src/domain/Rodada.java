/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ClienteAOC
 */
public class Rodada {
    private BancoDePalavras bp = new BancoDePalavras();
    private Jogador []jogador;
    private int numeroDeJogadores;    
    
    public Rodada(int numeroDeJogadores){
        this.numeroDeJogadores = numeroDeJogadores;
        jogador = new Jogador[this.numeroDeJogadores];
    }
    
    public Collection getTemas(){
        Random random = new Random();        
        int numeroDePalavras = random.nextInt(2);
        
        Collection temas = new ArrayList();
        temas = this.bp.getPalavra().keySet();
        
        return temas;
    }
    
    public Collection getPalavras(Collection temas){        
        Iterator it = temas.iterator();
        Collection palavras = new ArrayList();
        
        while(it.hasNext())    
            palavras.add(bp.getPalavra().get(it.next()));
        
        return palavras;
    }
    
    public boolean checkAcerto(Iterator itPalavras, String tentativa){
        boolean checkAcerto = false;                
                while(itPalavras.hasNext()){
                    for(int j = 0; j < itPalavras.next().toString().length(); j++){
                        if(tentativa.equals(itPalavras.next().toString().charAt(j)))
                            checkAcerto = true;
                    }
                }
        return checkAcerto;
    }
    
    public void partida(){
        Collection temas = getTemas();
        Collection palavras = getPalavras(temas);
        Iterator itTemas = temas.iterator();
        Iterator itPalavras = palavras.iterator();
        int qtdJogadoreSemTentativas = 0;
        
        for(int i = 0; i < this.numeroDeJogadores; i++){
            jogador[i] = new Jogador(JOptionPane.showInputDialog("Jogador " + i + "digite seu nick"));
        }
        
        while(true){    
            if(qtdJogadoreSemTentativas == this.numeroDeJogadores){
                JOptionPane.showMessageDialog(null, "Evereybody lose");
                break;
            }
            for(int i = 0; i < this.numeroDeJogadores; i++){
                String tentativa = JOptionPane.showInputDialog("Digite uma letra");
                if(!checkAcerto(itPalavras, tentativa))
                    jogador[i].perdeuUmaTentativa();
                
                if(jogador[i].getTentativas() == 0)
                    qtdJogadoreSemTentativas++;
            }
        }
    }
    
    
    
    
}
