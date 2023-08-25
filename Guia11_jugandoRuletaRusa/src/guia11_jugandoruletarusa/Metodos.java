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
public class Metodos {
     /**
     * Genera un numero aleatorio entre dos numeros
     * @param minimo
     * @param maximo
     * @return 
     *  //con este metodo el revolver podra generar numero aleatoria para cara tiro.
        //es basicamente colocar la bala y hace girar el tambor
     */
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}
