
package com.mycompany.taller2_condicionales;

import java.util.Scanner;


public class Menu {
    
    public int opcion;
    
    public int menuInicial(){
        
        System.out.println("\nBienvenido, por favor seleccione una de las siguientes opciones");
        System.out.println("1. Definir mayor de edad");
        System.out.println("2. Definir menor de edad");
        System.out.println("3. Imprimir mensaje mayor o menor de edad");
        System.out.println("4. Video tienda El Porvenir");
        System.out.println("5. Droguería Mi Salud");
        System.out.println("6. Taller Motos El Maquinista");
        System.out.println("7. Cálculo IMC");
        System.out.println("8. Pastelería");
        System.out.println("9. Calculo áreas");
        System.out.println("10. Su banco fiel");
        System.out.println("11. Salir");
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
        return opcion;
    }
    
}
