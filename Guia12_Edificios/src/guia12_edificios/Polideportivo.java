/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_edificios;

/**
 *
 * @author JAZMIN
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private boolean techado = true;//true = a techado , false seria abierto.

    Polideportivo(double ancho, double alto, double largo, String nombre, boolean techado) {
    this.ancho = ancho;
    this.alto = alto;
    this.largo = largo;
    this.nombre = nombre;
    this.techado = techado;

     calcularSuperficie(ancho, alto);
    calcularVolumen(ancho, alto, largo);
    }
    
//getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
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
