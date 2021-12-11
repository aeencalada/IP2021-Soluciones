package edades2;

import java.util.Scanner;

public class Edades2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c, edad, mayor, menor;
        System.out.println("Ingreso de edades");
        System.out.println("=================");
        System.out.print("\n¿Cuántas edades va a ingresar?: ");
        n = sc.nextInt();
        System.out.println();
        c = 0;
        mayor = 0;
        menor = 0;
        while (c < n) {
            c = c + 1;
            System.out.print("Ingrese la edad de la persona " + c + ": ");
            edad = sc.nextInt();
            if (mayor < edad || c == 1) {
                mayor = edad;
            }
            if (menor > edad || c == 1) {
                menor = edad;

            }
            if (edad < 0) {
                System.out.println("Error, ingresar un número mayor a 0");
            } else if (edad < 14) {
                System.out.println("** Es NIÑO **");
            } else if (edad < 18) {
                System.out.println("** Es ADOLECENTE **");
            } else if (edad < 26) {
                System.out.println("** Es JOVEN **");
            } else if (edad < 65) {
                System.out.println("** Es ADULTO **");
            } else {
                System.out.println("** Es ADULTO MAYOR **");
            }

        }
        System.out.println("\nLa edad más alta es " + mayor + " años y la más baja es " + menor + " años");
    }
}
