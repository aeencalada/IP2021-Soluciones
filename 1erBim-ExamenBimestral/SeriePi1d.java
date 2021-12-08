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
        System.out.print("Ingrese la cantidad de elementos a procesar: ");
        n = sc.nextInt();

        //Valores iniciales
        val_pi = 3;
        x = 2;
        c = 1;

        //Generación de Pi
        while (c < n) {
            //Calcula elemento
            val_ele = (double) 4 / (x * (x + 1) * (x + 2));
            //Calcula Pi
            if ((c + 1) % 2 != 0) {
                val_ele = val_ele * (-1);
            } 
            val_pi = val_pi + val_ele;
            x = x + 2;
            c = c + 1;
        }
        System.out.println("Constante Pi calculada: " + val_pi);
    }
}
