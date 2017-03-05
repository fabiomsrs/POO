/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author ClienteAOC
 */
public class Disciplina {    
    private String nome;
    private Teste teste;
    private List<String> materias = new ArrayList<>();
    private List<Questao> questoes = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;        
    }
    public void setTeste(int numeroQuestoes){
        this.teste = new Teste();
        teste.setNumeroQuestoes(numeroQuestoes);
    }
    public void cadastrarQuestao(int bimestre, String materia, char gabarito){
        if(materias.contains(materia)){
            Questao questao = new Questao(bimestre,materia,gabarito);
            questoes.add(questao);
        }
        else{
            JOptionPane.showMessageDialog(null,"Disciplina nao contem essa matecia");
        }
    }
    
   
    
}
