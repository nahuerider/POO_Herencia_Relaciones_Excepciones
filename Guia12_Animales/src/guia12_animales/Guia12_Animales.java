/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_animales;

import guia12_animales.entidades.Caballo;
import guia12_animales.entidades.Gato;
import guia12_animales.entidades.Perro;
import guia12_animales.entidades.animales;

/**
 *
 * @author JAZMIN
 */
public class Guia12_Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion del objeto Perro
        animales perro1 = new Perro("Stich","carnivoro",15,"Doberman") ;
        perro1.alimentarse();
        animales perro2 = new Perro("Teddy","croquetas",10,"Chihuahua");
        perro2.alimentarse();
        animales gato1 = new Gato("Pelusa","Galletas",15,"Siames");
        gato1.alimentarse();
        animales caballo1 = new Caballo("Spark","Pasto",25,"Fino");
        caballo1.alimentarse();
        
    }
    
}
