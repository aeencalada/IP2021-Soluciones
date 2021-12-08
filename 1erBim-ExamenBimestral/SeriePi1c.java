package seriepi1;

import java.util.Scanner;

public class SeriePi1 {

    public static void main(String[] args) {
        // Pregunta 10
        Scanner sc = new Scanner(System.in);
        
        //Variables
        double num_pi, val_ele;
        int n, c, x;
        
        // Ingreso de datos
        System.out.print("Ingrese el número de elementos de la serie: ");
        n = sc.nextInt();

        //Valores iniciales
        num_pi = 3;
        x = 2;
        c = 1;

        //Generación de Pi
        while (c < n) {
            c = c + 1;
            //Calcula elemento
            val_ele = (double) 4 / (x * (x + 1) * (x + 2));
            //Acumula Pi
            if ((c + 1) % 2 != 0) {
                num_pi = num_pi + val_ele;
            } else {
                num_pi = num_pi - val_ele;
            }
            x = x + 2;
        }
        System.out.println("Valor de Pi obtenido: " + num_pi);
    }
}
