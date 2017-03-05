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
class Questao {
    private int bimestre;
    private String materia;   
    private char gabarito;
    
    public Questao(int bimestre, String materia, char gabarito){
        this.bimestre = bimestre;
        this.materia = materia;
        this.gabarito = gabarito;
    }
}
