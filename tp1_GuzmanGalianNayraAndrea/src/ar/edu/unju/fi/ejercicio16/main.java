package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        String[] arreglo = new String[5];

  
        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextLine();
        }

        System.out.println("Los nombres guardados en el arreglo son:");
        int indice = 0;
        while (indice < arreglo.length) {
            System.out.println("Indice N° " + indice + ": " + arreglo[indice]);
            indice++;
        }

        System.out.println("El tamaño del arreglo es: " + arreglo.length);

        byte indiceAEliminar;
        do {
            System.out.println("Ingrese el índice del nombre a eliminar (del 0 al 4):");
            indiceAEliminar = scanner.nextByte();
        } while (indiceAEliminar < 0 || indiceAEliminar >= arreglo.length);

        for (int i = (int) indiceAEliminar; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        arreglo[arreglo.length - 1] = "";

        System.out.println("Se elimino el nombre del arreglo. El arreglo actual es:");
        for (String nombre : arreglo) {
            System.out.println(nombre);
        }

        scanner.close();

	}

}
