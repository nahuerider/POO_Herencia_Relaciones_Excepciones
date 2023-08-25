/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Alquiler {
    
    private String nombre;
    private int clienteDni;
    private LocalDate fechaDeAlquiler = LocalDate.now();
    private LocalDate fechaDevolucion = LocalDate.now();
    private int posAmarre;
    private Barco Barco;
    
    public void crearAlquiler (Barco BarcoAlquilado){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los datos del cliente");
        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        System.out.println("Ingrese el dni");
        clienteDni = leer.nextInt();
        System.out.println("Ingrese el año de alquiler");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de alquiler");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia de alquiler"); 
        int dia = leer.nextInt();
        fechaDeAlquiler = LocalDate.of(anio, mes, dia);
        System.out.println("Ingresar fecha de devoucion");
        System.out.println("Ingresar dia de devoucion");
        int diaD = leer.nextInt();
        System.out.println("Ingresar mes de devoucion");
        int mesD = leer.nextInt();
        System.out.println("Ingresar año de devoucion");
        int anioD = leer.nextInt();
        fechaDevolucion = LocalDate.of(anioD, mesD, diaD);
        System.out.println("Ingrese posicion del amarre");
        posAmarre = leer.nextInt();
        System.out.println("Barco ingresado.");
        Barco = BarcoAlquilado;
        
    }
    
    public int precioAlquiler (){
        int precio;
        int dias = diasAlquiler(); //desde la clase barco
        int eslora = Barco.modulo();
        precio = eslora * dias;
        return precio;
    }
    
    public int diasAlquiler(){
        int dias; 
        dias = fechaDevolucion.getDayOfYear() - fechaDeAlquiler.getDayOfYear();
        return dias;
    }

    public Alquiler() {
    }

    public Alquiler(String nombre, int clienteDni, int posAmarre, Barco Barco) {
        this.nombre = nombre;
        this.clienteDni = clienteDni;
        this.posAmarre = posAmarre;
        this.Barco = Barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClienteDni() {
        return clienteDni;
    }

    public void setClienteDni(int clienteDni) {
        this.clienteDni = clienteDni;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return Barco;
    }

    public void setBarco(Barco Barco) {
        this.Barco = Barco;
    }
    
    
    
}