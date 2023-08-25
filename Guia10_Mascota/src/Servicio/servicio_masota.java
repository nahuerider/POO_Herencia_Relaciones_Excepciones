/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Mascota;

import java.util.Scanner;
import java.util.ArrayList;     
import java.util.List;

/**
 *
 * @author JAZMIN
 */
public class servicio_masota {
    /**
     * creamos el scanner y la lista array
     */
    private Scanner leer;
    private List<Mascota> mascotas;
    
    public servicio_masota (){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    
    
    public Mascota crearMascota(){
    
        System.out.println("Introducir el nombre de la mascota");
        String nombre = leer.next();
        
        System.out.println("Introducir el apodo de la mascota");
        String apodo = leer.next();
        
        System.out.println("Introducir la raza de la mascota");
        String raza = leer.next();
        
        Mascota m = new Mascota(nombre,apodo,raza);
        
        mascotas.add(m);
        
        return m;
    } 
    /**
    public void agregarMascota(){
        mascota.add(m);
    }
    **/
    public void mostrarMascotas(){
    
        System.out.println("Los perros actuales de la Lista de mascotas sin: ");
        /**
         * el FOR cumple la funciona de recorrer toda la lista e imprimirla
         */
        for (Mascota aux : mascotas){
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = "+ mascotas.size());
    }
    
    
    public void fabricaMascota(int cantidad){
    for (int i=0 ; i<cantidad; i++){
        /*Invoco la funcion de crearMascota con una nueva variable*/
        Mascota mascotaCreada = crearMascota();
        /*Muestro la variable creada por pantalla*/
        System.out.println(mascotaCreada.toString());
    }
        
    }
    
    
    public void eliminarMascota (int index){
        
        if(index <= (mascotas.size()-1)){
        
        mascotas.remove(index);
        } else {
            System.out.println("El numero que ingreso , no hay registros. seleciona para eliminar un lugar que este ocupado o cargado con datos de algun perro  "); 
        }
        
        }
    
    
}
