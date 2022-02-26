package taller3_Ciclos;

import java.util.ArrayList;
import java.util.Scanner;

public class Parqueadero {
	
	public String nombre;
	public int telefono;
	public String placa;
	public String marca;
	
	public Parqueadero(String nombre, int telefono, String placa, String marca) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.placa = placa;
		this.marca = marca;
	}

	public ArrayList<Parqueadero> agregarVehiculo(Parqueadero parqueadero, ArrayList<Parqueadero> parqueaderos){
		parqueaderos.add(parqueadero);
		System.out.println("Vehículo ingresado");
		return parqueaderos;
	}

	public static Parqueadero capturarDato(ArrayList<Parqueadero> parqueaderos){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el nombre dueño del vehículo");
		String nombre = input.nextLine();
		
		System.out.println("Ingrese el teléfono del dueño del vehículo");
		int telefono = input.nextInt();
		
		String placa;

		boolean repetido = true;
		System.out.println("Ingrese la placa del vehículo de la siguiente forma AAA-###");
		Scanner input1 = new Scanner(System.in);
		placa = input1.nextLine();
		
		while(repetido){
			repetido = false;
			for (Parqueadero a: parqueaderos) {
				if (placa.equals(a.placa)) {
					repetido = true;
					System.out.println("El vehículo ya se encuentra en el parqueadero, ingrese nuevamente la placa");
					
					placa = input1.nextLine();
					break;
				} 
			}
		}	
		System.out.println("Ingrese la marca del vehículo");
		String marca = input1.nextLine();
		Parqueadero cont = new Parqueadero(nombre, telefono, placa, marca);
		return cont;
    }

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nTeléfono: " + telefono + "\nPlaca: " + placa + "\nMarca: " + marca + "\n";
	}
	
	
	public static void eliminarDato(int x, ArrayList<Parqueadero> parqueaderos){
		if (x > parqueaderos.size() || x <= 0) {
			System.out.println("Este vehículo no se encuentra en el parqueadero ");
		} else {
			parqueaderos.remove(x-1);
			System.out.println("El vehículo ha sido retirado del parqueadero");
		}

	}

}
