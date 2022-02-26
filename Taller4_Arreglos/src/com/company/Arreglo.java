package com.company;

import java.util.Random;
import java.util.Scanner;

public class Arreglo {

    public int vector[] = new int[20];
    public int par[] = new int[20];
    public int impar[] = new int[20];

    public void llenadoVector(int tamano){
        for (int i = 0; i < tamano; i++) {
            System.out.println("Ingrese el número de la posición " + (i + 1));
            Scanner valores = new Scanner(System.in);
            vector[i] = valores.nextInt();
        }
        System.out.println("El arreglo resultante es: ");
        for (int j = 0; j < tamano; j++) {
            System.out.println("[" + j + "] = " + vector[j]);
        }
    }

    public void llenadoAleatorio(){
        //Llenado de vector.
        int tamano = 20, i = 0, numeroAleatorio, contadorPar = 0, contadorImpar = 0;
        while (i < tamano){
            Random rd = new Random();
            numeroAleatorio = rd.nextInt(100) + 1;
            vector[i] = numeroAleatorio;
            System.out.println("[ " + i + " ] = " + vector[i]);
            i++;
        }
        //Llenado de vector pares e impares
        for (int j = 0; j < tamano; j++) {
            int tipoNumero;
            tipoNumero = vector[j];
            if ((tipoNumero % 2) == 0 ){
                par[contadorPar] = tipoNumero;
                contadorPar++;
            } else {
                impar[contadorImpar] = tipoNumero;
                contadorImpar++;
            }
        }
        System.out.println("La cantidad de números pares es: " + contadorPar);
        System.out.print("Números pares: ");

        for (int k = 0; k <= (contadorPar - 2); k++) {
            System.out.print(par[k] + ", ");
        }
        System.out.print(par[contadorPar - 1]);

        System.out.println("\nLa cantidad de números impares es: " + contadorImpar);
        System.out.print("Números impares: ");

        for (int l = 0; l <= (contadorImpar - 2); l++) {
            System.out.print(impar[l] + ", ");
        }
        System.out.print(impar[contadorImpar - 1] + " \n ");
    }

}
