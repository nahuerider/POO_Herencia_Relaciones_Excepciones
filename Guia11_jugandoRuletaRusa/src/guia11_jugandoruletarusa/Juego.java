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

public class Juego {

    //atributos
    private Jugador[] jugadores;
    private Revolver revolver;

    //Constructor
    public Juego(int numJugadores) {

        jugadores = new Jugador[comprobarJugadores(numJugadores)];

        crearJugadores();

        revolver = new Revolver();

    }

    //Comprueba que el numero de jugadores esta en el rango correcto
    private int comprobarJugadores(int numJugadores) {

        //Sino esta en el rango correcto se pone a 6
        if (!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
            System.out.println("A INTRODUCIDO UN NUMERO invalido");
            System.out.println("por ende, el sistema a fijado de manera automaticamente");
            System.out.println("a 6 jugadores");
        }

        return numJugadores;
    }

    //Crea los jugadores
    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }

    //indica si el juego acaba o no
    public boolean finJuego() {
        
        //con este metodo recorro la lista array, si alguno no esta vivo
        //sin este metodo la final de cada ronda, los jugadores podrian a ver recibido
        //el tiro de gracia, pero nunca me enteraria.
        // por ende el for recorre la lsita, y el jugador que tenga el atributo de 
        // MOJADO = false , significa que esta muerto.
        
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                
                return true; //No termina el juego
            }
        }
        return false;//Acabo el juego
    }

    //Realiza una ronda (si muere algun jugador todos participan igualmente)
    public void ronda() {

        for (int i = 0; i < jugadores.length; i++) {
            //El jugador se dispara
            jugadores[i].disparar(revolver);
        }

    }
    
    //Realiza una ronda (si muere algun jugador, los siguientes no participan)
    public void rondaV2() {

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparar(revolver);
            
            //Si muere, terminamos
            if(!jugadores[i].isVivo()){
                return;
            }
        }

    }    
}
