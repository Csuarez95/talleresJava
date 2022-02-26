package taller3_Ciclos;

import java.util.Scanner;

public class Tabla {
	
	public int i, operacion;
	
	
	public int capturarDato(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
	
	public void solicitarTabla(){
        System.out.println("Ingrese la tabla que desea calcular");
    }
	
	public void solicitarLimite(){
        System.out.println("Ingrese el número hasta el cual desea calcular");
    }
	
	public void tablaMultiplicar(int limite, int tabla) {
		for (i=1; i <= limite; i++) {
			operacion = i * tabla;
			System.out.println(i + " x " + tabla + " = " + operacion);
		}
	}

}
