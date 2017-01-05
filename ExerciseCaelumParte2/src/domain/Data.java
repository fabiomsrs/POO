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
public class Data {
    public int dia;
    public int mes;
    public int ano;
    
    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
