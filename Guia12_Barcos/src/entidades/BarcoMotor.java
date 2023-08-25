/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;


public class BarcoMotor extends Barco{
    private int pontCV;
    
    @Override
    public int modulo(){
        super.eslora = super.eslora * 10 + pontCV;
        return super.eslora;
    }

    public BarcoMotor() {
    }

    public BarcoMotor(int pontCV, int eslora, String matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.pontCV = pontCV;
    }
    

    public BarcoMotor(int pontCV) {
        this.pontCV = pontCV;
    }

    public int getPontCV() {
        return pontCV;
    }

    public void setPontCV(int pontCV) {
        this.pontCV = pontCV;
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
        return "BarcoMotor{" + "pontCV=" + pontCV + '}';
    }
    
    
}