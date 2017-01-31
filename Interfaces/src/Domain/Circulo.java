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
public class Circulo implements AreaCalculavel{
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
   
    @Override
    public double calculaArea() {
        return Math.PI * this.raio * this.raio;
    }
    
}
