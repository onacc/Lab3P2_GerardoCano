/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Bici extends Vehiculo {
    private String desc;
    private double radio;
    private String tipo;

    public Bici(String desc, double radio, String tipo, String color, String marca, String modelo, int anno, double precio, int contllan) {
        super(color, marca, modelo, anno, precio, contllan);
        this.desc = desc;
        this.radio = radio;
        this.tipo = tipo;
    }

 

    @Override
    public String toString() {
        return super.toString()+"Bici{" + "desc=" + desc + ", radio=" + radio + ", tipo=" + tipo + '}';
    }

    public Bici() {
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
