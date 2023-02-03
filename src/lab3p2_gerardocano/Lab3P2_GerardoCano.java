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
        int id = 1+ran.nextInt(200);
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
        if (conllan ==4||conllan==2) {
            switch(conllan){
                case 4:
                    int op;
                    System.out.println("Ingrese el vehiculo que desea agregar");
                    System.out.println("1.Carro");
                    System.out.println("2.Camion de carga");
                    System.out.println("3.Bus");
                    op = read.nextInt();
                    switch(op){
                        case 1:
                            
                        break;
                        case 2:
                        break;
                        case 3:
                        break;
                    }
                break;
                case 2:
                    System.out.println("Ingrese el vehiculo que desea agregar");
                    System.out.println("1.Bicicleta");
                    System.out.println("2.Motocicleta");
                    int opcion = read.nextInt();
                    switch(opcion){
                        case 1:
                            newBici(color,anno,marca,modelo,prec,conllan);
                        break;
                        case 2:
                            newMoto(color,anno,marca,modelo,prec,conllan);
                        break;
                    }
                break;
            }
            
        }else{
            System.out.println("Datos ingresados no validos");
        }
    
    }
    static Moto newMoto(String color, int anno, String marca, String modelo,double prec,int conllan ){
        boolean verif = false;
        System.out.println("Ingrese descripcion del motor");
        read.next();
        String desc = read.next();
        System.out.println("Es la moto electrica?");
        System.out.println("1.Si");
        System.out.println("2.No");
        int p = read.nextInt();
        if(p==1){
            verif = true;
        }
        
        Moto retorno = new Moto( desc, verif, color, marca,  modelo, anno,  prec, conllan);
        
        return retorno;
    }
    static Bici newBici(String color, int anno, String marca, String modelo, double prec, int conllan){
        System.out.println("Ingrese descripcion de la bicicleta");
        read.next();
        String desc = read.next();
        System.out.println("Ingrese radio de llanta");
        double rad = read.nextDouble();
        System.out.println("Ingrese tipo(BMX o calle)");
        String type = read.next();
        Bici retorno = new Bici( desc,  rad, type, color,  marca, modelo, anno, prec,conllan);
        return retorno;
    }
    static Bus newBus(){
        System.out.println("Ingrese cantidad de pasajeros");
        int contpas = read.nextInt();
        Bus retorno = new Bus( contpas,  color,  marca,  modelo,  anno, prec, conllan);
        return retorno;
    }
}
