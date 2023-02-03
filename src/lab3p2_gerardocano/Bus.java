/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Bus extends Vehiculo{
    private int contpas;
    private String tipo;

    @Override
    public String toString() {
        return super.toString()+"Bus{" + "contpas=" + contpas + ", tipo=" + tipo + '}';
    }

    public int getContpas() {
        return contpas;
    }

    public void setContpas(int contpas) {
        this.contpas = contpas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(contpas>=50){
        this.tipo = "De Ruta";
        }else{
            this.tipo = "Rapidito";
        }
    }

    public Bus(int contpas, String color, String marca, String modelo, int anno, double precio, int contllan) {
        super(color, marca, modelo, anno, precio, contllan);
        this.contpas = contpas;
    }

    public Bus() {
    }
}
