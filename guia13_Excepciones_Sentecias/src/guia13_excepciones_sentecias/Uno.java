/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13_excepciones_sentecias;


import java.util.*;

public class Uno {
    
    public int metodo(){
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("w");
            valor = valor + 1;
            System.out.println("Valor final del try : " + valor);
        } catch (NumberFormatException e) {
       //     valor = valor + Integer.parseInt("w");
            System.out.println("Valor final del catch  : " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}