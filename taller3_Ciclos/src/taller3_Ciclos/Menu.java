package taller3_Ciclos;

import java.util.Scanner;

public class Menu {
	
	public int opcion;
	
	public int menuInicial() {
		System.out.println("Bienvenido, por favor seleccione una de las siguientes opciones");
        System.out.println("1. Ciclo Para (for)");
        System.out.println("2. Ciclo mientras (while)");
        System.out.println("3. Ciclo repetir (do-while)");
        System.out.println("4. Tabla de multiplicar");
        System.out.println("5. Menú infinito");
        System.out.println("6. Agenda telefónica");
        System.out.println("7. Parqueadero");
        System.out.println("8. Escuela automovilística");
        System.out.println("9. Salir");
        
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
		return opcion;
	}

}
