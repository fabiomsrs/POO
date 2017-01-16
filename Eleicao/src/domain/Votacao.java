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
public class Votacao {
    private int votosDiscente;
    private int votosDocente;
    private int votosTAE;
    
    public Votacao(int votosDiscente, int votosDocente, int votosTAE){
        this.votosDiscente = votosDiscente;
        this.votosDocente = votosDocente;
        this.votosTAE = votosTAE;
    }
    
    public int getVotosDiscente(){
        return this.votosDiscente;
    }
    
    public int getVotosDocente(){
        return this.votosDocente;
    }
    
    public int getVotosTAE(){
        return this.votosTAE;
    }
    
}
    
