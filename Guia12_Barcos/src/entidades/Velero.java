/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

public class Velero extends Barco {

    private int veleros;

    public int modulo() {
        super.eslora = +10 + veleros;
        return super.eslora;
    }

    public Velero() {
    }

    public Velero(int veleros) {
        this.veleros = veleros;
    }

    public Velero(int veleros, int eslora, String matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.veleros = veleros;
    }
    
    
}