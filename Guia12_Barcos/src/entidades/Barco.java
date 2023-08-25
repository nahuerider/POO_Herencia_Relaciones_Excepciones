/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

public class Barco {

    protected int eslora;
    protected String matricula;
    protected LocalDate anioFabricacion;

    public int modulo() {
        this.eslora = this.eslora * 10;
        return eslora;
    }

    public Barco() {
    }

    public Barco(int eslora, String matricula, LocalDate anioFabricacion) {
        this.eslora = eslora;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "eslora=" + eslora + ", matricula=" + matricula + ", anioFabricacion=" + anioFabricacion + '}';
    }

    
}