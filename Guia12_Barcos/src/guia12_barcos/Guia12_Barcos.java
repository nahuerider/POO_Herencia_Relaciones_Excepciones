/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_barcos;

import entidades.Alquiler;
import entidades.Barco;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.YateDeLujo;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia12_Barcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           ArrayList <Barco> listaBarcos = new ArrayList <> ();
        
        listaBarcos.add(new Barco(10, "5658", LocalDate.of(2005, 6, 5)));
        listaBarcos.add (new Velero(2, 10, "AB15615", LocalDate.of(1999, 10, 6)));
        listaBarcos.add( new YateDeLujo(22, 33, 2, "BB56", LocalDate.of(2020, 5, 5)));
        listaBarcos.add(new BarcoMotor(22, 6, "jfisjdf232", LocalDate.of(2022, 5, 6)));
        
        
       
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Barcos disponibles de alquiler");
        for(Barco barcoUnidad : listaBarcos){
            System.out.println(barcoUnidad.toString());
            int valor = barcoUnidad.modulo();
            System.out.println("el precio es" + valor);
            System.out.println("Desea alquilar este barco? S/N");
            String resp = leer.next();
            if (resp.equals("S")){
                Alquiler nuevoAlquiler = new Alquiler();
                nuevoAlquiler.crearAlquiler(barcoUnidad);
            }
        }
        
    }
    
}
