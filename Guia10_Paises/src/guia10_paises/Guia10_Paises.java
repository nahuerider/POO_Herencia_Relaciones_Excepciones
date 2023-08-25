/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.

 */
package guia10_paises;

import java.util.TreeSet;
import Entidades.pais;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author JAZMIN
 */
public class Guia10_Paises {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in); 
        TreeSet<pais>paises = new TreeSet();
        
        paises.add(new pais("china"));
        paises.add(new pais("china"));
        paises.add(new pais("guatemala"));
        paises.add(new pais("china"));
        paises.add(new pais("argentina"));
        paises.add(new pais("china"));

        System.out.println("la lista ordenada alfabeticamente es : ");
        for(pais pais : paises){
            
            System.out.println(pais);
        }
        

        // Solicitar al usuario el país a eliminar
        System.out.print("Ingrese el nombre del país a eliminar: ");
        String paisEliminar = sc.nextLine();

        //En este código, se crea un objeto pais con el nombre ingresado por 
        //el usuario y se utiliza ese objeto para buscar y eliminar el país 
        //correspondiente en el TreeSet de países. 
        //Esto se logra implementando el método hashCode() y equals() en la 
        //clase pais para que funcione correctamente en el contexto del TreeSet.
        
        
        
        
        // Crear un objeto de país con el nombre ingresado para buscarlo y eliminarlo
        pais paisObjeto = new pais(paisEliminar);

        // Eliminar el país de la lista si existe
        boolean eliminado = paises.remove(paisObjeto);

        // Mostrar el resultado de la eliminación
        if (eliminado) {
            System.out.println("El país '" + paisEliminar + "' ha sido eliminado correctamente.");
        } else {
            System.out.println("El país '" + paisEliminar + "' no se encontró en la lista.");
        }

        // Mostrar la lista de países actualizada
        System.out.println("Lista de países actualizada: " + paises);
    }

}   
    
    

