/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

public class YateDeLujo extends Barco{
    private int numCamarotes;
    private int pontCV;
    
    @Override
    public int modulo(){
        super.eslora = super.eslora * 10 + numCamarotes + pontCV;
        return super.eslora;
    }

    public YateDeLujo() {
    }

    public YateDeLujo(int numCamarotes, int pontCV) {
        this.numCamarotes = numCamarotes;
        this.pontCV = pontCV;
    }

    public YateDeLujo(int numCamarotes, int pontCV, int eslora, String matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.numCamarotes = numCamarotes;
        this.pontCV = pontCV;
    }
    
    
    
}