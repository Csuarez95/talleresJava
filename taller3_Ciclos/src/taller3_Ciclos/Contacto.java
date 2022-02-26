package taller3_Ciclos;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacto {
	
	public String nombre;
	public int telefono;
	public String organizacion;
	
	public Contacto(String nombre, int telefono, String organizacion) {
		//super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.organizacion = organizacion;
	}
	
	public ArrayList<Contacto> agregarContacto(Contacto contacto, ArrayList<Contacto> contactos){
		contactos.add(contacto);
		System.out.println("Contacto agregado");
		return contactos;
	}

	public static Contacto capturarDato(ArrayList<Contacto> contactos){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el nombre del contacto");
		String nombre = input.nextLine();
		
		int telefono;

		boolean repetido = true;
		System.out.println("Ingrese el teléfono del contacto");
		telefono = input.nextInt();
		
		while(repetido){
			repetido = false;
			
			for (Contacto a: contactos) {
				if ((telefono) == a.telefono) {
					repetido = true;
					System.out.println("El teléfono ya se encuentra registrado, ingrese uno diferente");
					
					telefono = input.nextInt();
					break;
				} 
			}
		}	
		System.out.println("Ingrese la organización del contacto");
		Scanner input1 = new Scanner(System.in);
		String organizacion = input1.nextLine();
		Contacto cont = new Contacto(nombre, telefono, organizacion);
		return cont;
    }

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nTeléfono: " + telefono + "\nOrganización: " + organizacion + "\n";
	}
	
	
	public static void eliminarDato(int x, ArrayList<Contacto> contactos){
		if (x > contactos.size() || x <= 0) {
			System.out.println("No existe este contacto para eliminar");
		} else {
			contactos.remove(x-1);
			System.out.println("El contacto " + x + " ha sido borrado exitosamente");
		}

	}
	
	
}
