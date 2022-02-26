package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean banderaPrincipal = true;

        while (banderaPrincipal){
            Menu seleccion = new Menu();
            int opc = seleccion.menuInicial();
            boolean bandera = true;
            Scanner lecturaTeclado = new Scanner(System.in);

            switch (opc){
                case 1 -> {
                    while(bandera) {
                        System.out.println("Ingrese el tamaño del arreglo entre 1 y 20");
                        int tamano = lecturaTeclado.nextByte();
                        if ((tamano > 0) && (tamano <= 20)) {
                            Arreglo vector = new Arreglo();
                            vector.llenadoVector(tamano);
                            bandera = false;
                        } else {
                            System.out.println("Ingresó un tamaño fuera del rango");
                        }
                    }
                }
                case 2 -> {
                    Arreglo vector = new Arreglo();
                    vector.llenadoAleatorio();
                }
                case 3 -> {
                    int i, contador;
                    for (int num = 1; num < 1000; num++) {
                        i = 1;
                        contador = 0;
                        while (i <= num){
                            if ((num % i) == 0){
                                contador++;
                            }
                        i++;
                        }
                        if(contador == 2){
                            System.out.print(num + ", ");
                        }
                    }
                }
                case 4 -> {
                    while(bandera) {
                        System.out.println("Ingrese el número de filas mayores a 0 y menores o iguales a 10");
                        int fila = lecturaTeclado.nextInt();
                        System.out.println("Ingrese el número de columnas mayores a 0 y menores o iguales a 10");
                        int columna = lecturaTeclado.nextInt();
                        Matriz mat = new Matriz();
                        if ((fila <= 0) || (fila > 10) || (columna <= 0) || (columna > 10)) {
                            System.out.println("Ingresó parámetro inválido, inicie nuevamente");
                        } else {
                            mat.llenadoMatriz(fila, columna);
                            bandera = false;
                        }
                    }
                }
                case 5 -> {
                    while (bandera) {
                        System.out.println("        |                           COLUMNAS                                   |");
                        System.out.println("        |  0   |  1   |  2   |  3   |  4   |  5   |  6   |  7   |  8   |  9    |");
                        System.out.println("    | 0 | 1x1  | 2x1  | 3x1  | 4x1  | 5x1  | 6x1  | 7x1  | 8x1  | 9x1  | 10x1  |");
                        System.out.println("    | 1 | 1x2  | 2x2  | 3x2  | 4x2  | 5x2  | 6x2  | 7x2  | 8x2  | 9x2  | 10x2  |");
                        System.out.println("  F | 2 | 1x3  | 2x3  | 3x3  | 4x3  | 5x3  | 6x3  | 7x3  | 8x3  | 9x3  | 10x3  |");
                        System.out.println("  I | 3 | 1x4  | 2x4  | 3x4  | 4x4  | 5x4  | 6x4  | 7x4  | 8x4  | 9x4  | 10x4  |");
                        System.out.println("  L | 4 | 1x5  | 2x5  | 3x5  | 4x5  | 5x5  | 6x5  | 7x5  | 8x5  | 9x5  | 10x5  |");
                        System.out.println("  A | 5 | 1x6  | 2x6  | 3x6  | 4x6  | 5x6  | 6x6  | 7x6  | 8x6  | 9x6  | 10x6  |");
                        System.out.println("  S | 6 | 1x7  | 2x7  | 3x7  | 4x7  | 5x7  | 6x7  | 7x7  | 8x7  | 9x7  | 10x7  |");
                        System.out.println("    | 7 | 1x8  | 2x8  | 3x8  | 4x8  | 5x8  | 6x8  | 7x8  | 8x8  | 9x8  | 10x8  |");
                        System.out.println("    | 8 | 1x9  | 2x9  | 3x9  | 4x9  | 5x9  | 6x9  | 7x9  | 8x9  | 9x9  | 10x9  |");
                        System.out.println("    | 9 | 1x10 | 2x10 | 3x10 | 4x10 | 5x10 | 6x10 | 7x10 | 8x10 | 9x10 | 10x10 |");
                        System.out.println("\n Ingrese la operación que desee consultar");
                        System.out.println("Ingrese la fila");
                        Matriz mat = new Matriz();
                        int fila = lecturaTeclado.nextInt();
                        System.out.println("Ingrese la columna");
                        int columna = lecturaTeclado.nextInt();
                        if ((fila < 0) || (fila > 9) || (columna < 0) || (columna > 9)){
                            System.out.println("Ingresó valores erróneos de fila o columna");
                        } else {
                            mat.calculoTabla(fila, columna);
                            bandera = false;
                        }

                    }
                }
                case 6 -> {
                    System.out.println("Saliendo del programa");;
                    banderaPrincipal = false;
                }
                default ->{
                    System.out.println("Opcion inválida");
                }

            }

        }
    }
}
