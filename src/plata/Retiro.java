/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plata;

/**
 *
 * @author Gabriel
 */
public class Retiro extends Plata {
    
   @Override
    public void Operacion(){
        plata = plata - retiro;
    }
    
}
