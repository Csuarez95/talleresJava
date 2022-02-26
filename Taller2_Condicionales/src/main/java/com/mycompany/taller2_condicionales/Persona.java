
package com.mycompany.taller2_condicionales;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    public int edad;
    
    public void mayorEdad(int edad){
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}
