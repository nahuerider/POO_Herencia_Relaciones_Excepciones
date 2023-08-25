/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_barajaespañola;

/**
 *
 * @author JAZMIN
 */
public class CartaBasura {
    public enum Palo {
        Espada, Oro, Basto, Copa;
    }

    private int numero;
    private Palo palo;

    public CartaBasura(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public void imprimir(){
        System.out.println(numero +" "+ palo.toString());
    }
    
    public Palo retornarPalo(){
    
        return palo;
    }
}
