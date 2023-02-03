/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gerardocano;

import java.awt.Color;

/**
 *
 * @author gcano
 */
public class Carro extends Vehiculo {
    private int contpuert;
    private String descmot;
    private int maxvel;

    public Carro() {
    }

    public Carro(int contpuert, String descmot, int maxvel, String color, String marca, String modelo, int anno, double precio, int contllan) {
        super(color, marca, modelo, anno, precio, contllan);
        this.contpuert = contpuert;
        this.descmot = descmot;
        this.maxvel = maxvel;
    }

    public int getContpuert() {
        return contpuert;
    }

    public void setContpuert(int contpuert) {
        this.contpuert = contpuert;
    }

    public String getDescmot() {
        return descmot;
    }

    public void setDescmot(String descmot) {
        this.descmot = descmot;
    }

    public int getMaxvel() {
        return maxvel;
    }

    public void setMaxvel(int maxvel) {
        this.maxvel = maxvel;
    }

    @Override
    public String toString() {
        return super.toString()+"Carro{" + "contpuert=" + contpuert + ", descmot=" + descmot + ", maxvel=" + maxvel + '}';
    }
    
}
