/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import domain.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ClienteAOC
 */
public class appJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rodada test = new Rodada(2);
        BancoDePalavras bp = new BancoDePalavras();
        bp.setPalavra("aa", "bbb");
        bp.setPalavra("cc", "ddd");
        bp.setPalavra("ee", "fff");
        Collection a = test.getTemas();
        Iterator i = a.iterator();
        System.out.println(i.next().toString());
    }
    
}
