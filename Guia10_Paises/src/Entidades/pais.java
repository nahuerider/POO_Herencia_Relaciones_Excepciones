/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author JAZMIN
 */
public class pais implements Comparable<pais> {

private String nombre;

    public pais() {
    }

    public pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    //hash and equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override //si el objeto se repite el nombre, el boolena dara true y por lo tnato se pomititra.
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final pais other = (pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    //hash and equals END
    
    
    @Override
    public String toString() {
        return "pais{" + "nombre=" + nombre + '}';
    }

    @Override
    public int compareTo(pais t) {
        return this.nombre.compareTo(t.getNombre());
        
    }

    
    
}
