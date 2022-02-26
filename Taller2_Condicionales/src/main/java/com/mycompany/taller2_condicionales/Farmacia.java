
package com.mycompany.taller2_condicionales;

import java.util.Scanner;

public class Farmacia {
    
    public String productos[] = {"Pastillas $500", "Jarabe $1000", "Pomada $3000"};
    public int opcion;
    
    public int menuProductos(){
        System.out.println("Bienvenido a la Droguería Mi Salud");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1. Consultar productos");
        System.out.println("2. Devolver producto");
        System.out.println("3. Salir");
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
        return opcion;
    }
    
    public void mostrarProductos(){
        System.out.println("Los productos disponibles son: ");
        for (int i=0; i<productos.length; i++){
            System.out.println((i+1) + "." + productos[i]);
        }
    }
    
    public void productosDisponibles(int producto){
        if (producto == 1){
            System.out.println("Usted ha escogido el producto: " + productos[0]);
        }else if (producto == 2){
            System.out.println("Usted ha escogido el producto: " + productos[1]);
        }else if (producto == 3){
            System.out.println("Usted ha escogido el producto: " + productos[2]);
        }else{
            System.out.println("Opcion errónea");
        }
    }
    
        public void devolverProducto(int producto){
        if (producto == 1){
            System.out.println("Usted ha devuelto el producto: " + productos[0]);
        }else if (producto == 2){
            System.out.println("Usted ha devuelto el producto: " + productos[1]);
        }else if (producto == 3){
            System.out.println("Usted ha devuelto el producto: " + productos[2]);
        }else{
            System.out.println("Opcion errónea");
        }
    }
    
}
