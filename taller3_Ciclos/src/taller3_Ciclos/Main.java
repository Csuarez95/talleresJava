package taller3_Ciclos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean banderaPrincipal = true;
		boolean bandera = true;
		int opcion;
		
		while(banderaPrincipal) {
			Menu seleccion = new Menu();
			opcion = seleccion.menuInicial();
			Ciclos dato = new Ciclos();
			Tabla valor = new Tabla();
			
			switch(opcion) {
			case 1:
				dato.solicitarDato();
				int dat = dato.capturarDato();
				dato.cicloPara(dat);
				break;
				
			case 2:
				dato.solicitarDato();
				int dat1 = dato.capturarDato();
				dato.cicloMientras(dat1);
				break;
				
			case 3:
				dato.solicitarDato();
				int dat2 = dato.capturarDato();
				dato.cicloHastaQue(dat2);
				break;
			
			case 4:
				valor.solicitarTabla();
				int tabla = valor.capturarDato();
				valor.solicitarLimite();
				int limite = valor.capturarDato();
				valor.tablaMultiplicar(limite, tabla);
				break;
			
			case 5:
				bandera = true;
				String nombre = "";
				while(bandera) {
					Infinito opcionMenu = new Infinito();
					int seleccionPersona = opcionMenu.menuSeleccion();
					switch(seleccionPersona) {
					case 1:
						System.out.println("Ingrese su nombre");
						nombre = opcionMenu.capturarDato();
						System.out.println("Bienvenido señor(a)" + nombre);
						break;
					case 2:
						if (nombre == "") {
							System.out.println("No ha registrado su nombre, por favor registrarlo en la opcion 1");
						} else {
							System.out.println("Hola " + nombre + ", espero se encuentre bien en este día");
						}
						break;
					case 3:
						if (nombre == "") {
							System.out.println("Muchas gracias por su tiempo, vuelva pronto");
						} else {
							System.out.println("Muchas gracias por su tiempo señor(a) " + nombre);
						}
						bandera = false;
						break;
					default:
						System.out.print("Ingresó opcion inválida");
					}
				}
				break;
			
			case 6:
				bandera = true;
				ArrayList<Contacto> lista = new ArrayList<Contacto>();
				while (bandera) {
					System.out.println("Bienvenido a la agenda telefónica, seleccione la opción ");
					System.out.println("1. Agregar contactos\n2. Consultar contacto\n3. Eliminar contacto\n4. Salir");
					Scanner input = new Scanner(System.in);
					int opcion6 = input.nextInt();
					switch(opcion6) {
					case 1:
						if (lista.size() == 3) {
							System.out.println("No hay espacio para agregar contactos");
						} else {
							 Contacto contacto = Contacto.capturarDato(lista);
							 contacto.agregarContacto(contacto, lista);
							 
						}
						break;
					case 2:
						if (lista.isEmpty()) {
							System.out.println("No hay contactos agregados");
						} else {
							int i = 1;
							for (Contacto a: lista) {
								System.out.println("Contacto: " + i);
								System.out.println(a.toString());
								i++;
							}
						}
						break;
					case 3:
						if (lista.isEmpty()) {
							System.out.println("No hay contactos para eliminar");
						} else {
							int i = 1;
							System.out.println("Seleccione el contacto que desea eliminar");
							for (Contacto a: lista) {
								System.out.println("Contacto: " + i);
								System.out.println(a.toString());
								i++;
							}
							int borrar = input.nextInt();
							Contacto.eliminarDato(borrar, lista);
						}
						break;
					case 4:
						System.out.print("Saliendo del programa\n");
						bandera = false;
						break;
					default:
						System.out.println("Ingresó opción inválida");
					
					}
				}
				break;
			
			case 7:
				bandera = true;
				ArrayList<Parqueadero> lista1 = new ArrayList<Parqueadero>();
				while (bandera) {
					System.out.println("Bienvenido al parqueadero El Guardián, seleccione la opción ");
					System.out.println("1. Ingresar vehículo\n2. Consultar vehículos en parqueadero\n3. Retirar vehículo\n4. Salir");
					Scanner input = new Scanner(System.in);
					int opcion7 = input.nextInt();
					switch(opcion7) {
					case 1:
						if (lista1.size() == 5) {
							System.out.println("No hay espacio para ingresar más vehículos");
						} else {
							 Parqueadero parqueadero = Parqueadero.capturarDato(lista1);
							 parqueadero.agregarVehiculo(parqueadero, lista1);
							 
						}
						break;
					case 2:
						if (lista1.isEmpty()) {
							System.out.println("No hay vehículos en el parqueadero");
						} else {
							int i = 1;
							for (Parqueadero a: lista1) {
								System.out.println("Registro: " + i);
								System.out.println(a.toString());
								i++;
							}
						}
						break;
					case 3:
						if (lista1.isEmpty()) {
							System.out.println("No hay vehículos para retirar");
						} else {
							int i = 1;
							System.out.println("Seleccione el vehículo que desea retirar");
							for (Parqueadero a: lista1) {
								System.out.println("Registro: " + i);
								System.out.println(a.toString());
								i++;
							}
							int borrar = input.nextInt();
							Parqueadero.eliminarDato(borrar, lista1);
						}
						break;
					case 4:
						System.out.print("Saliendo del programa\n");
						bandera = false;
						break;
					default:
						System.out.println("Ingresó opción inválida");
					
					}
				}
				break;
			
			case 8:
				bandera = true;
				ArrayList<Escuela> lista2 = new ArrayList<Escuela>();
				while (bandera) {
					System.out.println("Bienvenido a la Escuela Automovilística, seleccione la opción ");
					System.out.println("1. Registrar Usuario\n2. Consultar usuarios\n3. Borrar usuario\n4. Salir");
					Scanner input = new Scanner(System.in);
					int opcion8 = input.nextInt();
					switch(opcion8) {
					case 1:
						if (lista2.size() == 8) {
							System.out.println("No hay espacio para registrar más usuarios");
						} else {
							Escuela escuela = Escuela.capturarDato(lista2);
							escuela.agregarPersona(escuela, lista2);
						}
						break;
					case 2:
						if (lista2.isEmpty()) {
							System.out.println("No hay usuarios registrados");
						} else {
							int i = 1;
							for (Escuela a: lista2) {
								System.out.println("Usuario: " + i);
								System.out.println(a.toString());
								i++;
							}
						}
						break;
					case 3:
						if (lista2.isEmpty()) {
							System.out.println("No hay usuarios para borrar");
						} else {
							int i = 1;
							System.out.println("Seleccione el usuario que desea borrar");
							for (Escuela a: lista2) {
								System.out.println("Usuario: " + i);
								System.out.println(a.toString());
								i++;
							}
							int borrar = input.nextInt();
							Escuela.eliminarDato(borrar, lista2);
						}
						break;
					case 4:
						System.out.print("Saliendo del programa\n");
						bandera = false;
						break;
					default:
						System.out.println("Ingresó opción inválida");
					
					}
				}
				break;
			case 9:
				System.out.println("Saliendo del programa");
				banderaPrincipal = false;
				break;
			default:
				System.out.println("Opcion inválida, ingrese nuevamente");
			}
			
		}
		System.exit(0);
	}

}
