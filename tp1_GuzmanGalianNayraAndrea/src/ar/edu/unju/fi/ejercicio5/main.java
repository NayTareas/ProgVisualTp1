package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero del el 1 al 9");
		int num = scanner.nextInt();
				if (num<1 || num>9) {
					System.out.println("el numero esta fuera del rango solicitado");
				}else {
					for (int i = 0; i <= 10; i++) {
						System.out.println(num + " x " + i + " = "+ (num*i));
					}
				}
				scanner.close();

	}

}
