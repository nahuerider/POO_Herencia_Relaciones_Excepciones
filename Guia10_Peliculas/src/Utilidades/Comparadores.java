/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Atributos_Peliculas;// siempre invocar a la pagina de atributos
import java.util.Comparator;//siempre invocar a la biblioteca

/**
 *
 * @author JAZMIN
 */
public class Comparadores {
    //los comparator son una herramienta de java para que compare de manera automatica toda una arraylist,
    // ya que sin esto, se puede hacer metiendo un for adentro de otro for, pero para evitar un codigo largo 
    //JAVA nos proporciona esta erramienta donde lo unico que necesita es que le enviemos el valor PRINCIPAL
    //el cual se va a compara con toos los datos de la lista.
    
    //comparacion por titulo : 
    
    public static Comparator<Atributos_Peliculas> ordenarPorNombre = new Comparator <Atributos_Peliculas>() {
        @Override
        public int compare(Atributos_Peliculas o1, Atributos_Peliculas o2) {
         
            
            return o2.getTitulo().compareTo(o1.getTitulo());
        }
    };
            
     public static Comparator<Atributos_Peliculas> ordenarPorDuracion = new Comparator <Atributos_Peliculas>() {
        @Override
        public int compare(Atributos_Peliculas o1, Atributos_Peliculas o2) {
         
            
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
       
    
    
    
    
}//llave final del main class
