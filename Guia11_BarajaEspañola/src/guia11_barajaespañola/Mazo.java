/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_barajaespañola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Mazo {
    
    private Carta[] cartas;
    private List<Carta> cartasBasura;
     
    
    
    public Mazo(){
        //primero creo el mazo
        cartas =   new Carta[40];
        cartasBasura = new ArrayList<>();
        //segundo francia
        //tercero creo los 10 de cada palo
        cartas[0]=new Carta(1, Carta.Palo.Basto);
        cartas[1]=new Carta(2, Carta.Palo.Basto);
        cartas[2]=new Carta(3, Carta.Palo.Basto);
        cartas[3]=new Carta(4, Carta.Palo.Basto);
        cartas[4]=new Carta(5, Carta.Palo.Basto);
        cartas[5]=new Carta(6, Carta.Palo.Basto);
        cartas[6]=new Carta(7, Carta.Palo.Basto);
        cartas[7]=new Carta(10, Carta.Palo.Basto);
        cartas[8]=new Carta(11, Carta.Palo.Basto);
        cartas[9]=new Carta(12, Carta.Palo.Basto);
                
        cartas[10]=new Carta(1, Carta.Palo.Copa);
        cartas[11]=new Carta(2, Carta.Palo.Copa);
        cartas[12]=new Carta(3, Carta.Palo.Copa);
        cartas[13]=new Carta(4, Carta.Palo.Copa);
        cartas[14]=new Carta(5, Carta.Palo.Copa);
        cartas[15]=new Carta(6, Carta.Palo.Copa);
        cartas[16]=new Carta(7, Carta.Palo.Copa);
        cartas[17]=new Carta(10, Carta.Palo.Copa);
        cartas[18]=new Carta(11, Carta.Palo.Copa);
        cartas[19]=new Carta(12, Carta.Palo.Copa);
        
        cartas[20]=new Carta(1, Carta.Palo.Oro);
        cartas[21]=new Carta(2, Carta.Palo.Oro);
        cartas[22]=new Carta(3, Carta.Palo.Oro);
        cartas[23]=new Carta(4, Carta.Palo.Oro);
        cartas[24]=new Carta(5, Carta.Palo.Oro);
        cartas[25]=new Carta(6, Carta.Palo.Oro);
        cartas[26]=new Carta(7, Carta.Palo.Oro);
        cartas[27]=new Carta(10, Carta.Palo.Oro);
        cartas[28]=new Carta(11, Carta.Palo.Oro);
        cartas[29]=new Carta(12, Carta.Palo.Oro);
        
        cartas[30]=new Carta(1, Carta.Palo.Espada);
        cartas[31]=new Carta(2, Carta.Palo.Espada);
        cartas[32]=new Carta(3, Carta.Palo.Espada);
        cartas[33]=new Carta(4, Carta.Palo.Espada);
        cartas[34]=new Carta(5, Carta.Palo.Espada);
        cartas[35]=new Carta(6, Carta.Palo.Espada);
        cartas[36]=new Carta(7, Carta.Palo.Espada);
        cartas[37]=new Carta(10, Carta.Palo.Espada);
        cartas[38]=new Carta(11, Carta.Palo.Espada);
        cartas[39]=new Carta(12, Carta.Palo.Espada);
        
                
       }
    
    public void imprimir (){
        System.out.println("Listado completo de cartas");
        
        for(Carta carta:cartas)
            carta.imprimir();
    }
    
    public void sacarAlAzar(){
        System.out.println("Una carta al azar: ");
         if (cartas.length == 0) {
            System.out.println("El mazo está vacío.");
            return;
        }
        
       // Carta carta=cartas[(int)(Math.random()*40)];
       // carta.imprimir();
        
         int indice = (int) (Math.random() * cartas.length);
        Carta carta = cartas[indice];
        cartasBasura.add(carta);
        cartas = eliminarCarta(cartas, indice);

        carta.imprimir();
    }
    
     private Carta[] eliminarCarta(Carta[] array, int indice) {
        Carta[] nuevoArray = new Carta[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != indice) {
                nuevoArray[j] = array[i];
                j++;
            }
        }

        return nuevoArray;
    }
    
     
    public void verCartasDisponibles(){
        System.out.println("Listado de cartas Disponibles: ");
        
        for(Carta carta:cartas)
            carta.imprimir();
        
           int cantidad = cartas.length;
           System.out.println("Cantidad de cartas disponibles = "+cantidad);
    }
    
       
       public void desordenarCartas() {
        for (int i = cartas.length - 1; i > 0; i--) {
            int indiceAleatorio = (int) (Math.random() * (i + 1));

            Carta temp = cartas[i];
            cartas[i] = cartas[indiceAleatorio];
            cartas[indiceAleatorio] = temp;
        }
    }
            
    
    public void sacarMasdeunaCarta() {
    System.out.println("Las cartas al azar son:");

    if (cartas.length == 0) {
        System.out.println("El mazo está vacío.");
        return;
    }

    Scanner leer = new Scanner(System.in);
    System.out.println("¿Cuántas cartas desea sacar?");
    int cantidadCartas = leer.nextInt();

    if (cantidadCartas > cartas.length) {
        System.out.println("No hay suficientes cartas en el mazo.");
        return;
    }

    for (int i = 0; i < cantidadCartas; i++) {
        int indice = (int) (Math.random() * cartas.length);
        Carta carta = cartas[indice];
        cartasBasura.add(carta);
        cartas = eliminarCarta(cartas, indice);

        carta.imprimir();
        }
    }

 
    
    public void MostrarBasura (){
        System.out.println("Listado completo de cartas que ya salieron y fueron eliminadas del mazp :");
        
        for(Carta carta:cartasBasura)
            carta.imprimir();
    }
}

