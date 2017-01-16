/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.swing.JOptionPane;

/**
 *
 * @author ClienteAOC
 */
public class Eleicao {
    private static Eleicao instance;
    String nome;
    String nomeCampus;
    public int qtdCandidato;
    int qtdDocente;
    int qtdTAE;
    int qtdDiscente;
    Candidato []c;
    
    private Eleicao(String nome, String nomeCampus, int qtdCandidato, 
            int qtdDocente, int qtdTAE, int qtdDiscente){
        this.nome = nome;
        this.nomeCampus = nomeCampus;
        this.qtdDiscente = qtdDiscente;
        this.qtdDocente = qtdDocente;
        this.qtdTAE = qtdTAE;
        this.qtdCandidato = qtdCandidato;
        c = new Candidato[qtdCandidato];
    }
    
    public static Eleicao getInstance(){
        if(instance == null){
            String n = JOptionPane.showInputDialog("Nome eleicao");
            String nC = JOptionPane.showInputDialog("Nome do campus");
            int dSC = Integer.parseInt(JOptionPane.showInputDialog("Quantidade corpo discente"));
            int dC = Integer.parseInt(JOptionPane.showInputDialog("Quantidade corpo docente"));
            int TAE = Integer.parseInt(JOptionPane.showInputDialog("Quantidade corpo tec adm"));
            int ca = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de candidatos"));
            instance = new Eleicao(n, nC, ca, dC, TAE, dSC);
        }
        return instance;        
    }
    
    public void setCandidato(){
        String nomeCandidato = JOptionPane.showInputDialog("Digite nome do candidato");
        String numero = JOptionPane.showInputDialog("Digite numero do candidato");        
        
        for(int i = 0; i < this.qtdCandidato; i++){
            if(c[i] == null){               
                if(checarNumeroCandidato(numero)){
                    c[i] = new Candidato(nomeCandidato, numero);
                    setVotacao(c[i]);
                    break;
                }
                else{
                    c[i] = null;
                    JOptionPane.showMessageDialog(null, "Numero de candidato ja existente, por favor recadastre");
                    setCandidato();
                }                    
            }                            
        }
    }        
    public void setVotacao(Candidato candidato){
        String numeroCandidato = candidato.getNumero();
        
        for(int i = 0; i < this.qtdCandidato; i++) {
            if(c[i] != null){
                if(c[i].getNumero().equals(numeroCandidato)){
                    
                    int discente = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de votos do corpo discente"));
                    int docente = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de votos do corpo docente"));
                    int TAE = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de votos do corpo Tecnico administrativo"));
                    if(checarVotacao(discente, docente, TAE))
                        c[i].v = new Votacao(discente, docente, TAE);
                    else
                        JOptionPane.showMessageDialog(null, "Quantidade de votos invalida");
                }
            }
        }
    }
    
    public String resultadoPercentual(Candidato candidato){
        int qtdDiscenteTemp = 0;
        int qtdDocenteTemp = 0;
        int qtdTAETemp = 0;
        
        
        for(int i = 0; i < this.qtdCandidato; i++){
            if(c[i] != null){
                qtdDiscenteTemp += c[i].v.getVotosDiscente();
                qtdDocenteTemp += c[i].v.getVotosDocente();
                qtdTAETemp += c[i].v.getVotosTAE();
                
            }
        }
        
        double segDiscente = (double)candidato.v.getVotosDiscente()/qtdDiscenteTemp * 1/3 * 100;
        double segDocente = (double)candidato.v.getVotosDocente()/qtdDocenteTemp * 1/3 * 100;
        double segTAE = (double)candidato.v.getVotosTAE()/qtdTAETemp * 1/3 * 100;
        
        return "Percentual do candidato " + candidato.getNome() + ": " + "\nSegmento Discente- "
                +segDiscente + "\nSegmento Docente- "+ segDocente + "\nSegmento Tecnico Adm- " + segTAE + "\n\n";
    }
    
    public String resultadoNominal(Candidato candidato){
        return "Quantidade de votos " + candidato.getNome() + " :" + "\nSegmento Discente- "
                +candidato.v.getVotosDiscente() + "\nSegmento Docente- "+ candidato.v.getVotosDocente() + "\nSegmento Tecnico Adm- " + candidato.v.getVotosTAE() + "\n\n";        
    }
    
