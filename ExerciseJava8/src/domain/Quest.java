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
    public static void quest6(){
        /*questao 1 capitulo 3*/
        JOptionPane.showMessageDialog(null, desconto(JOptionPane.showInputDialog("Nome do produto"), Double.parseDouble(JOptionPane.showInputDialog("Valor do produto"))));
        
    }
    public static String desconto(String nomeProduto, double valor){
        if (valor >= 50 && valor < 200){
            return "Nome do produto: "+ nomeProduto +"\nValor original do produto: "+valor +"\nValor do produto com desconto: " +(valor -(valor * 5/100));
        }
        else if(valor >= 200 && valor < 500){
            return "Nome do produto: "+ nomeProduto +"\nValor original do produto: "+valor +"\nValor do produto com desconto: " +(valor -(valor * 6/100));
        }
        else if(valor >= 500 && valor < 1000){
            return "Nome do produto: "+ nomeProduto +"\nValor original do produto: "+valor +"\nValor do produto com desconto: " +(valor -(valor * 7/100));
        }        
        else if(valor >= 1000){
            return "Nome do produto: "+ nomeProduto +"\nValor original do produto: "+valor +"\nValor do produto com desconto: " +(valor -(valor * 8/100));
        }        
        else if(valor < 0){
            return "Valor invalido";
        }        
        return "Nome do produto: "+ nomeProduto +"\nValor original do produto: "+valor +"\nValor do produto com desconto: " +valor;
        
    }
    public static void quest7(){
        /*questao 2 capitulo 3*/
        int[] r = new int[4];
        for(int cont = 0; cont < 4; cont++){
            r[cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite resistencia numero " + (cont+1)));
        }
        JOptionPane.showMessageDialog(null,resistencia(r));
    }
    
    public static String resistencia(int r[]){
        int menor = r[0],maior = r[0],rE = r[0];
        
        for(int cont = 1; cont < 4;cont++){
            if (menor > r[cont])
                menor = r[cont];
            if (maior < r[cont])
                maior = r[cont];
            rE += r[cont];
        }
        return "Resistencia Equivalente: "+ rE +"\nA maior resistencia eh: "+ maior +"\nA menor resistencia eh:"+ menor;
    }    

    public static void quest8(){
        
        for(int cont = 3; cont > 0; cont--){
            if(login(JOptionPane.showInputDialog("Login: "),JOptionPane.showInputDialog("Senha: "))){
                JOptionPane.showMessageDialog(null,"Login e senha aceitos");
                break;
            }
            else{
                if(cont - 1 == 0){
                    JOptionPane.showMessageDialog(null,"Tentativas Over");
                    break;
                }                    
                JOptionPane.showMessageDialog(null,"Falha, verifique login e senha\nVoce tem mais "+(cont-1));                
            }
        }
            
    }
    
    public static boolean login(String login, String senha){
        
        return "java8".equals(login) && "java8".equals(senha);
        
    }
    public static void quest9(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Forneca Numero"));
        String aux = "";
        for(int cont = 1; cont < 11; cont++){
            aux += numero + "x" + cont + "=" + (numero*cont)+"\n";                        
        }
        JOptionPane.showMessageDialog(null, aux);
    }
    
    
}
