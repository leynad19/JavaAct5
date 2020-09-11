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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1 = 9;
        double n2 = 4;
        
        //Numeros
        System.out.println("El primer numero es "+ n1);
        System.out.println("El segundo numero es "+ n2);
        
        //suma
        Suma sum = new Suma(n1,n2);
        sum.mostrarResultado();
        
        //resta
        Resta res = new Resta(n1,n2);
        res.mostrarResultado();
        
        //multiplicacion
        Multiplicacion mul = new Multiplicacion(n1,n2);
        mul.mostrarResultado();
        
        //division
        Division div = new Division(n1,n2);
        div.mostrarResultado();
        
        Modulo mod = new Modulo(n1,n2);
        mod.mostrarResultado();
    }
    
}
