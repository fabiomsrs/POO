/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author ClienteAOC
 */
public class TestaPerfomance {
    public static void main(String[] args) {
    System.out.println("Iniciando...");
    Collection<Integer> teste = new ArrayList<>();
    long inicio = System.currentTimeMillis();
    
    int total = 30000;
    
    for (int i = 0; i < total; i++) {
      teste.add(i);
    }
    
    for (int i = 0; i < total; i++) {
      teste.contains(i);
    }
    
        
    long fim = System.currentTimeMillis();
    long tempo = fim - inicio;
    System.out.println("Tempo gasto: " + tempo);
  }
    
}
