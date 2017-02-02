/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forca;


import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author ClienteAOC
 */
public class Forca {
    static int qtdPalavra = 0;
    static int qtdTema = 0;
    static String[] palavras = new String[20];
    static String[] temas = new String[20];    
    
    
    public static void addPalavra(){        
        try{            
            String palavra = JOptionPane.showInputDialog("Digite a palavra");                 
            String tema = JOptionPane.showInputDialog("Digite o tema referente a palavra");                 
            palavras[qtdPalavra] = palavra;
            temas[qtdTema] = tema; 
            qtdPalavra++; 
            qtdTema++;
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"banco de palavras FULL");
        }
    }
    
    public static int sortearTema(){
        Random r = new Random();
        int sorteio = r.nextInt(qtdPalavra);
        return sorteio;
    }
    public static void jogo(){
        int temaDaVez = sortearTema();
        int numAcerto = 0;
        int numErro = 0;
        String letrasTentadas = "";
        String jogo = "";
        String message = "";
        
        for(int i = 0; i < palavras[temaDaVez].length(); i++){
            jogo += "_ ";
        }
       
        while(numAcerto != palavras[temaDaVez].length()){
            int checarAcerto = numAcerto;
            String tentativa= JOptionPane.showInputDialog(null,"Letras usadas: "+ letrasTentadas +"\n"+ message +"\n\nDigite uma letra    " + "\n"+ jogo, "Tema: " + temas[temaDaVez],JOptionPane.QUESTION_MESSAGE);
            if(letrasTentadas.contains(tentativa)){
                if(tentativa.equals("")){
                    JOptionPane.showMessageDialog(null, "Intem invalido");
                }
                JOptionPane.showMessageDialog(null, "Palavra repitida");
                continue;
            }
            else{
                letrasTentadas += tentativa+" ";
                for(int j = 0; j < palavras[temaDaVez].length(); j++){
                    if(palavras[temaDaVez].charAt(j) == tentativa.charAt(0)){
                        numAcerto++;
                        String auxJogo = "";
                        for(int i = 0; i < jogo.length(); i++){

                            if(i == j*2)

                                auxJogo += tentativa;

                            else{
                                auxJogo += jogo.charAt(i);
                            }
                        }
                        jogo = auxJogo;
                    }
                }
            }
            if(checarAcerto == numAcerto){
                JOptionPane.showMessageDialog(null, "Erroooow");
                numErro++;
                if(numErro == 1)
                    message = "\n o";
                else if(numErro == 2)
                    message ="\n o\n/";
                else if(numErro == 3)
                    message ="\n o\n/ |";
                else if(numErro == 4)
                    message = "\n o\n/ | \\";
                else if(numErro == 5)
                    message = "\n o\n/ | \\\n / ";
                else{
                    message = "\n o\n/ | \\\n / \\";
                    break;
                }
                System.out.println(message);
            }else{
                int qtdAcerto = numAcerto - checarAcerto;
                JOptionPane.showMessageDialog(null, "ACERTOU " + qtdAcerto + " LETRA(s)");
            }
            
        }
        if(numErro == 6)
            JOptionPane.showMessageDialog(null, message + "\nIDIOTA, VC PERDEU");
        else
            JOptionPane.showMessageDialog(null, "PARABENS VC GANHOU");
    }
    public static void main(String []args){        
        int menu = 1;
        do{ 
            if(qtdPalavra == 0){  
                JOptionPane.showMessageDialog(null,"Primeiro adicione algumas palavras");
                menu = 2;
            }
            else{
                menu = Integer.parseInt((JOptionPane.showInputDialog("Menu: Jogar-1 | Add Palavras - 2 | Sair - 0")));
            }
            switch(menu){
                case 0:
                    break;
                case 1:
                    jogo();
                    break;
                case 2:                    
                    int qtd = 0;
                    try{
                    qtd = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar quantas palavras?"));
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Erro!! Digite um numero inteiro da proxima vez");
                    }
                    for(int i = 0; i < qtd; i++){
                        addPalavra();
                    }
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
            
        }while(menu != 0);
        
        
        
            
    }
    
}
