/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_barajaespañola;

import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Guia11_BarajaEspañola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mazo var_Mazo = new Mazo();
        //var_Mazo.imprimir(); 
       // var_Mazo.sacarAlAzar();
        System.out.println("Bienvenido a la baraja de cartas españolas de 40");
        
        int confirmacion = 0;
      
       
       while ( confirmacion != 9){
           
               System.out.println("\n");
            
            System.out.println("           ¿que desea hacer?");
            
            System.out.println("---------------  MENU  ------------------");
            System.out.println("1.Mostrar mazo completo");
            System.out.println("2.Barajar ");
            System.out.println("3.Siguiente carta ");
            System.out.println("4.Ver cartas disponibles");
            System.out.println("5.Dar mas de una carta");
            System.out.println("6.Cartas del basurero");
            
            
                
            System.out.println("9. salir");
            
              Scanner leer = new Scanner(System.in);
       
            confirmacion = leer.nextInt();
                
                    switch (confirmacion) {
                        case 1:
                             var_Mazo.imprimir();
                            break;
                        case 2:
                              var_Mazo.desordenarCartas();  
                            break;
                        case 3:
                            var_Mazo.sacarAlAzar();
                            
                            break;
                        case 4:
                            var_Mazo.verCartasDisponibles();
                            break;
                            
                        case 5:
                            var_Mazo.sacarMasdeunaCarta();
                            break;    
                                
                        case 6:
                            var_Mazo.MostrarBasura();
                            break;    
                            
                        
                        
                        
                        
                        case 9: 
                            System.out.println("cerrando sesion");
                            break;
                        
                            
                        default :
                            System.out.println("Introdujo un numero que no corresponde a ninguna opcion");
                            break;
                    }
            
            }
           
       }
       
       
    }
    

