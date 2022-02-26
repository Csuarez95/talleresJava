
package com.mycompany.taller2_condicionales;

import java.util.Scanner;

public class Areas {
    
    public float area;
    public int opcion;
    
    public int menuAreas(){
        System.out.println("Bienvenido");
        System.out.println("Seleccione el área que desea calcular:");
        System.out.println("1. Area rectángulo");
        System.out.println("2. Area triangulo");
        System.out.println("3. Area trapecio");
        System.out.println("4. Salir");
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
        return opcion;
    }
    
    public void areaRectangulo(float base, float altura){
        area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
    
    public void areaTriangulo(float base, float altura){
        area = (base * altura) / 2;
        System.out.println("El área del triangulo es: " + area);
    }
    
    public void areaTrapecio(float base, float altura, float base2){
        area = ((base + base2) * altura) / 2;
        System.out.println("El área del trapecio es: " + area);
    }
    
}
