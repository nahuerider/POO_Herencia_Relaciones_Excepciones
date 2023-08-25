/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package guia13.excepciones.adivinarelnum;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guia13ExcepcionesAdivinarelNum {

    public static void main(String[] args) {
        int intento = 0;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSeleccionado = random.nextInt(500) + 1; // Genera un número aleatorio entre 1 y 500
        System.out.println("el num="+ numeroSeleccionado);
        System.out.println("Adivine el número del 1 al 500");

       //
            while (true) {
                String entrada = teclado.nextLine();
                try {
                    int respuesta = Integer.parseInt(entrada);
                    intento++;
                    if (respuesta == numeroSeleccionado) {
                        System.out.println("¡Felicitaciones! Ha adivinado el número.");
                        break;
                    } else if (respuesta < numeroSeleccionado) {
                        System.out.println("El número a adivinar es mayor que " + respuesta);
                    } else {
                        System.out.println("El número a adivinar es menor que " + respuesta);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("El valor indicado no es un número válido.");
                    intento++;
                }
            }
            System.out.println("Cantidad de intentos: " + intento);
//        } catch (Exception e) {
//            System.out.println("Ha ocurrido un error en el programa.");
//        }
    }
    }
