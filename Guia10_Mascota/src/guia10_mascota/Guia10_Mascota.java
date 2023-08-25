/*
 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.

*/
package guia10_mascota;
import Servicio.servicio_masota;
import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Guia10_Mascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicio_masota servMasc = new servicio_masota();
        Scanner leer = new Scanner(System.in) ;
        
        System.out.println("bienvenido al registro de Mascotas");
        System.out.println("\n");
        System.out.println("En este caso particular solo registraremos perros");
        System.out.println("cuantos animales desea registrar ? intrpoduzca un numero entero postivo");
        int confirmacion = leer.nextInt();
        servMasc.fabricaMascota(confirmacion);
        servMasc.mostrarMascotas();
        
        //una vez cargado el usuario le doy el menu 
        
            int confirmacion2 = 0;
            
            while(confirmacion2 != 5){
                System.out.println("\n");
            System.out.println("------------------------------------------");
                System.out.println("\n");
            System.out.println("BIENVENIDO al Registro Medico para mascotas");
            System.out.println("       ¿que desea hacer?");
            
            System.out.println("---------------  MENU  ------------------");
            System.out.println("1.Agregar otro perro");
            System.out.println("2.Ver la lista completa ");
            System.out.println("3.Eliminar un perro de la lista");
                
            System.out.println("5. salir");
            
            confirmacion2 = leer.nextInt();
                
                    switch (confirmacion2) {
                        case 1:
                            servMasc.crearMascota();
                            break;
                        case 2:
                            servMasc.mostrarMascotas();;
                            break;
                        case 3:
                            System.out.println("ingrese la ubicacion de la lista del perro a eliminar");
                            System.out.println("tene en cuenta que la lista arranca a contar desde 0 ");
                            int delete = leer.nextInt();
                            servMasc.eliminarMascota(delete);
                            break;
                        
                                
                        case 5: 
                            System.out.println("cerrando sesion");
                            break;
                        
                            
                        default :
                            System.out.println("Introdujo un numero que no corresponde a ninguna opcion");
                            break;
                    }
            
                    
            
            
                
            }
                System.out.println("Ha selecionado Salir, la sesion se ha cerrado");
         

        
        
        
    }
    
}
