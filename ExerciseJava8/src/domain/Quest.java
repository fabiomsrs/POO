/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ClienteAOC
 */
public class Quest{
    public static void quest1() throws IOException{
        System.out.println("Digite um valor");
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        double valor = Double.parseDouble(a.readLine());
        System.out.println("Digite a porcetagem em desconto");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        double desconto = Double.parseDouble(b.readLine());
        
        double valorDesconto = (double)valor * desconto/100;
        
        System.out.println("Valor desconto "+valorDesconto+" Valor produto com desconto "+(valor - valorDesconto));
    }
    public static void quest2() throws IOException{
        System.out.println("Digite a pontuacao do lider");
        Scanner input = new Scanner(System.in);
        int lider = input.nextInt();
        System.out.println("Digite a pontuação do lanterna");        
        int lanterna = input.nextInt();
        
        System.out.println(calculaPonto(lider,lanterna));
        
        
    }
    public static double calculaPonto(int lider, int lanterna){
            return (lider - lanterna) / 3;
    }
    public static void quest3(){
        String valorTransacao = JOptionPane.showInputDialog("Digite o valor da transacao");
        double auxVT = Double.parseDouble(valorTransacao);
        String valorVenal = JOptionPane.showInputDialog("Digite o valor venal");
        double auxVV = Double.parseDouble(valorVenal);
        String percentualImposto = JOptionPane.showInputDialog("Digite valor percentual de imposto");
        int auxPI = Integer.parseInt(percentualImposto);
        JOptionPane.showMessageDialog(null, "Valor do imposto = "+valorImposto(auxVT, auxVV, auxPI));
    }
    
    public static double valorImposto(double valorTransacao, double valorVenal, double percentualImposto){
        
        if (valorTransacao > valorVenal){
            return valorTransacao * percentualImposto / 100;
        }
        return valorVenal * percentualImposto / 100;
    }
    public static void quest4(){
        String nota1 = JOptionPane.showInputDialog("Digite a primeira nota");
        double auxn1 = Double.parseDouble(nota1);
        String nota2 = JOptionPane.showInputDialog("Digite segunda nota");
        double auxn2 = Double.parseDouble(nota2);
        String notaT = JOptionPane.showInputDialog("Digite a nota do trabalho");
        double auxT = Integer.parseInt(notaT);
        JOptionPane.showMessageDialog(null, resultado(auxn1, auxn2, auxT));
    }
    
    public static String resultado(double auxn1, double auxn2, double auxnT){
        double media = (auxn1 + auxn2 + auxnT) / 3;
        
        if (media >= 6){
            return "Aprovado";
        }
        
        return "Reprovado";
    }
    
    public static void quest5(){
        String idade = JOptionPane.showInputDialog("Digita sua idade");
        int auxI = Integer.parseInt(idade);
        String sexo = JOptionPane.showInputDialog("Digite sexo \"m\"(masculino) \"f\"(feminino)");
        char auxS = sexo.charAt(0);
        String anosContribuicao = JOptionPane.showInputDialog("Digite a quantidade de anos de contribuicao");
        int auxAC = Integer.parseInt(anosContribuicao);
        JOptionPane.showMessageDialog(null, aposentadoria(auxI, auxS, auxAC));
        
    }
    
    public static String aposentadoria(int idade ,char sexo ,int anosContribuicao){
        
        if((sexo == 'm' && (idade == 65 || anosContribuicao ==  35)) || (sexo == 'f' && (idade == 60 || anosContribuicao == 30))){
            return "Voce ja tem o direito a aposentadoria";
        }
        else{
            if(sexo == 'm'){
                return "Falta "+(35 - anosContribuicao)+" ano(s) de contribuicao para aposentadoria";
            }
            return "Falta "+(30 - anosContribuicao)+" ano(s) de contribuicao para aposentadoria";
        }
    }
}
