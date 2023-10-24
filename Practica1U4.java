/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1u4;

import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class Practica1U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] numeros = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner Practica1U4 = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Calculadora, elige una opcion");
            System.out.println("1. Sumar numeros del arreglo");
            System.out.println("2. Multiplicar numeros del arreglo");
            System.out.println("3. Salir");
            opcion = Practica1U4.nextInt();
            switch (opcion) {
                case 1 -> {
                    double suma = 0;
                    for (int i = 0; i < numeros.length; i++) {
                        suma += numeros[i];

                    }
                    System.out.println("La suma es: " + suma);
                }
                case 2 -> {
                    double multiplicacion = 1;
                    for (int i = 0; i < numeros.length; i++) {
                        multiplicacion *= numeros[i];
                        
                    }
                    System.out.println("L multiplicación es: " + multiplicacion);
                }
                case 3->{
                    System.out.println("Ha salido del programa");
                    
                }
                default->
                    System.out.println("Opcion no valida");
            }

        }while (opcion !=3);
        
        
    }
}
