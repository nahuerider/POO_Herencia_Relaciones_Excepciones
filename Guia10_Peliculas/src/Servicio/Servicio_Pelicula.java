/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidades.Atributos_Peliculas;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Servicio_Pelicula {
    
    /**
     * creamos el scanner y la lista array
     */
    private Scanner leer;
    private List<Atributos_Peliculas> listadePeliculas;
 
    /*
    no entendi bien porque, pero en esta pagina se inicia y se declara la lista
    aparentemente si no se declara el constructor, no funciona la lista.
    */
    
    public Servicio_Pelicula (){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listadePeliculas = new ArrayList();
    }
 
    public Atributos_Peliculas crearPelicula(){
    
        System.out.println("Introducir el titulo de la pelicula");
        String titulo = leer.next();
        
        System.out.println("Introducir el nombre del director de esta pelicula");
        String director = leer.next();
        
        System.out.println("Introducir la duracion en horas de la pelicula, se puede usar la ',' para marcar 1,30 por ejemplo ");
        Double duracion = leer.nextDouble();
        
        Atributos_Peliculas m = new Atributos_Peliculas(titulo,director,duracion);
        
        listadePeliculas.add(m);
        
        return m;
    } 
 
    
  public void mostrarListadePeliculas(){
    
        System.out.println("Las peliculas actuales de la Lista : ");
        /**
         * el FOR cumple la funciona de recorrer toda la lista e imprimirla
         */
        for (Atributos_Peliculas aux : listadePeliculas){
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = "+ listadePeliculas.size());
    }

  public void mostrarPeliculasmayoresa1(){
    
        System.out.println("Las peliculas actuales de la Lista que duran mas de una hora es : ");
        /**
         * el FOR cumple la funciona de recorrer toda la lista e imprimirla
         */
       
         for (int i =0; i < listadePeliculas.size(); i++){
       Atributos_Peliculas m = listadePeliculas.get(i);// este M va tomar los nombres segun el indice
       if(m.getDuracion() > 1  ){
           
           System.out.println(m);
       }
    }
  }
  
  
   public void listaDesPorDuracion(){
  
  //primero invocamos a colletions.sorty le pasamos unestra lista y nuestra nuestros compradores que creamos
    Collections.sort(listadePeliculas,Comparadores.ordenarPorNombre);
    for (Atributos_Peliculas aux  :listadePeliculas){
        System.out.println(aux);
    }
  
  }
  
  
  
  
  
  
  
  public void listadesPorTitulo(){
  
  //primero invocamos a colletions.sorty le pasamos unestra lista y nuestra nuestros compradores que creamos
    Collections.sort(listadePeliculas,Comparadores.ordenarPorNombre);
    for (Atributos_Peliculas aux  :listadePeliculas){
        System.out.println(aux);
    }
  
  }
  
  
  
  
  
  
 }//llave principal - no borrar -
    
    
    
    
    
    
    
    
    
    

