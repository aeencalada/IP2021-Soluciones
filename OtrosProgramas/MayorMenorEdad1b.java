import java.util.Scanner;

public class MayorMenorEdad1b {
	public static void main(String[] args) {
		// Declaración de objetos y variables
		Scanner sc = new Scanner(System.in);
		short anioA, anioN;
		byte edad;
		String mensaje;

		// Entrada de datos
		System.out.print("Ingrese el año de nacimiento: ");
		anioN = sc.nextShort();
		System.out.print("Ingrese el año actual: ");
		anioA = sc.nextShort();

		// Proceso
		edad = (byte)(anioA - anioN);
		if (edad >= 18) {
			mensaje = "MAYOR";
		} else {
			mensaje = "MENOR";						
		}

		// Muestra de datos
		System.out.println("\nUsted es " + mensaje + " DE EDAD");
	}
}

