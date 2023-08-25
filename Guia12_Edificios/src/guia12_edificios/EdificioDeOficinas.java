/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_edificios;

import java.util.Scanner;
import guia12_edificios.Edificio;
/**
 *
 * @author JAZMIN
 */
public class EdificioDeOficinas extends Edificio {

    private double cantOficinas;
    private double cantPersonasxOficinas;
    private double cantPisos; 
    
    
    //metodo 
    public void cantPersonas(){
    
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de oficinas del Edificio: ");
        cantOficinas = teclado.nextDouble();
        
        System.out.println("Ingrese la cantiad de Personas por Oficinas: ");
        cantPersonasxOficinas = teclado.nextDouble();
        
        System.out.println("por ultimo, la cantidad de pisos en el edificio: ");
        cantPisos = teclado.nextDouble(); 
        
        System.out.println("\n El ancho del Edificio ");
          ancho = teclado.nextDouble();

        System.out.println("El alto del Polideportivo");
            alto = teclado.nextDouble();

        System.out.println("El largo del Polideportivo");
           largo = teclado.nextDouble();
    
     calcularSuperficie(ancho, alto);
     calcularVolumen(ancho, alto, largo);
    }
    
    
    //getter and setter 

    public double getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(double cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public double getCantPersonasxOficinas() {
        return cantPersonasxOficinas;
    }

    public void setCantPersonasxOficinas(double cantPersonasxOficinas) {
        this.cantPersonasxOficinas = cantPersonasxOficinas;
    }

    public double getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(double cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    
    
    
    
}
