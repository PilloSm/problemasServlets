/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author artem
 */
public class Problema9 {
   private String nombre;
    private int horasT;
    private int salario;
    private int cuota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }
    
    public void pago(){
        if (this.horasT>40)
        {
            if(this.horasT>48)
            {
                this.cuota=(this.salario*40)+(2*this.salario*8)+(3*this.salario*(this.horasT-48));
            }
            else
            {
                this.cuota=(this.salario*40)+(2*this.salario*(this.horasT-40));
            }
        }
        else
        {
            this.cuota=this.salario*this.horasT;
        }
    }
}
