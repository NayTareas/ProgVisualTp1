package ar.edu.unju.fi.ejercicio13;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int[] arreglo = new int[8];

	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.println("Ingrese el valor:");
	            arreglo[i] = scanner.nextInt();
	        }

	        System.out.println("indice-->valor");
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.println(i + "-->" + arreglo[i]);
	        }

	        scanner.close();

	}

}
