/*
 Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases. 

Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia11_perrosypersonas;

import Entidades.AtributosMascota;
import Entidades.AtributosPersonas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *1
 * @author JAZMIN
 */
public class Guia11_PerrosyPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //prueba 01
        
        Servicio.servicios variable1 = new Servicio.servicios();
        Scanner leer = new Scanner(System.in) ;
          System.out.println("-------------------- bienvenido al registro de Persoans y Mascotas --------------");
        
        //una vez cargado el usuario le doy el menu 
        
            int confirmacion2 = 0;
            
            while(confirmacion2 != 9){
                System.out.println("\n");
            
            System.out.println("       ¿que desea hacer?");
            
            System.out.println("---------------  MENU  ------------------");
            System.out.println("1.Agregar una Persona nueva");
            System.out.println("2.Ver la lista completa de Personas ");
            System.out.println("3.Agregar una Mascota nueva");
            System.out.println("4.ver lista completa de Mascotas");
            System.out.println("5.Adoptar");
                
            System.out.println("9. salir");
            
            confirmacion2 = leer.nextInt();
                
                    switch (confirmacion2) {
                        case 1:
                             AtributosPersonas alumno = variable1.crearPersona();
                            break;
                        case 2:
                            variable1.mostrarListadePersonas();
                            break;
                        case 3:
                              AtributosMascota mascota = variable1.crearMascota();
                            break;
                        case 4:
                            variable1.mostrarListadeMacotas();
                            break;
                            
                        case 5:
                            System.out.println("Ingrese el nombre del perro, que desee adoptar");
                            String search = leer.next();
                            System.out.println("Ingrese el apellido del titular");
                            String search2 = leer.next();
                            
                            variable1.buscaryAdoptar(search,search2);
                            break;    
                                
                        case 9: 
                            System.out.println("cerrando sesion");
                            break;
                        
                            
                        default :
                            System.out.println("Introdujo un numero que no corresponde a ninguna opcion");
                            break;
                    }
            
            }
                System.out.println("Ha selecionado Salir, la sesion se ha cerrado");
    }//fin del while
        
        
        
        
        //prueba 01 fin 
        
        
    }
    

