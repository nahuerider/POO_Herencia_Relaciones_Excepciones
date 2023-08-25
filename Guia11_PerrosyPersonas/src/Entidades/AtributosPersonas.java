package Entidades;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAZMIN
 */
public class AtributosPersonas {
 
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private List<AtributosMascota>mascotas;

    public AtributosPersonas() {
    }

    public AtributosPersonas(String nombre, String apellido, Integer edad, Integer dni, List<AtributosMascota> mascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascotas = mascotas;
    }

    public AtributosPersonas(String nombre, String apellido, int edad, int dni, String mascotas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public List<AtributosMascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<AtributosMascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "AtributosPersonas{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + "\n, mascotas=" + mascotas + '}';
    }
    
    
    
    
}
