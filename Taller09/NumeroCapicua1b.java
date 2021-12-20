package numerocapicua1b;

import java.util.Scanner;

public class NumeroCapicua1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num, num2, cociente, cant_digitos;

        System.out.print("Ingrese un número entero positivo: ");
        num = sc.nextInt();

        // Contar dígitos
        cociente = num;
        cant_digitos = 0;
        while (cociente > 0) {
            cant_digitos++;
            cociente = cociente / 10;
        }

        // Generar num2 sentido inverso
        num2 = 0;
        cociente = num;
        for (i = cant_digitos - 1; i >= 0; i--) {
            num2 = num2 + (int) Math.pow(10, i) * (cociente % 10);
            cociente = cociente / 10;
        }

        if (num == num2) {
            System.out.println("\nEl número " + num + " es capicúa");
        } else {
            System.out.println("\nEl número " + num + " no es capicúa");
        }
    }

}
