/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_electrodoméstico.Entidades;

/**
 *
 * @author JAZMIN
 */
public  class Televisor extends Electrodoméstico {
    //atributos propios del televisor:
    private int resolucion;
    private boolean sincronizadorTDT;

    //metodo de precio final:

    @Override
    public double obtenerPrecioFinal() {
     double plus= super.obtenerPrecioFinal();
     
     if(resolucion > 40){
         plus += precio * 0.3;
         //agregamos un porcentaje del 30% por tener mas de 40 pulgadas.
     }
     if(sincronizadorTDT){
         plus += 50;
     }
     
     return plus;
    }
    
    
    
    
    
    //constructor completo.
    public Televisor(String color, char consumoEnergetico, double precio, double peso,int resolucion, boolean sincronizadorTDT) {
        super(color, consumoEnergetico, precio, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT= sincronizadorTDT;
        
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sincronizadorTDT=" + sincronizadorTDT + '}';
    }
    
    
    
    
    
    
}
