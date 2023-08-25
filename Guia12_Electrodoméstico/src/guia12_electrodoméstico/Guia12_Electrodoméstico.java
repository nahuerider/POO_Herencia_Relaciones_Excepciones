/*
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package guia12_electrodoméstico;

import guia12_electrodoméstico.Entidades.Electrodoméstico;
import guia12_electrodoméstico.Entidades.Lavadora;
import guia12_electrodoméstico.Entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author JAZMIN
 */
public class Guia12_Electrodoméstico {

    public static void mostrarListaElectrodomesticos(Electrodoméstico[] lista) {
    System.out.println("\n=== Lista de Electrodomésticos ===");
    for (Electrodoméstico electrodomestico : lista) {
        if (electrodomestico != null) {
            System.out.println(electrodomestico.toString());
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        Scanner teclado  = new Scanner (System.in);
        //en este caso el menu se va a repetir hasta llegar a 5;
        Electrodoméstico[] listaElectrodomesticos = new Electrodoméstico[4];
        int opcion;
        
        for (int i = 0; i< listaElectrodomesticos.length;){
        
            System.out.println("\n Digite una opcion: ");
            System.out.println("1. Agregar electrodomestico");
            System.out.println("2. Agregar Lavadora");
            System.out.println("3. Agregar Televisor");
            System.out.println("4. Ver la lista completa: ");
            System.out.println("¿que desea hacer ?");
            opcion = teclado.nextInt();
            
            if(opcion == 1 || opcion == 2 || opcion ==3 || opcion ==4){
            
                switch (opcion ){
                        
                    case 1:
                        String color;
                        char consumoEnergetico;
                        double precio, peso;
                        
                        System.out.println("\n Digite el color");
                        color = teclado.next();
                        
                        System.out.println("Digite el consumo energetico");
                        consumoEnergetico = teclado.next().charAt(0);
                        
                        System.out.println("Digite el precio base:");
                        precio = teclado.nextDouble();
                        
                        System.out.println("digite el peso: ");
                        peso = teclado.nextDouble();
                        
                    listaElectrodomesticos[i] = new Electrodoméstico(color, consumoEnergetico, precio, peso);
                        System.out.println("Electro agregado correctamente");
                    i++; 
                    break;
                    
                    case 2:
                    
                        String color1;
                        char consumoEnergetico1;
                        double precio1, peso1;
                        int carga;
                        
                        System.out.println("\n Digite el color");
                        color1 = teclado.next();
                        
                        System.out.println("Digite el consumo energetico");
                        consumoEnergetico1 = teclado.next().charAt(0);
                        
                        System.out.println("Digite el precio base:");
                        precio1 = teclado.nextDouble();
                        
                        System.out.println("digite el peso: ");
                        peso1 = teclado.nextDouble();
                        
                        System.out.println("Digite la capacidad de CARGA: ");
                        carga = teclado.nextInt();
                        
                    listaElectrodomesticos[i] = new Lavadora(color1, consumoEnergetico1, precio1, peso1,carga);
                        System.out.println("cargo la lavadora correctamente :D"); 
                   
                    i++;
                    break;
                    
                    case 3:
                    
                        
                        String color2;
                        char consumoEnergetico2;
                        double precio2, peso2;
                        int resolucion;
                        boolean sincronizadorTDT;
                        
                        System.out.println("\n Digite el color");
                        color2 = teclado.next();
                        
                        System.out.println("Digite el consumo energetico");
                        consumoEnergetico2 = teclado.next().charAt(0);
                        
                        System.out.println("Digite el precio base:");
                        precio2 = teclado.nextDouble();
                        
                        System.out.println("digite el peso: ");
                        peso2 = teclado.nextDouble();
                        
                        System.out.println("Digite cantidad de pulgadas del televisor: ");
                        resolucion = teclado.nextInt();
                        
                        System.out.println("Tiene sincronizado TDT ? true / false");
                        sincronizadorTDT = teclado.nextBoolean();
                        
                        
                    listaElectrodomesticos[i] = new Televisor(color2, consumoEnergetico2, precio2, peso2,resolucion,sincronizadorTDT );
                        System.out.println("Televisor agregado correctamente");
                    i++;
                        
                    break;
                    
                    case 4:
                    
                        
                     mostrarListaElectrodomesticos(listaElectrodomesticos);
        //Calculamos la suma de todos los electrodomesticos
        double sumaElectrodomesticos = 0;
        double sumaTelevisores = 0;
        double sumaLavadoras = 0;
        
                //Recorremos nuestra lista de electrodomesticos
                for (Electrodoméstico listaElectrodomestico : listaElectrodomesticos) {
                    if (listaElectrodomestico instanceof Electrodoméstico) {
                        sumaElectrodomesticos += listaElectrodomestico.obtenerPrecioFinal();
                    }
                    if (listaElectrodomestico instanceof Lavadora) {
                        sumaLavadoras += listaElectrodomestico.obtenerPrecioFinal();
                    }
                    if (listaElectrodomestico instanceof Televisor) {
                        sumaTelevisores += listaElectrodomestico.obtenerPrecioFinal();
                    }
                }
        
        //mostramos la suma de los electrodomesticos
        System.out.println("\nLa suma del precio de electrodomesticos es de : " + sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es : " + sumaLavadoras);
        System.out.println("La suma del precio de los televisores es de : " + sumaTelevisores);
    
                    break;
                    
                    default:
                        System.out.println("opcion no disponible");
                        System.out.println("sos un boludo, volve a intentarlo xD");
                        break;
                }
            }
            
            
            
        }
        
        
    
    
    }
    
}
