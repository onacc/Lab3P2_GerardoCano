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
public class Vehiculo {
    protected Color color;
    protected String marca;
    protected String modelo;
    protected int anno;
    protected int precio;
    protected int contllan;

    public Vehiculo() {
    }

    public Vehiculo(Color color, String marca, String modelo, int anno, int precio, int contllan) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.precio = precio;
        this.contllan = contllan;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getContllan() {
        return contllan;
    }

    public void setContllan(int contllan) {
        this.contllan = contllan;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", anno=" + anno + ", precio=" + precio + ", contllan=" + contllan + '}';
    }
    
}
