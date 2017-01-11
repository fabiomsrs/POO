/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Estacionamento{
        private static Estacionamento instancia;
        static int contVeiculo = 0;        
        Veiculo[] v = new Veiculo[10];
        Veiculo[] vaga = new Veiculo[10];
                   
        private Estacionamento(){
           
        }
        
        public static Estacionamento instancia(Estacionamento e){
            if(Estacionamento.instancia == null){
                Estacionamento.instancia = new Estacionamento();
                return Estacionamento.instancia; 
            }
           return Estacionamento.instancia;
        }
       
        public void getEntrada(){
            Veiculo proto = setVeiculo();
            this.v[contVeiculo] = proto; 
            contVeiculo += 1;
                for(int i = 0; i < 10; i++){                        
                    if(vaga[i] == null){                        
                        vaga[i] = this.v[i];
                        break;
                    }                        
                }
        }
        public Veiculo setVeiculo(){
            String m = JOptionPane.showInputDialog("Digite o modelo do veiculo");
            String p = JOptionPane.showInputDialog("Digite o numero da placa");
          
            for(int i = 0;i < contVeiculo; i++){
                if(vaga[contVeiculo].getPlaca() == p){
                    JOptionPane.showMessageDialog(null, "Erro!!!  Esse veiculo ja consta no sistema");
                    return null;
                }
            }
            Veiculo v = new Veiculo(p,m);
            return v;
        }
        public void getSaida(){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da vaga 0-9"));
            if(vaga[num] == null)
                JOptionPane.showMessageDialog(null,"Este carro nao consta no estacionamento");
            else{
                vaga[num] = null;
                JOptionPane.showMessageDialog(null,"Vaga" + num + "liberada");            
            }
        }
        
        public String getListarVagas(){
            String message = "";
                for (int i = 0; i < 10; i++) {
                    if (vaga[i] == null) {
                        message += "Vaga " + i + ": " + "Vazio";
                    } else {
                        message += "Vaga " + i + ": " + vaga[i].getPlaca();
                    }
                    message += "\n";
                }
                return message;
        }
    
    }
    

