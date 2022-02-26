package com.company;

import java.util.Scanner;

public class Persona {
    public String nombre;
    public String apellido;
    public String edad;
    public String altura;

    public String capturarDato(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void solicitarNombre(){
        System.out.println("Ingrese su nombre");
    }

    public void solicitarApellido(){
        System.out.println("Ingrese su apellido");
    }

    public void solicitarEdad(){
        System.out.println("Ingrese su edad");
    }

    public void solicitarAltura(){
        System.out.println("Ingrese su altura en metros utilizando punto (.)");
    }
}
