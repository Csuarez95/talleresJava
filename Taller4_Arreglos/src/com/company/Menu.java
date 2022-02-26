package com.company;

import java.util.Scanner;

public class Menu {

    public int opcion;

    public int menuInicial(){
        System.out.println("\nBienvenido al taller de arreglos, seleccione una de las opciones");
        System.out.println("1. Tamaño arreglo");
        System.out.println("2. Arreglo 20 posiciones");
        System.out.println("3. Números primos");
        System.out.println("4. Matriz bidimensional");
        System.out.println("5. Tablas de multiplicar");
        System.out.println("6. Salir");
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
        return opcion;
    }
}
