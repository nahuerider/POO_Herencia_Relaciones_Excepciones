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
public class Lavadora extends Electrodoméstico {
    
    //atributos
    private int carga;

    public int getCarga() {
        return carga;
    }

    @Override
    public double obtenerPrecioFinal() {
        double plus = super.obtenerPrecioFinal();
        
        if(carga > 30){
            plus += 500;
        }
        return plus;
    }

   
    
    
    
    //full constructor
    public Lavadora(String color, char consumoEnergetico, double precio, double peso, int carga) {
        super(color, consumoEnergetico, precio, peso);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    
    
    
     
     
    }


    
    
