/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ClienteAOC
 */
public class MessageTools {

    public static String getMensagemCript(String conteudo){
        String cript = "";
        for(int i = 0; i < conteudo.length(); i++){
            cript += "_ ";
        }
        return cript;
    }
    
    public static String desencript(String conteudo,String s){
        String aux = "";
        for(int i = 0; i < conteudo.length(); i++){
            if(s.equals(conteudo.charAt(i)))
                aux += s + " ";
            else
                aux += "_ ";
        }
        return aux;
    }
}
