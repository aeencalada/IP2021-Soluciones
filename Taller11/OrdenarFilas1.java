package ordenarfilas1;

import java.util.Scanner;

public class OrdenarFilas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, aux;

        //Lectura de la  matriz
        System.out.print("Ingrese el número de filas: ");
        n = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        m = sc.nextInt();
        int[][] matriz = new int[n][m];

        System.out.println("\nIngrese valores de la matriz [fila,columna]");
        System.out.println("---------------------------------------------");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar matriz original
        System.out.println("\nLa matriz que usted ingresó es:");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            for (int j = 0; j <= m - 1; j++) {
                System.out.printf("| %3d ", matriz[i][j]);
            }
            System.out.println("|");
        }
        for (int j = 0; j <= m - 1; j++) {
            System.out.print("+-----");
        }
        System.out.println("+");

        // Realizar ordenamiento de filas
        for (int i = 0; i <= n - 1; i++) {
            for (int lim = m - 1; lim >= 1; lim--) {
                for (int j = 0; j <= lim - 1; j++) {
                    if (matriz[i][j] < matriz[i][j + 1]) {
                        aux = matriz[i][j];
                        matriz[i][j] = matriz[i][j + 1];
                        matriz[i][j + 1] = aux;
                    }
                }
            }
        }

        // Mostrar matriz resultante
        System.out.println("\nLa matriz con sus filas ordenadas de mayor a menor es:");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            for (int j = 0; j <= m - 1; j++) {
                System.out.printf("| %3d ", matriz[i][j]);
            }
            System.out.println("|");
        }
        for (int j = 0; j <= m - 1; j++) {
            System.out.print("+-----");
        }
        System.out.println("+");

    }
    
}
