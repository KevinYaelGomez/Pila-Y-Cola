import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pila stack = new Pila();
		int data, option = 0;

		do {
			System.out.println("\nMENU:");
			System.out.println("1. Push (meter).");
			System.out.println("2. Pop (sacar).");
			System.out.println("3. Mostrar los elementos de la pila.");
			System.out.println("0. Salir.");
			System.out.print("Escoge una opción: ");
			option = in.nextInt();
			switch (option) {
				case 1:
					System.out.print("\nIngresa el dato: ");
					data = in.nextInt();
					stack.push(data);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					stack.showData();
					break;
				case 0:
					System.out.println("\nFinalizacion del programa...\n");
					break;
				default:
					System.out.println("\nERROR: Opción no válida...");
			}
		} while (option != 0);

		in.close();
	}
}
