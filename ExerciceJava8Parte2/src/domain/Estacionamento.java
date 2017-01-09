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
        static int contVeiculo = 0;
        static int contInstacia = 0;
        Veiculo[] v = new Veiculo[10];
        Veiculo[] vaga = new Veiculo[10];
                   
        private Estacionamento(){
           
        }
        
        public static void instancia(Estacionamento e){
            if(Estacionamento.contInstacia == 0){
                e = new Estacionamento();
                Estacionamento.contInstacia +=1; 
                e.menu();
            }
            else{
                JOptionPane.showMessageDialog(null, "Estacionamento ja existe");
            }
        }
        private void menu(){
            JOptionPane.showMessageDialog(null, "Estacionamento inicializado com sucesso");            
            int num = 0;
            while(num != 4){
                num = Integer.parseInt(JOptionPane.showInputDialog("1-Entrada\n 2-Saida\n3-Listar situacao atual\n4-Fim do Programa"));
                switch(num){
                    case 1:
                        this.getEntrada();
                        break;
                    case 2:
                        this.getSaida();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,this.getListarVagas());
                    case 4:
                        JOptionPane.showMessageDialog(null,"BYE");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Numero Invalido");
                        break;
                }
            }
        }
        private void getEntrada(){
            Veiculo proto = setVeiculo();
            this.v[contVeiculo] = proto; 
            contVeiculo += 1;
                for(int i = 0; i < 10; i++){                        
                    if(vaga[i] == null){
                        this.v[i].numVaga = i;
                        vaga[i] = this.v[i];
                        break;
                    }                        
                }
        }
        public Veiculo setVeiculo(){
            String m = JOptionPane.showInputDialog("Digite o modelo do veiculo");
            String p = JOptionPane.showInputDialog("Digite o numero da placa");
            int numVaga = 0;
            for(int i = 0;i < contVeiculo; i++){
                if(vaga[contVeiculo].placa == p){
                    JOptionPane.showMessageDialog(null, "Erro!!!  Esse veiculo ja consta no sistema");
                    return null;
                }
            }
            Veiculo v = new Veiculo(p,m,numVaga);
            return v;
        }
        private void getSaida(){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da vaga 0-9"));
            if(vaga[num] == null)
                JOptionPane.showMessageDialog(null,"Este carro nao consta no estacionamento");
            else{
                vaga[num] = null;
                JOptionPane.showMessageDialog(null,"Vaga" + num + "liberada");            
            }
        }
        
        private String getListarVagas(){
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
    

