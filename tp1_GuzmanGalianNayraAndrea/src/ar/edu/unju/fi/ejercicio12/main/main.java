package ar.edu.unju.fi.ejercicio12.main;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.persona;

public class main {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Ingrese el nombre de la persona:");
		        String nombre = scanner.nextLine();

		        System.out.println("Ingrese la fecha de nacimiento (en formato dd/mm/yyyy):");
		        String fechaNacimientoStr = scanner.nextLine();

		        Calendar fechaNacimiento = Calendar.getInstance();
		        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		        try {
		            fechaNacimiento.setTime(sdf.parse(fechaNacimientoStr));
		        } catch (Exception e) {
		            System.out.println("Error al parsear la fecha de nacimiento.");
		            e.printStackTrace();
		            return;
		        }

		        persona persona = new persona(nombre, fechaNacimiento);

		        System.out.println("Nombre: " + persona.getNombre());
		        System.out.println("Fecha de nacimiento: " + sdf.format(persona.getFechaNacimiento().getTime()));
		        System.out.println("Edad: " + persona.calcularEdad() + " años");
		        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
		        System.out.println("Estación: " + persona.determinarEstacion());

		        scanner.close();
		    }

	}

