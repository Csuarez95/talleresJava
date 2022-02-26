
package com.mycompany.taller2_condicionales;

import java.util.Scanner;


public class Motos {
    
    public String[] motos = new String[3];
    public String[] Smotos = new String[3];
    public int opcion;
    
        public int menuMotos(){
        System.out.println("Bienvenido al taller de motos El Maquinista");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1. Ingresar motos");
        System.out.println("2. Retirar motos");
        System.out.println("3. Salir");
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
        return opcion;
    }
    
        
        public void registroMotos(String nombre, String placa, String observacion){
            motos[0] = nombre;
            motos[1] = placa;
            motos[2] = observacion;
            System.out.println("Registro exitoso");
        }
        
        public void salidaMotos(String placa, String observaciones, String inventario){
            motos[0] = placa;
            motos[1] = observaciones;
            motos[2] = inventario;
            System.out.println("Salida de moto exitoso");
        }
    
}
