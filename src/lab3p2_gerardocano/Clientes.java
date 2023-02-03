/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_gerardocano;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Clientes {
    private int id;
    private String nombre;
    private ArrayList<Vehiculo> vehi = new ArrayList();
    private double saldo;

    public ArrayList<Vehiculo> getVehi() {
        return vehi;
    }

    public void setVehi(ArrayList<Vehiculo> vehi) {
        this.vehi = vehi;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Clientes(int id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Clientes(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Clientes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
