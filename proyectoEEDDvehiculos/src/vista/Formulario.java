package vista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Formulario {

	public void calculaITV() {
		Scanner sc = new Scanner (System.in); 
		int dia=0, mes=0, anio=0;
		System.out.println("___DATOS ITV___");
		System.out.print("Introduce el dia que pasaste la ITV por última vez: ");
		dia = sc.nextInt();
		System.out.print("Ahora el mes al que pertenece: ");
		mes = sc.nextInt();
		System.out.print("Introduce el año: ");
		anio = sc.nextInt();
		sc.close();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		@Deprecated
		Date miFecha = new Date( dia, mes, anio);
		LocalDate fechalocal = LocalDate.now();
		
		
		System.out.println("Te quedan " + miFecha.compareTo(fechalocal));
	}
	
}
