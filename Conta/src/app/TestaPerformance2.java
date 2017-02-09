/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ClienteAOC
 */
public class TestaPerformance2 {
    
    public static void main(String[] args) {
      System.out.println("Iniciando...");
      long inicio = System.currentTimeMillis();

      // trocar depois por ArrayList        
      List<Integer> teste = new ArrayList<>();

      for (int i = 0; i < 30000; i++) {
        teste.add(0, i);
      }

      long fim = System.currentTimeMillis();
      double tempo = (fim - inicio) / 1000.0;
      System.out.println("Tempo gasto: " + tempo);
    }

}
