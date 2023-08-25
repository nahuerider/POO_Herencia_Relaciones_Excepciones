/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.AtributosMascota;
import Entidades.AtributosPersonas;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class servicios {
    
    /**
     * creamos el scanner y la lista array
     */
    private Scanner leer;
    private List<AtributosPersonas> listaPersonas;
        //creamos la lista de mascotas:
    private    List<AtributosMascota>listamascotasParaAdoptar = new ArrayList();
    private    List<AtributosMascota>listamascotas = new ArrayList();    
    /*
    no entendi bien porque, pero en esta pagina se inicia y se declara la lista
    aparentemente si no se declara el constructor, no funciona la lista.
    */
    
    public servicios(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPersonas = new ArrayList();
        this.listamascotas = new ArrayList();
        this.listamascotasParaAdoptar = new ArrayList();
    }
 
    
       public AtributosPersonas crearPersona(){
    
        System.out.println("Introducir el nombre de la persona");
        String nombre = leer.next();
        
        System.out.println("Introducir apellido");
        String apellido = leer.next();
        
        System.out.println("Introducir la edad");
        int edad = leer.nextInt();
        
        System.out.println("Introducir el dni - sin puntos o separaciones -");
        int dni = leer.nextInt();
     
        System.out.println("carga completa!");
        
        //aca esta el problema, tengo en cada persona, agregado a la lista de mascotas, cuando en realidad 
        //tendria que tener una lista de mascotas general y dps una lista de mascotas para cada persona
        //es algo que se puede arreglar pero en este momento no es 100% necesario. 
        //ya con todo lo que hice, me complique deamsiado y me estoy adelantando mucho a lo que me pide la
        // consigna, con lo que pide la consinga, lo que guarde en el block de ntoas ya esta.
        //mi idea es buenisima, pero es mucho para el momento de cursada que estoy haciendo.
        AtributosPersonas m = new AtributosPersonas(nombre,apellido,edad,dni,listamascotas);
        
        
        listaPersonas.add(m);
        
        return m;
       }
        
        
         public void mostrarListadePersonas(){
    
        System.out.println("Las Personas actuales de la Lista con posibilidad de adoptar son : ");
        /**
         * el FOR cumple la funciona de recorrer toda la lista e imprimirla
         */
        for (AtributosPersonas aux : listaPersonas){
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = "+ listaPersonas.size());
    }

         
       public AtributosMascota crearMascota(){
    
        System.out.println("Introducir el nombre de la mascota");
        String nombre = leer.next();
        
        System.out.println("Introducir la raza");
        String raza = leer.next();
        
        System.out.println("Introducir la edad");
        int edad = leer.nextInt();
        
        System.out.println("Introducir el tamaño: pequeño - mediano - grande - muy grande");
        String tamaño = leer.next();
     
        System.out.println("carga completa!");
        
        AtributosMascota m1 = new AtributosMascota(nombre,raza,edad,tamaño);
        
        listamascotasParaAdoptar.add(m1);
        
        return m1;
       }  

         
       public void mostrarListadeMacotas(){
    
        System.out.println("Las Mascotas actuales de la Lista con posibilidad de adoptar son : ");
        /**
         * el FOR cumple la funciona de recorrer toda la lista e imprimirla
         */
        for (AtributosMascota aux : listamascotasParaAdoptar){
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = "+ listamascotasParaAdoptar.size());
    }
 
       public void buscaryAdoptar (String search, String search2){
    
         
        for (int j =0; j < listaPersonas.size(); j++){
           AtributosPersonas m2 = listaPersonas.get(j);// este M va tomar los nombres segun el indice
             if(m2.getApellido().equals(search2)){
             System.out.println("el apellido ingresado es: "+search2 + " .Estos son los datos completos:  \n" + m2.toString() );
        
             for (int i =0; i < listamascotasParaAdoptar.size(); i++){
                AtributosMascota m = listamascotasParaAdoptar.get(i);// este M va tomar los nombres segun el indice
                    if(m.getNombre().equals(search)){
                         System.out.println("la mascota  que solicito es: "+search+ " .Esta disponible y sera registrado bajo su nombre \n" + m.toString() );
                listamascotas.add(m);
              System.out.println("\n Felicidades "+search2+" se ha agregado :"+search +" como su nueva mascota!");
            } 
        
        }               
                               
            } 
        }
    }
         
        
    } 


