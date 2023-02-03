/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_gerardocano;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author gcano
 */
public class Lab3P2_GerardoCano {
static Scanner read = new Scanner (System.in);
static Random ran = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Concesonaria> vende = new ArrayList();
        ArrayList<Clientes> clientes = new ArrayList();
        ArrayList<Vehiculo> vehi = new ArrayList();
        int op;
        do{
        System.out.println("Menu");
        System.out.println("1.CRUD Concesonaria");
        System.out.println("2.CRUD Clientes");
        System.out.println("3.CRUD Vehiculos");
        System.out.println("4.Compra/Venta de vehiculos");
        System.out.println("5.Salir");
        op = read.nextInt();
        switch(op ){
            case 1:
                int opcion;
                System.out.println("");
            break;
            case 2:
                
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
                System.out.println("Saliendo");
            break;
        }
        
        }while(op!=5);
    }//fin main
    static Concesonaria newConce(){
        System.out.println("Ingrese el nombre de la concesonaria");
        String nombre = read.next();
        System.out.println("Ingrese Direccion");
        read.next();
        String dir = read.next();
        int id = 1+ran.nextInt(nombre.length());
        System.out.println("ID generado "+id);
        System.out.println("Ingrese saldo disponible ");
        double sal = read.nextDouble();
        Concesonaria retorno = new  Concesonaria(nombre, id, dir, sal);
        return retorno;
        
    }
    static Clientes newCliente(){
        System.out.println("Ingrese nombre del cliente");
        String nombre = read.next();
        int id = 1+ran.nextInt(nombre.length());
        System.out.println("ID generado "+id);
       
        System.out.println("Ingrese saldo disponible");
        double sal = read.nextDouble();
        Clientes retorno = new Clientes(id,nombre,sal);
        return retorno;
    }
    
}
