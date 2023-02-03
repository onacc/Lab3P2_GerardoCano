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
            //concesonaria
            case 1:
                int opcion;
                System.out.println("1.Agregar");
                System.out.println("2.Eliminar");
                System.out.println("3.Modificar");
                opcion = read.nextInt();
                switch(opcion){
                    case 1:
                        
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                }
            break;
            //clientes
            case 2:
                //int opci;
                System.out.println("1.Agregar");
                System.out.println("2.Eliminar");
                System.out.println("3.Modificar");
                opcion = read.nextInt();
                switch(opcion){
                    case 1:
                        clientes.add(newCliente());
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                }
                
            break;
            //vehiculos
            case 3:
                System.out.println("1.Agregar");
                System.out.println("2.Eliminar");
                System.out.println("3.Modificar");
                opcion = read.nextInt();
                switch(opcion){
                    case 1:
                        
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                }
            break;
            //compra
            case 4:
                if(vende.size()==0&&clientes.size()==0&&vehi.size()==0){
                    System.out.println("No se ha ingresado la informaicon suficiente para hacer una transaccion");
                    
                }else{
                    
                }
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
    static Vehiculo newVehiculo(){
        System.out.println("Ingrese el color del vehiculo");
        String color = read.next();
        System.out.println("Ingrese el año de fabricacion");
        int anno = read.nextInt();
        System.out.println("Ingrese marca del vehiculo");
        String marca = read.next();
        System.out.println("Ingrese modelo del vehiculo");
        String modelo = read.next();
        System.out.println("Ingrese precio del vehiculo");
        double prec = read.nextInt();
        int conllan = read.nextInt();
        if (conllan ==4) {
            //carro, cammion, bus
            System.out.println("");
        }else if (conllan==2){
            //bici o moto
        }
    
    }
    static Moto newMoto(String color, int anno, String marca, String modelo,double prec ){
        System.out.println("Ingrese descripcion del motor");
        read.next();
        String desc = read.next();
        
    }
    
}
