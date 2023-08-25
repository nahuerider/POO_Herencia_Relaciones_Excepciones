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
public class Edificio {

    //atributos 
    protected double ancho;
    protected double alto;
    protected double largo;
    protected double superficie;
    protected double volumen;
    
    //metodos:
    
  protected void calcularSuperficie(double ancho,double alto){
    
        superficie = ancho * alto;
        
    }    
    
    protected void calcularVolumen(double ancho,double alto, double largo){
    
        volumen = ancho * alto* largo;
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
