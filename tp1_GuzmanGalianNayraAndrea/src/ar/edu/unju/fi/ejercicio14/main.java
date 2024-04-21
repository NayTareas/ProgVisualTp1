package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int tamaño;
	
	do {
	System.out.println("Ingrese un numero del 3 al 10 que determinará el tamaño de su arreglo");
	tamaño= scanner.nextInt();
	}while (tamaño < 3 || tamaño > 10);
	
	int[] arreglo = new int [tamaño];
	int suma=0;
	
	for (int i = 0; i < arreglo.length; i++) {
        System.out.println("Ingrese el valor:");
        arreglo[i] = scanner.nextInt();
        suma +=  arreglo[i];
    }
  
    System.out.println("indice-->valor");
    for (int i = 0; i < arreglo.length; i++) {
        System.out.println(i + "-->" + arreglo[i]);
    }
    System.out.println("La suma de los valores es: " + suma);
    scanner.close();
    
	}
	
}
