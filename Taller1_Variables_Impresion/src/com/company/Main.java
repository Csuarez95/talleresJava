package com.company;

import java.util.Scanner;

public class Main {

    public static String nombre, apellido, edad, altura, nombrePadre, nombreMadre, ciudad, pais, nombreMascota, edadMascota, tipoMascota;
    public static int opcion;
    public static boolean control=true;

    public static void main(String[] args) {

        while (control) {
            Persona dato = new Persona();
            Mascota dato1 = new Mascota();
            System.out.println("Bienvenido, por favor seleccione una de las siguientes opciones");
            System.out.println("1. Registrar nombre y apellido");
            System.out.println("2. Registrar nombre, apellido, edad y estatura");
            System.out.println("3. Registrar su nombre y nombre de los padres");
            System.out.println("4. Registrar ciudad capital y país");
            System.out.println("5. Registrar información mascota");
            System.out.println("6. Salir");
            System.out.println("Presione 0 para salir");
            Scanner opcionMenu = new Scanner(System.in);
            opcion = opcionMenu.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ha seleccionado el registro de nombre y apellido");
                    dato.solicitarNombre();
                    nombre = dato.capturarDato();
                    dato.solicitarApellido();
                    apellido = dato.capturarDato();
                    System.out.println("Muchas gracias señor(a) " + nombre + " " + apellido);
                    break;
                }
                case 2 -> {
                    System.out.println("Ha seleccionado el registro de nombre, apellido, edad y estatura");
                    dato.solicitarNombre();
                    nombre = dato.capturarDato();
                    dato.solicitarApellido();
                    apellido = dato.capturarDato();
                    dato.solicitarEdad();
                    edad = dato.capturarDato();
                    dato.solicitarAltura();
                    altura = dato.capturarDato();
                    System.out.println("Muchas gracias señor(a) " + nombre + " " + apellido);
                    System.out.println("Usted ha registrado una edad de " + edad + " años y una estatura de " + altura + " metros");
                    break;
                }
                case 3 -> {
                    System.out.println("Ha seleccionado el registro la familia");
                    dato.solicitarNombre();
                    nombre = dato.capturarDato();
                    dato.solicitarApellido();
                    apellido = dato.capturarDato();
                    System.out.println("Por favor, ingrese el nombre de su padre");
                    nombrePadre = dato.capturarDato();
                    System.out.println("Por favor, ingrese el nombre de su madre");
                    nombreMadre = dato.capturarDato();
                    System.out.println("Yo " + nombre + " " + apellido + ", soy hijo de " + nombreMadre + " y " + nombrePadre);
                    break;
                }
                case 4 -> {
                    System.out.println("Ha seleccionado el registro de la ciudad y el país");
                    System.out.println("Por favor, ingrese la ciudad capital");
                    ciudad = dato.capturarDato();
                    System.out.println("Por favor, ingrese el país");
                    pais = dato.capturarDato();
                    System.out.println("La ciudad " + ciudad + ", es la capital del país " + pais);
                    break;
                }
                case 5 -> {
                    System.out.println("Ha seleccionado el registro de su mascota");
                    dato1.solicitarNombreMascota();
                    nombreMascota = dato1.capturarDato();
                    dato1.solicitarEdad();
                    edadMascota = dato1.capturarDato();
                    dato1.solicitarTipo();
                    tipoMascota = dato1.capturarDato();
                    dato.solicitarNombre();
                    nombre = dato.capturarDato();
                    System.out.println(nombreMascota + " es un(a) " + tipoMascota + ", el cual, tiene " + edadMascota + " años de edad y " + nombre + " es actualmente su dueño(a) ");
                    break;
                }
                case 6 -> {
                    System.out.println("Saliendo del programa");
                    control = false;
                }
                default -> {
                    System.out.println("Opción inválida");
                }
            }
        }
        System.exit(0);
    }
}
