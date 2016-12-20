/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import static java.lang.Math.*;



public class Rectangle {
    
    public int w;
    public int h;
    Point p;
    
    public double area(){
       return w * h;
    }
    
    
    public double perimeter(){
       return w*2 + h*2;
    }
    
    public String Is_in(Rectangle r1){
        if(sqrt(pow(r1.p.x - (p.x + w),2)) <= sqrt(pow(p.x - (p.x + w),2))){
            if(sqrt(pow(r1.p.y - (p.y + h),2)) <= sqrt(pow(p.y - (p.y + h),2))){
                return "Esta contido";
            }
        }
      
        return "Nao esta contido";
    }
    
    public double ampliar(int vezes){
        return this.area() * vezes;
    }
    
    public double reduzir(int vezes){
        return this.area() / vezes;
    }
}   
