/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
METODOS:
•Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.

• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.


 */
package guia12_electrodoméstico.Entidades;

/**
 *
 * @author JAZMIN
 */
public class Electrodoméstico {
    //atributos por defecto
    protected final static  String colorDefecto="blanco";
    protected final static  char consumoEnergeticoDefecto='f';
    protected final static double precioBaseDefecto=100;
    protected final static double pesoDefecto=5;
    
    //atributos 
    protected String color;
    protected char consumoEnergetico;
    protected double precio;
    protected double peso;
    
    
    //metodos:
    
    //para comprobar el color:
    private void comprobarColor(String color){
    
            String colores[]={"blanco","negro","gris","rojo","azul"};
            boolean encontrado = false;
            
            //si la i encuentra un color valido , encontrado pasa a valer true;
            for(int i = 0; i< colores.length && !encontrado ;i++){
                if(colores[i].equalsIgnoreCase(color)){
                    encontrado = true;
                }
            }
            
            //si es true, el boolean 
            if(encontrado){
                this.color=color; // queda con el color que agrego el usuaroio
            }else{
                this.color=colorDefecto; // sino, pasa a ser blanco, que es el 
                                        // color por defecto.
            }
            
    }
    
    
    //comprobar consumo energetico 
    
    public final void comprobarConsumoEnergetico(char consumoEnergico){
        //porque entre 65 a 70? porque segun el codigo ASCII que es
        //es el codigo de char, las letra a=65, b =66,c=67,d=68,E=69,F=70
        
        if(consumoEnergetico >=65 && consumoEnergetico <=70){
            this.consumoEnergetico = consumoEnergetico;
        }else{
            this.consumoEnergetico = consumoEnergeticoDefecto;//en caso de que el consumo,
            //ingresado por el usuario es erroe, pasa a valer F, en forma predeterminada.
        }
        
    }
    
   //getter: 
    

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }
        
    
    //getters end

public double obtenerPrecioFinal(){
    double plus = 0;
    
    switch(consumoEnergetico){
        case 'A':
            plus +=1000;
            break;
        case 'B':
            plus +=800;
            break;
        case 'C':
            plus +=600;
            break;    
        case 'D':
            plus +=500;
            break;    
        case 'E':
            plus +=300;
            break;
        case 'F':
            plus +=100;
            break;    
    }
    
    if(peso>= 0 && peso <=19){
        plus += 100;
    }else if (peso>= 20 && peso <=49){
        plus += 500;
    }else if (peso>= 50 && peso <=79){
        plus += 800;
    }else if(peso >= 80){
        plus += 1000;
    }
    
    return precio + plus;
}
//desde el mismo constructor en vez de pasar el atributo, directamente paso el metodo.
    public Electrodoméstico(String color, char consumoEnergetico, double precio, double peso) {
       
        this.precio = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        
    }

    @Override
    public String toString() {
        return "Electrodom\u00e9stico{" + "color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", precio=" + precio + ", peso=" + peso + '}';
    }


    
}