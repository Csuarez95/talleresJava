package taller3_Ciclos;

import java.util.ArrayList;
import java.util.Scanner;

public class Escuela {
	
	public String nombre;
	public int edad;
	public boolean prueba;
	public boolean aprobacion;
	
	public Escuela(String nombre, int edad, boolean prueba, boolean aprobacion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.prueba = prueba;
		this.aprobacion = aprobacion;
	}

	public ArrayList<Escuela> agregarPersona(Escuela escuela, ArrayList<Escuela> escuelas){
		escuelas.add(escuela);
		System.out.println("Usuario ingresado");
		return escuelas;
	}

	public static Escuela capturarDato(ArrayList<Escuela> escuelas){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el nombre del usuario");
		String nombre = input.nextLine();
		
		System.out.println("Ingrese la edad del usuario");
		int edad = input.nextInt();
		
		System.out.println("Registre si el usuario presentó o no la prueba \nIngrese true para si o ingrese false para no");
		Scanner input1 = new Scanner(System.in);
		boolean prueba = input1.nextBoolean();

		System.out.println("Registre si el usuario aprobó el examen \nIngrese true para si o ingrese false para no");
		boolean aprobacion = input1.nextBoolean();
		Escuela cont = new Escuela(nombre, edad, prueba, aprobacion);
		return cont;
    }

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + " años \n¿Presentó prueba?: " + prueba + "\n¿Aprobó curso?: " + aprobacion + "\n";
	}
	
	
	public static void eliminarDato(int x, ArrayList<Escuela> escuelas){
		if (x > escuelas.size() || x <= 0) {
			System.out.println("No hay usuarios registrados ");
		} else {
			escuelas.remove(x-1);
			System.out.println("Se ha borrado al usuario del sistema");
		}

	}

}
