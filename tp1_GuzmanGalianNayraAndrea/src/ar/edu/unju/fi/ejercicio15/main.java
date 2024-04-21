package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamaño;
		
		do {
		System.out.println("Ingrese un numero del 5 al 10 que determinará el tamaño de su arreglo");
		tamaño= scanner.nextInt();
		}while (tamaño < 5 || tamaño > 10);
		
		String[] arreglo = new String[tamaño];
		
		for (int i = 0; i < arreglo.length; i++) {
	        System.out.println("Ingrese el nombre:");
	        arreglo[i] = scanner.nextLine();
	    }
		
		 System.out.println("indice-->nombre asignado (de primero a último)");
		    for (int i = 0; i < arreglo.length; i++) {
		        System.out.println(i + "-->" + arreglo[i]);
		    }
		 System.out.println("indice-->nombre asignado (de último a primero)");
		    for (int i = arreglo.length -1; i >= 0; i--) {
		        System.out.println(i + "-->" + arreglo[i]);
		    }
		    scanner.close();
	}

}
