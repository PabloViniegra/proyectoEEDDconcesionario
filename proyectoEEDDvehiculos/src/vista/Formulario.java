package vista;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Formulario {

	public void calculaITV() {
		Scanner sc = new Scanner(System.in);
		int dia = 0, mes = 0, anio = 0;
		System.out.println("___DATOS ITV___");
		System.out.println("Introduce el dia que pasaste la ITV por última vez: ");
		boolean validacion = false;
		while (!validacion) {
			try {
				dia = sc.nextInt();
				validacion = true;
			} catch (InputMismatchException e) {
				System.out.println("Ingresa un numero por favor.");
			} finally {
				sc.nextLine();
			}
		}
		System.out.println("Ahora el mes al que pertenece: ");
		validacion = false;
		while (!validacion) {
			try {
				mes = sc.nextInt();
				validacion = true;
			} catch (InputMismatchException e) {
				System.out.println("Ingresa un numero por favor.");

			} finally {
				sc.nextLine();
			}

			System.out.println("Introduce el año: ");
			validacion = false;
			while (!validacion) {
				try {
					anio = sc.nextInt();
					validacion = true;
				} catch (InputMismatchException e) {
					System.out.println("Ingresa un numero por favor.");
				} finally {
					sc.nextLine();
				}
			}

			sc.close();

			Calendar calendario = new GregorianCalendar();
			int diaActual = dia - calendario.get(Calendar.DAY_OF_MONTH);
			int mesActual = mes - calendario.get(Calendar.MONTH);
			int anioActual = anio - calendario.get(Calendar.YEAR);

			int resultado = diaActual + (mesActual * 30) + (anioActual * 365);
			System.out.println("Te quedan " + resultado + " días para pasar la ITV.");
		}

	}
}
