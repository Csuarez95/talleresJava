
package com.mycompany.taller2_condicionales;

import java.util.Scanner;


public class Pasteleria {
    
    public String pasteles[] = {"Vainilla", "Chocolate", "Arequipe"};
    public int cantidad = 10, opcion, contador = 0, decoracion, porciones, ventas;
    
    public int menuPastel(){
        System.out.println("Bienvenido a la pastelería");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1. Pasteles disponibles");
        System.out.println("2. Salir");
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
        return opcion;
    }
    
    
    public void mostrarPasteles(){
        System.out.println("Los sabores de pasteles disponibles son: ");
        for (int i=0; i<pasteles.length; i++){
            System.out.println((i+1) + "." + pasteles[i]);
        }
    }
    
    public void pastelesDisponibles(int producto){
        //Pasteleria decor = new Pasteleria();
        if (producto == 1){
            System.out.println("Usted ha escogido el pastel: " + pasteles[0]);
            decoraciones(pasteles[0]);
        }else if (producto == 2){
            System.out.println("Usted ha escogido el pastel: " + pasteles[1]);
            decoraciones(pasteles[1]);
        }else if (producto == 3){
            System.out.println("Usted ha escogido el pastel: " + pasteles[2]);
            decoraciones(pasteles[2]);
        }else{
            System.out.println("Opcion errónea");
        }
    }
    
    public void decoraciones(String vec){
        System.out.println("Ingrese la cantidad de porciones");
        Scanner porc = new Scanner(System.in);
        porciones = porc.nextInt();
        System.out.println("Escoja la decoración");
        System.out.println("1. Matrimonio");
        System.out.println("2. Cumpleaños");
        decoracion = porc.nextInt();
        if (decoracion == 1){
            System.out.println("Usted ha escogido el pastel de " + vec + " con " + porciones + " porciones y decoración de Matrimonio");
        }else if (decoracion == 2){
            System.out.println("Usted ha escogido el pastel de " + vec + " con " + porciones + " porciones y decoración de Cumpleaños");
        }
        contador++;
        ventas = cantidad - contador;
        cantidad = ventas;
        System.out.println("Los pasteles disponibles son: " + cantidad);
    }
}
