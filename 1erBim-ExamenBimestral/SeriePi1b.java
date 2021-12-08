package seriepi1;

import java.util.Scanner;

public class SeriePi1 {

    public static void main(String[] args) {
        // Pregunta 10
        Scanner sc = new Scanner(System.in);
        
        //Variables
        double val_pi, val_ele;
        int n, c, x;
        
        // Ingreso de datos
        System.out.print("Ingrese el número de elementos de la serie: ");
        n = sc.nextInt();

        //Valores iniciales
        val_pi = 3;
        x = 2;
        c = 1;

        //Generación de Pi
        while (c < n) {
            //Calcula elemento
            val_ele = (double) 4 / (x * (x + 1) * (x + 2));
            //Acumula Pi
            if ((c + 1) % 2 == 0) {
                val_pi = val_pi + val_ele;
            } else {
                val_pi = val_pi - val_ele;
            }
            x = x + 2;
            c = c + 1;
        }
        System.out.println("Valor de Pi obtenido: " + val_pi);
    }
}
