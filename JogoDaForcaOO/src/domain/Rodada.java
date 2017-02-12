/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ClienteAOC
 */
public class Rodada {
    private BancoDeDados bp;
    private Jogador []jogador;
    private int numeroDeJogadores;    
    
    
    public Rodada(int numeroDeJogadores, BancoDeDados bp){
        this.numeroDeJogadores = numeroDeJogadores;
        jogador = new Jogador[this.numeroDeJogadores];
        this.bp = bp;
    }
    
    public int sorteioNumeroDePalavras(){
        Random random = new Random();        
        int aux = random.nextInt(bp.getQtdPalavras()) + 1;//corrigir erro
        return aux;
    }
    
    public ArrayList getPalavras(int qtdPalavras){
        Random random = new Random();
        ArrayList<Integer> aux = new ArrayList<>();
        
        while(aux.size() < qtdPalavras){
            int indice = random.nextInt(bp.getQtdPalavras());
            if(!aux.contains(indice))
                aux.add(indice);
            
        }
        return aux;
    }
    
    public boolean checkAcerto(char palavra, char tentativa){
        boolean checkAcerto = false;     
        if(palavra == tentativa){
            checkAcerto = true;
        }
        return checkAcerto;
    }
    
    public String telaDialogo(ArrayList palavra, Set letras){
        String message = "";
        for (Object j : palavra) {
            message += "Tema: "+bp.getTemaPeloIndice((int) j)+": ";
            for(int i = 0; i < bp.getPalavraPeloIndice((int) j).length(); i++){
                String aux = String.valueOf(bp.getPalavraPeloIndice((int) j).charAt(i));
                if(letras.contains(aux.toLowerCase()))
                    message += bp.getPalavraPeloIndice((int) j).charAt(i) + " ";
                else
                    message += "_ ";
                
                if(i == bp.getPalavraPeloIndice((int)j).length() - 1)
                    message +="\n";
            }
        }
        
        return message;
    }
    
    public void partida(){
        Boneco boneco = new Boneco();
        int numeroDePalavras = sorteioNumeroDePalavras();
        ArrayList<Integer> palavras = this.getPalavras(numeroDePalavras);
        Set<String> letrasTentadas = new TreeSet<>();
        int contAcerto;
        int numErro = 0;
        boolean ganhou = true;
        
        for(int i = 0; i < this.numeroDeJogadores; i++){
            String nick = JOptionPane.showInputDialog("Jogador "+(i+1)+" digite seu Nick");
            jogador[i] = new Jogador(nick);
        }
        while(numErro != 6 && ganhou){
            
            for(int i = 0; i < this.numeroDeJogadores; i++){
                contAcerto = 0;                   
                String tentativa = JOptionPane.showInputDialog(null,"Letras tentadas: "+letrasTentadas+"\n\n"+telaDialogo(palavras, letrasTentadas)+"\n\n"+boneco.getPartes()+"\n\nDigite uma letra","Vez: " + "jogador " + jogador[i].getNick(), JOptionPane.QUESTION_MESSAGE);                
                if(!letrasTentadas.add(tentativa)){
                    JOptionPane.showMessageDialog(null, "Letra ja utilizada");
                    continue;
                }
                ganhou = telaDialogo(palavras, letrasTentadas).contains("_");                
                for(int j = 0; j < numeroDePalavras; j++){
                    for(int k = 0; k < bp.getPalavraPeloIndice(palavras.get(j)).length(); k++){
                        if(checkAcerto(bp.getPalavraPeloIndice(palavras.get(j)).charAt(k),tentativa.charAt(0)))
                            contAcerto++;
                    }
                }

                if (contAcerto > 0)
                    JOptionPane.showMessageDialog(null, "Jogador " + (i+1) + " acertou " + contAcerto + " slots");
                else{
                    JOptionPane.showMessageDialog(null, "Erroooow");
                    numErro = boneco.addPartes();
                }
            }            
        }
        if(!ganhou)
                JOptionPane.showMessageDialog(null, "PARABENS GANHOOU");
        else
            JOptionPane.showMessageDialog(null, "Perdeeeeu\n\n"+boneco.getPartes());
    }
    
}
