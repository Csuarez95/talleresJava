
package com.mycompany.taller2_condicionales;

import java.util.Scanner;

public class Pelicula {
    
    public String peliculas[] = {"Avatar", "Titanic", "Avengers"};
    public int opcion;
    public String comentario;
    
    public int menuPeliculas(){
        System.out.println("Bienvenido a la video tienda El Porvenir");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1. Consultar películas disponibles");
        System.out.println("2. Recibir películas");
        System.out.println("3. Salir");
        Scanner opcionMenu = new Scanner(System.in);
        opcion = opcionMenu.nextInt();
        return opcion;
    }
    
    public void mostrarPeliculas(){
        System.out.println("La peliculas disponibles son: ");
        for (int i=0; i<peliculas.length; i++){
            System.out.println((i+1) + "." + peliculas[i]);
        }
    }
    
    public void peliculasDisponibles(int pelicula){
        if (pelicula == 1){
            System.out.println("Usted ha escogido la pelicula: " + peliculas[0]);
        }else if (pelicula == 2){
            System.out.println("Usted ha escogido la pelicula: " + peliculas[1]);
        }else if (pelicula == 3){
            System.out.println("Usted ha escogido la pelicula: " + peliculas[2]);
        }else{
            System.out.println("Opcion errónea");
        }
    }
    
        public void devolverPeliculas(int pelicula){
        if (pelicula == 1){
            System.out.println("Usted ha devuelto la pelicula: " + peliculas[0]);
        }else if (pelicula == 2){
            System.out.println("Usted ha devuelto la pelicula: " + peliculas[1]);
        }else if (pelicula == 3){
            System.out.println("Usted ha devuelto la pelicula: " + peliculas[2]);
        }else{
            System.out.println("Opcion errónea");
        }
        System.out.println("¿Desea añadir un comentario con la devolución?");
        System.out.println("1. Si // 2. No");
        Scanner opcion = new Scanner(System.in);
        int opcionComentario = opcion.nextInt();
        if (opcionComentario == 1){
            System.out.println("Ingrese su comentario");
            Scanner opcioonC = new Scanner(System.in);
            comentario = opcioonC.nextLine();
            System.out.println("Gracias por su comentario");
        } else{
            System.out.println("Gracias por preferirnos");
        }
    }
    
}
