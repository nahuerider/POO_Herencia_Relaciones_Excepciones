/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_jugandoruletarusa;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Guia11_jugandoRuletaRusa {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("introduzca la cantidad de perosnas que van a jugar a la ruleta rusa");
        System.out.println("el numero maximo es de 6");
        int var1 = leer.nextInt();
        
     Juego juego = new Juego(var1);
        
        while( !juego.finJuego() ){
           // juego.ronda();       //con este modo se completa la ronda, post muerte      
            juego.rondaV2();    //con este el juego termina post muerte, de manera inmediata
        }
        
        System.out.println("El juego ha terminado");
        
    }
    
}
