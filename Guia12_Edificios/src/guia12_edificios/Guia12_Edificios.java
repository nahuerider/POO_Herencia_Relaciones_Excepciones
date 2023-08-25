/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package guia12_edificios;

    import guia12_edificios.Polideportivo;
    import guia12_edificios.Edificio;
    import guia12_edificios.EdificioDeOficinas;

    import java.util.Scanner;
    import java.util.ArrayList;


    /**
     *
     * @author JAZMIN
     */
    public class Guia12_Edificios {

    //metodo para recorre la lista:
        public static void mostrarListaEdificios(Edificio[] lista) {
   for (Edificio edificio : lista) {
        if (edificio != null) {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Tipo: Polideportivo");
                System.out.println("Nombre: " + polideportivo.getNombre());
                System.out.println("Techado: " + polideportivo.isTechado());
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                System.out.println("Tipo: Edificio de Oficinas");
                System.out.println("Cantidad de Oficinas: " + edificioDeOficinas.getCantOficinas());
                System.out.println("Cantidad de Personas por Oficina: " + edificioDeOficinas.getCantPersonasxOficinas());
                System.out.println("Cantidad de Pisos: " + edificioDeOficinas.getCantPisos());
            }
            System.out.println("Ancho: " + edificio.getAncho());
            System.out.println("Alto: " + edificio.getAlto());
            System.out.println("Largo: " + edificio.getLargo());
            System.out.println("Superficie: " + edificio.getSuperficie());
            System.out.println("Volumen: " + edificio.getVolumen());
            System.out.println("=========================");
        }
    }

        }// fin de mostrar lista: 
        
        //comienzo de la funcion slair
      public static void salir() {
    System.out.println("Saliendo del programa...");
    System.exit(0); // Finaliza la ejecución del programa con código de salida 0 (éxito)
    }
  

//fin  de la funcion slair
        
        
        
        
    //metodo ends
    
        public static void main(String[] args) {

            Scanner teclado  = new Scanner (System.in);
            //en este caso el menu se va a repetir hasta llegar a 4;
            Edificio[] listaVar= new Edificio[4];
            int opcion;

            for (int i = 0; i< listaVar.length;){

                System.out.println("\n Digite una opcion: ");
                System.out.println("1. Agregar un Polideportivo");
                System.out.println("2. Agregar un edificio de Oficinas");
                System.out.println("4. Ver la lista completa: ");
                System.out.println("5.           salir ");
                System.out.println("¿que desea hacer ?");
                opcion = teclado.nextInt();

                if(opcion == 1 || opcion == 2 || opcion == 4 || opcion ==5 ){

                    switch (opcion ){

                        case 1:
                            double ancho,alto, largo;
                            String nombre;
                            boolean techado=true;

                            System.out.println("\n El ancho del Polideportivo ");
                            ancho = teclado.nextDouble();

                            System.out.println("El alto del Polideportivo");
                            alto = teclado.nextDouble();

                            System.out.println("El largo del Polideportivo");
                            largo = teclado.nextDouble();

                            System.out.println("digite el nombre del poli: ");
                            nombre = teclado.next();

                            System.out.println("este poli ¿es techado? si / no");
                            String confirmacion = teclado.next();
                            if (confirmacion.equalsIgnoreCase("no")){
                                techado = false;
                            }


                        listaVar[i] = new Polideportivo(ancho, alto,largo,nombre,techado);
                            System.out.println("Polideportivo agregado correctamente");
                        i++; 
                        break;

                        case 2:
                      listaVar[i] = new EdificioDeOficinas();
                        ((EdificioDeOficinas) listaVar[i]).cantPersonas();
                        System.out.println("Cargo el edificio de Oficinas correctamente :D"); 
                        i++;

                        break;



                        case 4:

                          mostrarListaEdificios(listaVar);


                        break;
                        
                        case 5:
                            salir();
                            break;

                        
                        
                        default:
                            System.out.println("opcion no disponible");
                            System.out.println("sos un boludo, volve a intentarlo xD");
                    }
                }



            }







        }


    }
