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
public abstract class Conta {
    protected int numero;
    protected double saldo = 0;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }    
    
    public void setNumero(int num){
        this.numero = num;
    }
    public int getNumero() {
        return numero;
    }
    
    public void deposito(double valor)throws InvalidValueException{
        if(valor < 0){
            throw new InvalidValueException(valor);
        }
        else{
            this.saldo += valor;
        }
    }
    public void saque(double valor){
        this.saldo -= valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    
    
    public abstract void atualiza(double taxa);
    
    @Override
    public String toString() {
        return "Saldo: "+ this.getSaldo(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
