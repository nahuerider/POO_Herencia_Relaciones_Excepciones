/*
    Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:

    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:


• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

*/
package guia10_peliculas;

import Entidades.Atributos_Peliculas;
import Servicio.Servicio_Pelicula;
import Utilidades.Comparadores;
import java.util.Collections;
import java.util.Scanner;

public class Guia10_Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio_Pelicula variable1 = new Servicio_Pelicula();
        Scanner leer = new Scanner(System.in) ;

        
        System.out.println("-------------------- bienvenido a Netflix --------------");
        
      
     
        
        //una vez cargado el usuario le doy el menu 
        
            int confirmacion2 = 0;
            
            while(confirmacion2 != 9){
                System.out.println("\n");
            System.out.println("------------------------------------------");
                System.out.println("\n");
 
            System.out.println("       ¿que desea hacer?");
            
            System.out.println("---------------  MENU  ------------------");
            System.out.println("1.Agregar una nueva pelicula");
            System.out.println("2.Ver la lista completa de peliculas cargadas ");
            System.out.println("3.Ver la lista de peliculas que duran mas de una 1hrs");
            System.out.println("4.Ordenar las películas de acuerdo a su duración (de mayor a menor)");
            System.out.println("5.Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.");
            System.out.println("6.Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla");
            
            System.out.println("9. salir");
            
            confirmacion2 = leer.nextInt();
                
                    switch (confirmacion2) {
                        case 1:
                             Atributos_Peliculas peli = variable1.crearPelicula();
                            break;
                        case 2:
                            variable1.mostrarListadePeliculas();
                            break;
                        case 3:
                            System.out.println("las peliculas son :");
                             variable1.mostrarPeliculasmayoresa1();
                            break;
                        case 4:
                            variable1.listaDesPorDuracion();
                            
                            break;
                                
                        case 5: 
                            
                            variable1.listadesPorTitulo();
                            break;
                        
                            
                        default :
                            System.out.println("Introdujo un numero que no corresponde a ninguna opcion");
                            break;
                    }
            
                    
            
            
                
            }
                System.out.println("Ha selecionado Salir, la sesion se ha cerrado");
         

        
        
        
    }

}
