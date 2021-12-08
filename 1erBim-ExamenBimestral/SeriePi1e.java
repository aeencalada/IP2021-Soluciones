package seriepi1;

import java.util.Scanner;

public class SeriePi1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Variables 
        float const_pi , ele ;
        short n , c , x ;
        //Entrada de datos 
        System.out.print("Ingrese la cantidad de elementos a procesar: ");
        n = sc.nextShort();
        //Valores iniciales
        const_pi = 3;
        x = 0;
        c = 2;
        // Generación de Pi
        while (c <= n){
            x = (short) (x+2);
            //Calcula elemento
            ele = (float)(4)/(float)(((x+2)*(x+1)*x));
            // Calcula Pi
            if (c % 2 != 0){
                ele = ele * (-1);
            }
            const_pi = (float)(const_pi + ele);
            c = (short) (c +1) ;
        }
        System.out.println("Constante Pi calculada: "+const_pi);
    } 
}

