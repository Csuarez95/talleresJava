
package com.mycompany.taller2_condicionales;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        boolean banderaPrincipal = true;
        
        while(banderaPrincipal){
        Menu seleccion = new Menu();
        int opcion = seleccion.menuInicial();
        boolean bandera = true;
        
        switch (opcion){
            case 1 -> {
                System.out.println("Por favor, ingrese su edad");
                Scanner edadTeclado = new Scanner(System.in);
                int edad = edadTeclado.nextInt();
                Persona edadIngresada = new Persona(); //Instanciar la clase.
                edadIngresada.mayorEdad(edad);
                break;
            }
            case 2 -> {
                System.out.println("Por favor, ingrese su edad");
                Scanner edadTeclado = new Scanner(System.in);
                int edad = edadTeclado.nextInt();
                Persona edadIngresada = new Persona(); //Instanciar la clase.
                edadIngresada.mayorEdad(edad);
                break;
            }
            case 3 -> {
                System.out.println("Por favor, ingrese su Nombre");
                Scanner ingreso = new Scanner(System.in);
                String nombre = ingreso.nextLine();
                System.out.println("Por favor, ingrese su Apellido");
                String apellido = ingreso.nextLine();
                System.out.println("Por favor, ingrese su edad");
                int edad = ingreso.nextInt();
                if (edad >= 18) {
                    System.out.println(nombre + " " + apellido + " Usted es mayor de edad, por lo tanto puede entrar a la fiesta");
                } else {
                    System.out.println(nombre + apellido + " Usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa");
                }
                break;
            }
            case 4 ->{
                while (bandera){
                Pelicula opcionPelicula = new Pelicula();
                int opcionP = opcionPelicula.menuPeliculas();
                if (opcionP == 1){
                    opcionPelicula.mostrarPeliculas();
                    System.out.println("Seleccione la pelicula que desea alquilar");
                    Scanner alquiler = new Scanner(System.in);
                    int alquilerP = alquiler.nextInt();
                    opcionPelicula.peliculasDisponibles(alquilerP);
                } else if (opcionP == 2){
                    opcionPelicula.mostrarPeliculas();
                    System.out.println("Seleccione la pelicula que desea devolver");
                    Scanner devolver = new Scanner(System.in);
                    int devolverP = devolver.nextInt();
                    opcionPelicula.devolverPeliculas(devolverP);
                } else if (opcionP == 3){
                    System.out.println("Saliendo del menú de la video tienda");
                    bandera = false;
                } else{
                    System.out.println("Opción inválida");
                }
                }
                break;
            }
            case 5 ->{
                while (bandera){
                Farmacia opcionProducto = new Farmacia();
                int opcionP = opcionProducto.menuProductos();
                if (opcionP == 1){
                    opcionProducto.mostrarProductos();
                    System.out.println("Seleccione el producto que desea adquirir");
                    Scanner alquiler = new Scanner(System.in);
                    int alquilerP = alquiler.nextInt();
                    opcionProducto.productosDisponibles(alquilerP);
                } else if (opcionP == 2){
                    opcionProducto.mostrarProductos();
                    System.out.println("Seleccione el producto que desea devolver");
                    Scanner devolver = new Scanner(System.in);
                    int devolverP = devolver.nextInt();
                    opcionProducto.devolverProducto(devolverP);
                } else if (opcionP == 3){
                    System.out.println("Saliendo del menú de la Droguería Mi Salud");
                    bandera = false;
                } else {
                    System.out.println("Opcion inválida");
                }
                }
                break;
            }
            case 6 ->{
                while(bandera){
                    Motos opcionMoto = new Motos();
                    int opcionM = opcionMoto.menuMotos();
                    if (opcionM == 1){
                        System.out.println("Realice el ingreso de la moto");
                        Scanner moto = new Scanner(System.in);
                        System.out.println("Ingrese el nombre del dueño");
                        String nombre = moto.nextLine();
                        System.out.println("Ingrese la placa de la moto");
                        String placa = moto.nextLine();
                        System.out.println("Ingrese las observaciones del cliente");
                        String observaciones = moto.nextLine();
                        opcionMoto.registroMotos(nombre, placa, observaciones);
                    } else if (opcionM == 2){
                        System.out.println("Registre la salida de la moto moto");
                        Scanner moto = new Scanner(System.in);
                        System.out.println("Ingrese la placa de la moto");
                        String nombre = moto.nextLine();
                        System.out.println("Ingrese las reparaciones realizadas");
                        String placa = moto.nextLine();
                        System.out.println("Ingrese el inventario de repuestos");
                        String observaciones = moto.nextLine();
                        opcionMoto.salidaMotos(nombre, placa, observaciones);
                    }else if (opcionM == 3){
                        System.out.println("Saliendo del menú del taller de Motos");
                        bandera = false;
                    } else {
                        System.out.println("Opcion inválida");
                    }
                }
                break;
            }
            case 7 ->{
                
                    IMC calculoIMC = new IMC();
                    System.out.println("Bienvenido al programa para el cálculo del IMC");
                    Scanner imc = new Scanner(System.in);
                    System.out.println("Ingrese su peso en kilogramos");
                    float peso = imc.nextFloat();
                    System.out.println("Ingrese su altura en metros y usando coma (,)");
                    float altura = imc.nextFloat();
                    calculoIMC.calculoIMC(peso, altura);
                    break;
            }
            
            case 8 ->{
                while(bandera){
                    Pasteleria opcionPastel = new Pasteleria();
                    int opcionM = opcionPastel.menuPastel();
                    if (opcionM == 1){
                        opcionPastel.mostrarPasteles();
                        System.out.println("Seleccione el sabor de pastel que desea");
                        Scanner opcionP = new Scanner(System.in);
                        int seleccionP = opcionP.nextInt();
                        opcionPastel.pastelesDisponibles(seleccionP);
                    } else if (opcionM == 2) {
                        System.out.println("Saliendo del menú de la pasteleria");
                        bandera = false;
                    } else {
                        System.out.println("Opcion inválida");
                    }
                }
                
                break;
            }
            case 9 ->{
                while (bandera){    
                Areas opcionAreas = new Areas();
                    int opcionA = opcionAreas.menuAreas();
                    Scanner datos = new Scanner(System.in);
                    if (opcionA == 1){
                        System.out.println("Ingrese la base del rectángulo");
                        float base = datos.nextFloat();
                        System.out.println("Ingrese la altura del rectángulo");
                        float altura = datos.nextFloat();
                        opcionAreas.areaRectangulo(base, altura);
                    } else if (opcionA == 2){
                        System.out.println("Ingrese la base del triángulo");
                        float base = datos.nextFloat();
                        System.out.println("Ingrese la altura del triángulo");
                        float altura = datos.nextFloat();
                        opcionAreas.areaTriangulo(base, altura);
                    } else if (opcionA == 3){
                        System.out.println("Ingrese la base superior del trapecio");
                        float base = datos.nextFloat();
                        System.out.println("Ingrese la base inferior del trapecio");
                        float base1 = datos.nextFloat();
                        System.out.println("Ingrese la base altura del trapecio");
                        float altura = datos.nextFloat();
                        opcionAreas.areaTrapecio(base, base1, altura);
                    } else if (opcionA == 4) {
                        System.out.println("Saliendo del cálculo de áreas");
                        bandera = false;
                    } else {
                        System.out.println("Opción inválida");
                    }
                }
                break;
            }
            case 10 ->{
                while(bandera){
                int nuevoMonto = 0;
                Banco opcionBanco = new Banco();
                opcionBanco.mostrarUsuarios();
                Scanner datos = new Scanner(System.in);
                System.out.println("Seleccione su usuario: ");
                int nombre = datos.nextInt();
                if (nombre == 4){
                    System.out.println("Usuario no existe");
                    bandera = false;
                } else {
                opcionBanco.imprimirUsuario(nombre);
                int opcionB = opcionBanco.menuBancos();
                if (opcionB == 1){
                    System.out.println("Seleccione el monto que desea agregar");
                    int monto = datos.nextInt();
                    if (monto < 0){
                        System.out.println("No se permite montos negativos");
                    } else if (monto >= 0){
                        //System.out.println("Se ha realizado el ingreso de:" + monto);
                        nuevoMonto = opcionBanco.registroMonto(monto, nombre);
                        System.out.println("Su nuevo monto es: " + nuevoMonto);
                        System.out.println("Gracias por utilizar el servicio");
                    }
                } else if (opcionB == 2){
                    int montoBanco;
                    int saldoNuevo = 0;
                    nuevoMonto = opcionBanco.traerMonto(nombre);
                    System.out.println("El saldo actual de su cuenta es: " + nuevoMonto);
                    System.out.println("Ingrese el monto que desee retirar");
                    montoBanco = opcionBanco.traerMonto(nombre);
                    int montoRetiro = datos.nextInt();
                    if (montoRetiro > montoBanco){
                        System.out.println("Está solicitando un monto mayor al saldo");
                        System.out.println("Saliendo del programa");
                    } else {
                        saldoNuevo = montoBanco - montoRetiro;
                        System.out.println("Su nuevo saldo es: " + saldoNuevo);
                    }
                } else if (opcionB == 3){
                    int montoCuenta;
                    montoCuenta = opcionBanco.traerMonto(nombre);
                    System.out.println("Su saldo actual es: " + montoCuenta);
                } else if (opcionB == 4){
                    System.out.println("Saliendo de la aplicacion");
                    bandera = false;
                } else {
                    System.out.println("Opcion inválida");
                }
                }
            }
                break;
            }
            case 11 -> {
                System.out.println("Saliendo.... Gracias");
                banderaPrincipal = false;
            }
            default -> {
                System.out.println("Opción inválida");
            }
        }
      }
    System.exit(0);  
    }
}

