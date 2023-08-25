/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia10_mapasconprecios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Guia10_MapasconPrecios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //nunca puede faltar el scanner para introducir desde el usuario:
        Scanner leer = new Scanner(System.in) ;

        //con esto creamos el HashMap, y le ponemos el tipo de dato de la llave
        HashMap<String, Integer > productos = new HashMap();
        
        //le ponemos nombre al mapa.put. nos pide la key y dps el valor que le colocamos 
        productos.put("Jabon Liquido",10);
        productos.put("Detergente",20);
        productos.put("Escoba",50);
        
        
        
           

        
        System.out.println("---------- bienvenido a la Tienda Online --------------");
        
        //una vez cargado una lsita basica, habiltiamos el menu
        
            int confirmacion2 = 0;
            
            while(confirmacion2 != 5){
            System.out.println("\n");
                 
            System.out.println("       ¿que desea hacer?");
            
            System.out.println("---------------  MENU  ------------------");
            System.out.println("1.Agregar un Producto nuevo");
            System.out.println("2.Ver la lista completa ");
            System.out.println("3.Eliminar un Producto de la lista");
            System.out.println("4.modificar el precio de un Producto de la lista");
            
            
                
            System.out.println("5. salir");
            
            confirmacion2 = leer.nextInt();
                
                    switch (confirmacion2) {
                        case 1:
                            
                            
                            
                            System.out.println("Introduzca el nombre");
                                String var1 = "";

                                while (var1.isEmpty()) {
                                    var1 = leer.nextLine();
                                }//COLOQUE ESTE WHILE porque sino
                                //el programa no se detenia a esperar al NEXTLINE();
                                //directamtne saltaba a otra linea haciendo qe se rompa todo
                            
                            System.out.println("Ahora el precio por unidad");
                            int var2 = leer.nextInt();
                            
                            
                            productos.put(var1,var2);
                            
                            break;
                        
                        case 2:

                            //asi se imprime en pantalla :
                            for (Map.Entry<String, Integer> entry : productos.entrySet()) {
                                String key = entry.getKey();
                                Integer value = entry.getValue();
                                
                                System.out.println("producto es: "+ key + " y su precio es $"+value);
                                
                            }
                            

                            break;
                            
                        case 3:
                            System.out.println("ingrese el nombre del Producto a eliminar");
                            System.out.println("tiene que colocarlo tal cual aparece en la lista");    
                             String var3 = "";

                                while (var3.isEmpty()) {
                                    var3 = leer.nextLine();
                                }//COLOQUE ESTE WHILE porque sino
                                //el programa no se detenia a esperar al NEXTLINE();
                                //directamtne saltaba a otra linea haciendo qe se rompa todo
                            
                            //para eliminar un objeto adentro del Hashmaps es con el siguiente linea:
                            productos.remove(var3); //solo hay que poner la Kye y se elimina
 
                            break;
                        

                        case 4: 
                            System.out.println("ingrese el nombre del Producto a editar");
                            System.out.println("tiene que colocarlo tal cual aparece en la lista");    
                            String var4 = "";

                                while (var4.isEmpty()) {
                                    var4 = leer.nextLine();
                                }//COLOQUE ESTE WHILE porque sino
                                //el programa no se detenia a esperar al NEXTLINE();
                                //directamtne saltaba a otra linea haciendo qe se rompa todo
                            System.out.println("Introduzca su nuevo precio : ");
                            int var5 = leer.nextInt();
                            //para eliminar un objeto adentro del Hashmaps es con el siguiente linea:
                            productos.replace(var4,var5); //solo hay que poner la Kye y se elimina
   
                            
                            break;
    
                            
                            
                            
                        case 5: 
                            System.out.println("Ha selecionado Salir");
                            break;
                        
                            
                        default :
                            System.out.println("Introdujo un numero que no corresponde a ninguna opcion");
                            break;
                    }
            
                    
            
            
                
            }
                System.out.println("la sesion se ha cerrado correctamente");
                System.out.println("    Vuelve pronto :D");
         

        
        
        
    }
        
      
        
    }
    

