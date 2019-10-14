/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plata;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public abstract class Plata {
    
     protected int retiro, deposito;
             
     public static int plata = 5000;
   


   public abstract void Operacion();

   

    public void MostrarPlata(){
        int plata = this.plata;
        
        JOptionPane.showMessageDialog(null, "Tu saldo es: " + plata);
        
        
       // System.out.println(plata);
    }
    
    
}


