/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaranimal;

import ico.fes.herenciatarea.Animal;
import ico.fes.herenciatarea.Gato;
import ico.fes.herenciatarea.Perro;

/**
 *
 * @author HP_All_in_One
 */
public class UsarAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal animals = new Animal(4, true, true);
        System.out.println(animals);
        animals.emitirSonido();
        System.out.println();
        
        
        Perro a = new Perro("Bacco", "Husky", 4, true, true, 4, true, true);
        System.out.println(a);
        a.emitirSonido();
        System.out.println();
        
        
        Gato b = new Gato("Pelusa", "Siames", 5, true, false, 4, true, true);
        System.out.println(b);
        b.emitirSonido();   
         System.out.println();
    }
    
}
