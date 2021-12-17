package estadmatriz1;

import java.util.Scanner;

public class EstadMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n, m, cp, ci;
        int suma_par, suma_imp, suma_uco;
        float prom_par, prom_imp, prom_gen;

        //Ingresar el tamaño de la matriz
        System.out.print("¿Cuántas filas tiene la matriz? ");
        n = sc.nextShort();
        System.out.print("¿Cuántas columnas tiene la matriz? ");
        m = sc.nextShort();

        //Definir y dimensionar la matriz
        int[][] m_num = new int[n][m];

        //Poblar la matriz
        System.out.println("\nIngrese los valores de la matriz");
        System.out.println("--------------------------------");
        for (short i = 0; i <= n - 1; i++) {
            for (short j = 0; j <= m - 1; j++) {
                System.out.print("Elemento de la posición [" + (i + 1) + "," + (j + 1) + "]: ");
                m_num[i][j] = sc.nextInt();
            }
        }

        //Obtener estadísticas
        suma_par = 0;
        suma_imp = 0;
        suma_uco = 0;
        cp = 0;
        ci = 0;
        for (short i = 0; i <= n - 1; i++) {
            for (short j = 0; j <= m - 1; j++) {
                if (m_num[i][j] % 2 == 0) {
                    suma_par += m_num[i][j];
                    cp++;
                } else {
                    suma_imp += m_num[i][j];
                    ci++;
                }
                if (j == m - 1) {
                    suma_uco += m_num[i][j];
                }
            }
        }
        prom_par = (float) suma_par / cp;
        prom_imp = (float) suma_imp / ci;
        prom_gen = (float) (suma_par + suma_imp) / (n * m);

        //Mostrar resultados
        System.out.println("\nPromedio pares: " + prom_par);
        System.out.println("Promedio impares: " + prom_imp);
        System.out.println("Promedio general: " + prom_gen);
        System.out.println("Sumatoria última columna: " + suma_uco);
    }
}
