
package com.mycompany.taller2_condicionales;


public class IMC {
    
    public float resultado;
    
    public void calculoIMC(float p, float a){
        resultado = p / (a*a);
        System.out.println("Su IMC es: " + resultado);
        if (resultado <= 18.5){
            System.out.println("Su peso es inferior al normal");
        } else if (resultado >= 18.5 && resultado <= 24.9) {
            System.out.println("Su peso está normal");
        } else if (resultado >= 25 && resultado <= 29.9){
            System.out.println("Su peso es superior al normal");
        } else {
            System.out.println("Usted tiene obesidad");
        }
    }
}
