/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ClienteAOC
 */
public class domain extends Estacionamento {
    
    public static void quest1(){
        double[] notas = new double[5];
        double media = 0;
        String message = "";
        for(int i = 0; i < 5; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite nota " + i));
        }
        
        Arrays.sort(notas);
        
        for(int i = 4 ; i >= 0 ; i--){
            message += notas[i] + " ";
            media += notas[i];
        }
        
        JOptionPane.showMessageDialog(null,"Notas = " + message + "\nMedia = " + media/5);
                
    }
    
    public static void quest2(){
        String[] mes = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        
        Random rand = new Random();
        
        int indice = rand.nextInt(11);
        
        JOptionPane.showMessageDialog(null, mes[indice]);
        
    }
    
    public static void quest3(){
        int[][] matriz = new int[40][40];
        String message = "";
        Random rand = new Random();
        
        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 40; j++){
                matriz[i][j] = rand.nextInt(255);
                message += matriz[i][j] + " , ";
            }
            message += "\n";            
        }
        
        JOptionPane.showMessageDialog(null, message);
    }
    public static void quest4(){
        int[] par = new int[10];
        int[] impar = new int[10];
        int indicePar = 0;
        int indiceImpar = 0;
        String messagePar = "";
        String messageImpar = "";
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++){
            int num = rand.nextInt(19) + 1;
            
            if(num % 2 == 0){
                par[indicePar] = num;
                indicePar += 1;
            }
            else{
                impar[indiceImpar] = num;
                indiceImpar += 1;
            }
        }
        
        for(int i = 0; par[i] != 0 ; i++){
            messagePar += par[i] + " ";
        }
        for(int i = 0; impar[i] != 0 ; i++){
            messageImpar += impar[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Pares: "+messagePar+ "\nImpares: "+messageImpar);        
    }
    public static void quest5() {
        String menu;
        String[] placa = new String[10];
        int num;
        do {
            menu = JOptionPane.showInputDialog("1-Entrada, 2-Saida, 3-Listar, 4-Encerrar Programa");
            switch (menu) {
                case "1":
                    num = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da vaga 0-9"));
                    placa[num] = JOptionPane.showInputDialog("Digite o numero da placa");
                    JOptionPane.showMessageDialog(null, "Vaga " + num + " preenchida");
                    break;
                case "2":
                    num = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da vaga 0-9"));
                    if (placa[num] == null) {
                        JOptionPane.showMessageDialog(null, "Vaga ja se encontra vazia");
                    } else {
                        placa[num] = null;
                        JOptionPane.showMessageDialog(null, "Vaga liberada");
                    }
                    break;
                case "3":
                    String message = "";
                    for (int i = 0; i < 10; i++) {
                        if (placa[i] == null) {
                            message += "Vaga " + i + ": " + "Vazio";
                        } else {
                            message += "Vaga " + i + ": " + placa[i];
                        }
                        message += "\n";
                    }
                    JOptionPane.showMessageDialog(null, message);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "BYE");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Numero invalido");
                    break;
            }
        } while (!"4".equals(menu));
    }
}
