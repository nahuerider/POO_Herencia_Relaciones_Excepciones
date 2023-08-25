/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_jugandoruletarusa;

/**
 *
 * @author JAZMIN
 */
public class Jugador {

    //Atributos
    private int id;
    private String nombre;
    private boolean vivo; ;//este nos dice si esta vivo o no

    //Contructor
    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;//si es true, significa que eta vivo
    
    }

    //Propiedades
    
    /**
     * El jugador dispara el revolver
     * @param r 
     */
    public void disparar(Revolver r) {

        System.out.println("El " + nombre + " se apunta con la pistola");

        //El jugador se pone el revolver y...
        if (r.disparar()) {
            this.vivo = false; //muere
            System.out.println("El " + nombre + " ha muerto...");
        } else {
            System.out.println("El " + nombre + " se ha librado..."); //No muere
        }

    }

    public boolean isVivo() {
        return vivo;
    }
    
}
