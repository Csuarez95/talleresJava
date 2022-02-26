package com.company;

import java.util.Scanner;

public class Mascota {

    public String nombre;
    public int edad;
    public String tipo;

    public String capturarDato(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void solicitarNombreMascota(){
        System.out.println("Ingrese el nombre de la mascota");
    }

    public void solicitarEdad(){
        System.out.println("Ingrese la edad de la mascota en años");
    }

    public void solicitarTipo(){
        System.out.println("Ingrese el tipo de mascota");
    }
}
