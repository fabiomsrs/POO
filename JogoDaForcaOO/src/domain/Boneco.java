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
public class Boneco {
    private String partes = "";
    private int numPartes = 0;
    
    public String getPartes(){
        return partes;
    }
    public int addPartes(){
        this.numPartes++;
        
        if(numPartes == 1)
            this.partes = "\n o";
        else if(numPartes == 2)
            this.partes ="\n o\n/";
        else if(numPartes == 3)
            this.partes ="\n o\n/ |";
        else if(numPartes == 4)
            this.partes = "\n o\n/ | \\";
        else if(numPartes == 5)
            this.partes = "\n o\n/ | \\\n / ";
        else
            this.partes = "\n o\n/ | \\\n / \\";
            
        return this.numPartes;
    }
}
