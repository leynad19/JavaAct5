/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author danyg
 */
public class Suma extends Operacion{
    
    double suma;
    
    public Suma(double n1, double n2){
        
        super(n1, n2,'+');
        this.suma = n1 + n2;
        this.setRes(this.suma);
    }

    
}
