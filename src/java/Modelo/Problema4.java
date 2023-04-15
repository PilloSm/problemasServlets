/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author artem
 */
public class Problema4 {
    private String nombre;
    private int califpar;
    private int califexf;
    private int califtraf;
    private int promedio;

    public Problema4() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalifpar() {
        return califpar;
    }

    public void setCalifpar(int califpar) {
        this.califpar = califpar;
    }

    public int getCalifexf() {
        return califexf;
    }

    public void setCalifexf(int califexf) {
        this.califexf = califexf;
    }

    public int getCaliftraf() {
        return califtraf;
    }

    public void setCaliftraf(int califtraf) {
        this.califtraf = califtraf;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    
    public void promediar(){
    this.promedio=(this.califexf+this.califpar+this.califtraf)/3;
    }
    
}
