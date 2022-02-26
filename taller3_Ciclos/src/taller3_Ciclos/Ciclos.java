package taller3_Ciclos;

import java.util.Scanner;

public class Ciclos {
	
	public int i, j, k;
	
	public int capturarDato(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
	
	public void solicitarDato(){
        System.out.println("Ingrese la cantidad de filas");
    }
	
	public void cicloPara(int asterisco) {
		for (i=1; i<= asterisco;i++) {
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void cicloMientras(int asterisco) {
		i=1;
		while(i<=asterisco) {
			j = asterisco - i;
			while(j >= 0) {
				System.out.print(" ");
				j--;
			}
			k=0;
			while(k < i) {
				System.out.print("*");
				k++;
			}
			System.out.println("");
			i++;
		}
	}
	
	public void cicloHastaQue(int asterisco) {
		i = 0;
		k = 0;
		if (asterisco <= 1) {
			System.out.println("No es posible construir el �rbol");
		} 
		
		//Ciclo para construir el tri�ngulo del �rbol.
		if (asterisco > 1) {
			do {
				j = asterisco - i;
				do {
					System.out.print(" ");
					j--;
				} while (j >= 1);
				k=0;
				do {
					System.out.print("*");
					k++;
				} while (k < ((2 * i) + 1));
				System.out.println();
				i++;
			} while (i < asterisco);
		}
		
		//Construcci�n de base manualmente si el �rbol es de dos o 3 filas.
		if (asterisco == 2) {
			System.out.println("  *");
			System.out.println("  *");
		} else if (asterisco == 3) {
			System.out.println("   *");
			System.out.println("   *");
		}
		
		//Si el �rbol tiene m�s de 4 filas se crea la base con ciclos
		//La posici�n de esta depende de la cantidad de filas.
		
		if (asterisco >= 4) {
			i = 0;
			k = 0;
			do {
				j = asterisco - 1;
				k = 0;
				if (i == 0 || i == 1) {
					do {
						System.out.print(" ");
						j--;
					} while (j >= 1);
					do {
						System.out.print("*");
						k++;
					} while (k < 3);
					System.out.println();
				}
				
				if (i == 2) {
					j = (((2 * asterisco) - 1) - 5) / 2;
					k = 0;
					do {
						System.out.print(" ");
						j--;
					} while (j >= 0);
					do {
						System.out.print("*");
						k++;
					} while (k < ((2 * i) + 1));
					System.out.println();
				}
				
				if (i == 3) {
					j = (((2 * asterisco) - 1) - 7) / 2;
					k = 0;
					do {
						System.out.print(" ");
						j--;
					} while (j >= 0 );
					do {
						System.out.print("*");
						k++;
					} while (k < ((2 * i) + 1));
					System.out.println();
				}
				i++;
			} while (i <= 3);
		}
	}
}
