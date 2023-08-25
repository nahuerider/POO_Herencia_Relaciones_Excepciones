/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_animales.entidades;

/**
 *
 * @author JAZMIN
 */
public abstract class animales {
    
    protected String nombre ;
    String alimento ;
    protected Integer edad ;
    protected String raza ; 

    //constructor :
    public animales(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public void prepararseParaComer(){
        
        System.out.println("-se coloca el plato: ");
    }
    
    //estructura abstracta para alimentar a los animales:
    public abstract void alimentarse();

  
    
    
}
