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
public final class Caballo extends animales {
    
     public Caballo(String nombre, String alimento, Integer edad, String raza){
        super( nombre,  alimento,  edad,  raza);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
     
    
    public void alimentarse(){
    
        System.out.println("el caballo "+ this.nombre + " se va a alimentar con "+ alimento);
    }
    
    
}
