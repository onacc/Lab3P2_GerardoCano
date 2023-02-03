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
        static ArrayList<Concesonaria> vende = new ArrayList();
        static ArrayList<Clientes> clientes = new ArrayList();
        static ArrayList<Vehiculo> vehi = new ArrayList();
    public static void main(String[] args) {
        
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
                        vende.add(newConce());
                    break;
                    case 2:
                        if(vende.isEmpty()){
                            System.out.println("Lista vacia");
                        }else{
                        imprimirLista(vende);
                        System.out.println("Ingrese el indice que desea eliminar");
                        int pos = read.nextInt();
                        if(pos>vende.size()||pos<0){
                            System.out.println("posicicion fuera de limites");
                        }else{
                        vende.remove(pos);
                        }}
                    break;
                    case 3:
                       imprimirLista(vende);
                        System.out.println("Ingrese el indice que desea modificar");
                        int pos = read.nextInt();
                        if(pos>vende.size()||pos<0){
                            System.out.println("posicicion fuera de limites");
                        }else{
                            System.out.println("Que desea modificar?");
                            System.out.println("1.Direccion");
                            System.out.println("2.Saldo");
                            int ops = read.nextInt();
                            switch(ops){
                                case 1:
                                    System.out.println("Ingrese la nueva direccion");
                                    read.next();
                                    String dir = read.next();
                                    vende.get(pos).setDireccion(dir);
                                break;
                                case 2:
                                    System.out.println("Ingrese el nuevo saldo");
                                    double precio = read.nextDouble();
                                    vende.get(pos).setSaldo(precio);
                                break;
                            }
                        }
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
                        
                        if(clientes.isEmpty()){
                            System.out.println("Lista vacia");
                        }else{
                        imprimirLista(clientes);
                        System.out.println("Ingrese el indice del cliente que desea eliminar");
                        int pos = read.nextInt();
                         if(pos>clientes.size()||pos<0){
                            System.out.println("posicicion fuera de limites");
                        }else{
                          clientes.remove(pos);
                         }}
                    break;
                    case 3:
                        if(clientes.isEmpty()){
                            System.out.println("Lista vacia");
                        }else{
                            imprimirLista(clientes);
                             System.out.println("Ingrese el indice que desea modificar");
                        int pos = read.nextInt();
                        if(pos>clientes.size()||pos<0){
                            System.out.println("posicicion fuera de limites");
                        }else{
                            System.out.println("Ingrese el nuevo saldo del cliente");
                            double p = read.nextDouble();
                            clientes.get(pos).setSaldo(p);
                        }}
                    break;
                }
                
            break;
            //vehiculos
            case 3:
                int i =2;
                if(i==3){
                    System.out.println("No se ha ingresado la informacion suficiente para agregar un vehiculo");
                    
                }else{
                System.out.println("1.Agregar");
                System.out.println("2.Eliminar");
                System.out.println("3.Modificar");
                opcion = read.nextInt();
                switch(opcion){
                    case 1:
                        newVehiculo();
                    break;
                    case 2:
                        
                    break;
                    case 3:
                    break;
                }}
            break;
            //compra
            case 4:
                if(vende.isEmpty()&&clientes.isEmpty()&&vehi.isEmpty()){
                    System.out.println("No se ha ingresado la informacion suficiente para hacer una transaccion");
                    
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
        System.out.println("Agregar Vehiculos");
       
        Clientes retorno = new Clientes(id,nombre,sal);
        return retorno;
    }
    //vehiculos
    static void newVehiculo(){
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
        System.out.println("Ingrese cantidad de llantas 2 o 4");
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
                            vehi.add(newCarro(color,anno,marca,modelo,prec,conllan));
                            
                        break;
                        case 2:
                            vehi.add(newCamion(color,anno,marca,modelo,prec,conllan));
                        break;
                        case 3:
                            vehi.add(newBus(color,anno,marca,modelo,prec,conllan));
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
                            vehi.add(newBici(color,anno,marca,modelo,prec,conllan));
                        break;
                        case 2:
                            vehi.add(newMoto(color,anno,marca,modelo,prec,conllan));
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
    static Bus newBus(String color, int anno, String marca, String modelo, double prec, int conllan){
        System.out.println("Ingrese cantidad de pasajeros");
        int contpas = read.nextInt();
        Bus retorno = new Bus( contpas,  color,  marca,  modelo,  anno, prec, conllan);
        return retorno;
    }
    static Carro newCarro(String color, int anno, String marca, String modelo, double prec, int conllan){
        System.out.println("Ingrese cantidad de puertas");
        int contpuer = read.nextInt();
        System.out.println("Ingrese descripcion de motor");
        read.next();
        String desc = read.next();
        System.out.println("Ingrese Velocidad Maxima");
        int vel = read.nextInt();
        Carro retorno = new Carro( contpuer, desc, vel,  color,  marca,  modelo,  anno,  prec, conllan);
        return retorno;
    }
    static Camion newCamion(String color, int anno, String marca, String modelo, double prec, int conllan){
        boolean verif=false;
        System.out.println("Ingrese volumen maximo de carga");
        double maxlev = read.nextDouble();
        System.out.println("Ingrese altura");
        int alt = read.nextInt();
        System.out.println("Tiene retroexcavadora?");
        System.out.println("1.Si");
        System.out.println("2.No");
        int p = read.nextInt();
        if(p==1){
            verif = true;
        }
        Camion retorno= new Camion(maxlev,  alt,verif,  color, marca,  modelo,  anno,  prec, conllan);
        return retorno;
    }
     static void imprimirLista(ArrayList lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i)+") "+lista.get(i));
            System.out.println("");
        }
    }
}
