package edades1;

import java.util.Scanner;

public class Edades1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables 
        byte edad;
        short suma, n, c;
        float promedio;

        System.out.println("Ingreso de edades");
        System.out.println("=================");
        // Entrada de datos 
        System.out.print("\n¿Cuantas edades desea ingresar:? ");
        n = sc.nextShort();
        //Datos de entrada iniciales
        suma = 0;
        c = 1;
        //Programacion a la defensiva
        if (n > 0) {
            // Ciclo para detreminar las edades 
            while (c <= n) {
                System.out.print("Ingrese la edad de la persona " + c + " : ");
                edad = sc.nextByte();
                if (edad <= 13) {
                    System.out.println("**Es NIÑO**");
                } else if (edad <= 28) {
                    System.out.println("**Es JOVEN**");
                } else if (edad <= 64) {
                    System.out.println("**Es ADULTO**");
                } else {
                    System.out.println("**Es ADULTO MAYOR**");
                }
                suma = (short) (suma + edad);
                c = (byte) (c + 1);
            }
            promedio = (float) (suma) / (float) (n);
            System.out.println("\nLa edad promedio es de " + promedio + " años");
        } else {
            System.out.println("El número de personas que ingreso es incorrecto");
        }
    }
}
