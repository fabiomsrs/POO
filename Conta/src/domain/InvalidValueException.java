/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.management.RuntimeErrorException;

/**
 *
 * @author ClienteAOC
 */
public class InvalidValueException extends RuntimeException {

    public InvalidValueException(double valor) {
        super("Valor " + valor + " é invalido");
    }

    
    
}
