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
public class Concesonaria {
    private String nombre;
    private int id;
    private String direccion;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private ArrayList<Clientes> clientes = new ArrayList();
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Concesonaria(String nombre, int id, String direccion, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public Concesonaria() {
    }
}
