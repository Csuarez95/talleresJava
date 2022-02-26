
package com.mycompany.taller2_condicionales;

import java.util.Scanner;

public class Banco {
    
    public String nombres[] = {"Mateo","Pablo","Juan"};
    public int monto[] = {1500000, 1000000, 500000};
    public int opcion, valorIngresado, valorNuevo, montoActual;
    
    public int menuBancos(){
        System.out.println("Bienvenido al banco su banco Fiel");
        System.out.println("Seleccione la opcion que desea realizar");
        System.out.println("1. Ingresos");
        System.out.println("2. Retiros");
        System.out.println("3. Consultas");
        System.out.println("4. Salir");
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
        return opcion;
    }
    
    public void mostrarUsuarios(){
        System.out.println("Los usuarios registrados son: ");
        for (int i=0; i<nombres.length; i++){
            System.out.println((i+1) + "." + nombres[i]);
        }
    }
    
    public void imprimirUsuario(int nombre){
        if (nombre == 1){
            System.out.println("Bienvenido señor: " + nombres[0]);
        } else if (nombre == 2) {
            System.out.println("Bienvenido señor: " + nombres[1]);
        } else if (nombre == 3) {
            System.out.println("Bienvenido señor: " + nombres[2]);
        }
    }
    
    public int registroMonto(int valor, int nombre){
        if (nombre == 1){
            valorIngresado = valor + monto[0];
        } else if (nombre == 2){
            valorIngresado = valor + monto[1];
        } else if (nombre == 3){
            valorIngresado = valor + monto[2];
        }
        System.out.println("El nuevo monto en su cuenta es: " + valorIngresado);
        return valorIngresado;
    }
    
    public int retiroMonto(int valor, int nombre){
        if (nombre == 1){
            valorNuevo = monto[0] - valor;
        } else if (nombre == 2){
            valorNuevo = monto[1] - valor;
        } else if (nombre == 3){
            valorNuevo = monto[2] - valor;
        }
        System.out.println("El nuevo monto en su cuenta es: " + valorNuevo);
        return valorNuevo;
    }
    
    public int traerMonto(int nombre){
        if (nombre == 1){
            montoActual = monto[0];
        } else if (nombre == 2){
            montoActual = monto[1];
        } else if (nombre == 3){
            montoActual = monto[2];
        }
        return montoActual;
    }
}
