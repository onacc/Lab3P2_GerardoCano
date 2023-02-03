/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Camion extends Vehiculo{
    private double maxvel;
    private int altura;
    private boolean verif;

    public Camion(double maxvel, int altura, boolean verif, String color, String marca, String modelo, int anno, double precio, int contllan) {
        super(color, marca, modelo, anno, precio, contllan);
        this.maxvel = maxvel;
        this.altura = altura;
        this.verif = verif;
    }
    

    public Camion() {
        
    }

    public double getMaxvel() {
        return maxvel;
    }

    public void setMaxvel(double maxvel) {
        this.maxvel = maxvel;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isVerif() {
        return verif;
    }

    public void setVerif(boolean verif) {
        this.verif = verif;
    }

    @Override
    public String toString() {
        return super.toString()+"Camion{" + "maxvel=" + maxvel + ", altura=" + altura + ", verif=" + verif + '}';
    }
    
    
}
