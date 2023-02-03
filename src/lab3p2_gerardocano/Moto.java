/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Moto extends Vehiculo {
    private String descmot;
    private boolean elect;

    public Moto() {
    }

    public String getDescmot() {
        return descmot;
    }

    public void setDescmot(String descmot) {
        this.descmot = descmot;
    }

    public boolean isElect() {
        return elect;
    }

    public void setElect(boolean elect) {
        this.elect = elect;
    }

    public Moto(String descmot, boolean elect, String color, String marca, String modelo, int anno, double precio, int contllan) {
        super(color, marca, modelo, anno, precio, contllan);
        this.descmot = descmot;
        this.elect = elect;
    }

    @Override
    public String toString() {
        return super.toString()+"Moto{" + "descmot=" + descmot + ", elect=" + elect + '}';
    }
    
    
}
