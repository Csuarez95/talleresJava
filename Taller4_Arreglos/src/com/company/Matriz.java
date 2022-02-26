package com.company;

public class Matriz {

    int matriz[][] = new int[10][10];
    int valorNumero = 1;

    public void llenadoMatriz(int fila, int columna){
        System.out.println("La matriz resultante es: ");
        int i = 0, j = 0;
        for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                matriz[i][j] = valorNumero + j;
                if (matriz[i][j] <= 9){
                    System.out.print("0" + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
            valorNumero = valorNumero + j;
        }
        valorNumero = 1;
        System.out.println("------------------");
        for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                if ((i % 2) == 0){
                    matriz[i][j] = valorNumero + j;
                    if (matriz[i][j] <= 9){
                        System.out.print("0" + matriz[i][j] + " ");
                    } else {
                        System.out.print(matriz[i][j] + " ");
                    }
                } else {
                    matriz[i][j] = (valorNumero + (columna - 1)) - j;
                    if (matriz[i][j] <= 9){
                        System.out.print("0" + matriz[i][j] + " ");
                    } else {
                        System.out.print(matriz[i][j] + " ");
                    }
                }
            }
            System.out.println("");
            valorNumero = valorNumero + j;
        }
    }

    public void calculoTabla(int fila, int columna){
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9 ; j++) {
                matriz[i][j] = (i + 1) * ( j + 1);
            }
        }
        System.out.println("La operación realizada es:" + matriz[fila][columna]);
    }


}