    public String resultadoGeral(){
        int qtdDiscenteTemp = 0;
        int qtdDocenteTemp = 0;
        int qtdTAETemp = 0;
        int qtdCandidatoTemp = 0;
        String message = "";
        for(int i = 0; i < this.qtdCandidato; i++){
            if(c[i] != null){
                qtdDiscenteTemp += c[i].v.getVotosDiscente();
                qtdDocenteTemp += c[i].v.getVotosDocente();
                qtdTAETemp += c[i].v.getVotosTAE();
                qtdCandidatoTemp++;
            }
        }
        
        for(int j = 0; j < qtdCandidatoTemp; j++){
            double segDiscente = (double)c[j].v.getVotosDiscente()/qtdDiscenteTemp * 1/3 * 100;
            double segDocente = (double)c[j].v.getVotosDocente()/qtdDocenteTemp * 1/3 * 100;
            double segTAE = (double)c[j].v.getVotosTAE()/qtdTAETemp * 1/3 * 100;
        
            message = "Percentual do candidato " + c[j].getNome() + " : " + (segDiscente + segDocente + segTAE) + "\n";
        }
        return message;
    }
    
    public String resultadoFinal(){
        int qtdDiscenteTemp = 0;
        int qtdDocenteTemp = 0;
        int qtdTAETemp = 0;
        int qtdCandidatoTemp = 0;
        double maior = 0;
        String vencedor = "";
        
        for(int i = 0; i < this.qtdCandidato; i++){
            if(c[i] != null){
                qtdDiscenteTemp += c[i].v.getVotosDiscente();
                qtdDocenteTemp += c[i].v.getVotosDocente();
                qtdTAETemp += c[i].v.getVotosTAE();
                qtdCandidatoTemp++;
            }
        }
        
        for(int j = 0; j < qtdCandidatoTemp; j++){
            double segDiscente = (double)c[j].v.getVotosDiscente()/qtdDiscenteTemp * 1/3 * 100;
            double segDocente = (double)c[j].v.getVotosDocente()/qtdDocenteTemp * 1/3 * 100;
            double segTAE = (double)c[j].v.getVotosTAE()/qtdTAETemp * 1/3 * 100;        
            
            if(maior < (segDiscente + segDocente + segTAE)){
                vencedor = "Candidato " + c[j].getNome() + " eleito com " + (segDiscente + segDocente + segTAE) + "% dos votos\n";
                maior = (segDiscente + segDocente + segTAE);
            }
        }
        return vencedor;
    }
    public String getAbstencao(){
        int qtdDiscenteTemp = 0;
        int qtdDocenteTemp = 0;
        int qtdTAETemp = 0;
        
        
        
        for(int i = 0; i < this.qtdCandidato; i++){
            if(c[i] != null){
                qtdDiscenteTemp += c[i].v.getVotosDiscente();
                qtdDocenteTemp += c[i].v.getVotosDocente();
                qtdTAETemp += c[i].v.getVotosTAE();               
            }
        }
        
        return "Abstencao discente: " + ((double)this.qtdDiscente/(qtdDiscenteTemp + this.qtdDiscente) * 1/3 * 100) + 
                "\nAbstencao docente: " + ((double)this.qtdDocente/(qtdDocenteTemp + this.qtdDocente) * 1/3 * 100) + 
                "\nAbstencao Tec adm: " + ((double)this.qtdTAE/(qtdTAETemp + this.qtdTAE) * 1/3 * 100);
    }
    
    public boolean checarVotacao(int discente, int docente, int TAE){
        
        if(discente > this.qtdDiscente || docente > this.qtdDocente || TAE > this.qtdTAE)
            return false;
        
        this.qtdDiscente -= discente;
        this.qtdDocente -= docente;
        this.qtdTAE -= TAE;
        return true;
    }
    
    private boolean checarNumeroCandidato(String numero){
        for(int i = 0; i < this.qtdCandidato; i++){
            if(this.c[i] != null)
                if(this.c[i].getNumero().equals(numero))
                    return false;            
        }
        return true;
    }
    
}
