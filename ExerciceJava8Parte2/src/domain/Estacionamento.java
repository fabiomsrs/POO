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
public class Estacionamento {
    
        Veiculo[] v = new Veiculo[10];
        Veiculo[] vaga = new Veiculo[10];
        int contVeiculo = 0;       
                
        
        public void getEntrada(Veiculo v){
            this.v[contVeiculo] = v; 
            contVeiculo += 1;
                for(int i = 0; i < 10; i++){                        
                    if(vaga[i] == null){
                        this.v[i].numVaga = i;
                        vaga[i] = this.v[i];
                        break;
                    }                        
                }
        }
        
        public void getSaida(){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da vaga 0-9"));
            vaga[num] = null;
            System.out.println("Vaga " + num + "liberada"); 
        }
        
        public String getListarVagas(){
            String message = "";
                for (int i = 0; i < 10; i++) {
                    if (vaga[i] == null) {
                        message += "Vaga " + i + ": " + "Vazio";
                    } else {
                        message += "Vaga " + i + ": " + vaga[i].placa;
                    }
                    message += "\n";
                }
                return message;
        }
    
    }
    

