package ar.edu.unju.fi.ejercicio8.main;
import ar.edu.unju.fi.ejercicio8.model.calculadoraespecial;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);       
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();       
        calculadoraespecial calculadora = new calculadoraespecial();
        calculadora.setN(n);    
        System.out.println("La sumatoria es: " + calculadora.calcularsumatoria());      
        System.out.println("La productoria es: " + calculadora.calcularproductoria());

        scanner.close();

	}

}
