package vista;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Formulario {

	public void calculaITV() {
		Scanner sc = new Scanner(System.in);
		int dia = 0, mes = 0, anio = 0;
		System.out.println("DATOS ITV");
		System.out.println("\n");
		System.out.println("Introduce la fecha de tu próxima ITV.");
		System.out.println("\n_____________________\n");

		System.out.println("Introduce el día: ");
		boolean validacionDia = false;

		while (!validacionDia) {
			try {
				dia = sc.nextInt();
				validacionDia = true;
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número: ");
			} finally {
				sc.nextLine();
			}
		}

		System.out.println("Introduce el mes: ");
		boolean validacionMes = false;

		while (!validacionMes) {
			try {
				mes = sc.nextInt();
				validacionMes = true;
			} catch (InputMismatchException a) {
				System.out.println("Introduce un número:");

			} finally {
				sc.nextLine();
			}
		}

		System.out.println("Introduce el año: ");
		boolean validacionAnio = false;

		while (!validacionAnio) {
			try {
				anio = sc.nextInt();
				validacionAnio = true;
			} catch (InputMismatchException b) {
				System.out.println("Introduce un número:");
			} finally {
				sc.nextLine();
			}

		}
		sc.close();

		Calendar calendario = new GregorianCalendar();
		int diaActual = dia - calendario.get(Calendar.DAY_OF_MONTH);
		int mesActual = mes - calendario.get(Calendar.MONTH);
		int anioActual = anio - calendario.get(Calendar.YEAR);

		int resultado = (diaActual + (mesActual) + (anioActual * 365));
		System.out.println("Te quedan " + resultado + " días para pasar la ITV.");
	}

}
