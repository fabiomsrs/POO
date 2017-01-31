/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author ClienteAOC
 */
public class Quadrado implements AreaCalculavel {
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    public double calculaArea() {
        return this.lado * this.lado;
    }
    
}
