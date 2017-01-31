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
public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calculaArea() {
        return this.base * this.altura;
    }
    
}
