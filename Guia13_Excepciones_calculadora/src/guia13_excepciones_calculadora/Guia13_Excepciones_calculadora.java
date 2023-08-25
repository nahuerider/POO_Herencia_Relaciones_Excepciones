/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y 
guardarlas en dos variables de tipo int. Por ultimo realizar una división con 
los dos numeros y mostrar el resultado.

Todas estas operaciones puede tirar excepciones a manejar, el ingreso por 
teclado puede causar una excepción de tipo InputMismatchException, el método 
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una 
NumberFormatException y además, al dividir un número por cero surge una 
ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones

 */
package guia13_excepciones_calculadora;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Guia13_Excepciones_calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var10 = 0,var20 = 0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido a la calculadora de excepciones");
        System.out.println("Calculadora para excepciones \n");
        
        System.out.println("ingrese el primer numero");
        String var1 = teclado.next();
        try{
            var10 =Integer.valueOf(var1);
            System.out.println("el numero indicado es : "+ var10);
        }catch(NumberFormatException e){
            System.out.println("El valor indicado no es un numero");  
        }
        
        System.out.println("ingrese el Segundo numero");
        String var2 = teclado.next();
        try{
            var20 =Integer.valueOf(var2);
            System.out.println("el numero indicado es : "+ var20);
        }catch(NumberFormatException e){
            System.out.println("El valor indicado no es un numero");  
        }
        
        
        
        try{
            
        int resultado = var10 % var20;
        int resto = var10 / var20;    
            System.out.println(" dividir "+ var10+" por "+ var20+" da un resultado= " +resultado+ " con resto: "+resto);
        }catch(ArithmeticException i){
            System.out.println("uno o ambos digitos ingresados, no son numeros.");
            System.out.println("por ende, no hay resultado. no hay nada que dividir");
        }
        
        
        
    }
    
}
