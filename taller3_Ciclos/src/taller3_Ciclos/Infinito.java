package taller3_Ciclos;

import java.util.Scanner;

public class Infinito {
	
	public int seleccion;
	
	public int menuSeleccion() {
		System.out.println("Bienvenido al menu de usuario");
	    System.out.println("Seleccione una opción");
		System.out.println("1. Capturar nombre");
	    System.out.println("2. Saludar persona");
	    System.out.println("3. Salir del sistema");
	    
	    Scanner opcionMenu = new Scanner(System.in);
	    seleccion = opcionMenu.nextInt();
	    return seleccion;
	}
	
	public String capturarDato(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
	

}
