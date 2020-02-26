package vista;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import modelo.Autobus;
import modelo.Camion;
import modelo.Coche;
import modelo.Moto;

/**
 * Implementa la vista y toda interacción con el usuario.
 * @author grupo
 *
 */
public class Formulario {
	/**
	 * Calcula los días que te quedan para pasar la ITV de tu vehículo. No devuelve ningún valor.
	 */
	public void calculaITV() {
		Scanner sc = new Scanner(System.in);
		int dia = 0;
		System.out.println("DATOS ITV");
		System.out.println("");
		System.out.println("Introduce la fecha de tu próxima ITV.");
		System.out.println("\n_____________________\n");
		System.out.print("Introduce el día: ");
		
		boolean validacionDia = false;
		while (!validacionDia) {
			try {
				dia = sc.nextInt();
				validacionDia = true;
			} catch (InputMismatchException e) {
				System.out.print("Introduce un número: ");
			} catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
				
			} finally {
				sc.nextLine();
			}
		}
		int mes = 0;
		System.out.print("Introduce el mes: ");
		boolean validacionMes = false;

		while (!validacionMes) {
			try {
				mes = sc.nextInt();
				validacionMes = true;
			} catch (InputMismatchException a) {
				System.out.print("Introduce un número:");

			} finally {
				sc.nextLine();
			}
		}
		int anio = 0;
		System.out.print("Introduce el año: ");
		boolean validacionAnio = false;

		while (!validacionAnio) {
			try {
				anio = sc.nextInt();
				validacionAnio = true;
			} catch (InputMismatchException b) {
				System.out.print("Introduce un número:");
			} finally {
				sc.nextLine();
			}

		}
		int diaActual=0;
		Calendar calendario = new GregorianCalendar();
		if (calendario.get(Calendar.DAY_OF_MONTH) > dia) {
			 diaActual = 30-calendario.get(Calendar.DAY_OF_MONTH);
		} else {
			 diaActual = dia - calendario.get(Calendar.DAY_OF_MONTH);
		}
		
		int mesActual = mes - calendario.get(Calendar.MONTH);
		int anioActual = anio - calendario.get(Calendar.YEAR);

		int resultado = (diaActual + (mesActual) + (anioActual * 365));
		System.out.println("Te quedan " + resultado + " días para pasar la ITV.");
		
	}
	/**
	 * Calcula los kilómetros totales que se han hecho en los días indicados por el usuario. Devuelve un integer.
	 * @param c
	 * @return
	 */
	public int calculaKm(Coche c) {
		Scanner sc = new Scanner(System.in);
		int dias;
		int km;
		int resultado = 0;
		int contador = 0;
		System.out.print("Ingrese el numero de días de los que quiere registrar");
		dias = sc.nextInt();

		for (int i = 0; i < dias; i++) {
			contador++;
			System.out.println("___Día " + contador + "___");
			System.out.print("Kilometros realizados: ");
			km = sc.nextInt();
			resultado += km;
		}
		
		return resultado;
	}
	/**
	 * Informa al usuario sobre el permiso de moto que necesitaría en función de la cilindrada. Devuelve un tipo String.
	 * @param m
	 * @return
	 */
	public String permisoMoto(Moto m) {

		Scanner sc = new Scanner(System.in);
		String permiso = "";
		System.out.print("Introduce la cilindrada de la moto: ");
		m.setCilindrada(sc.nextShort());
		System.out.println("Has introducido " + m.getCilindrada() + " km3");

		if (m.getCilindrada() > 50 && m.getCilindrada() < 125) {
			permiso = "Necesitarías el carnet A2 o AM";
		} else if (m.getCilindrada() == 125) {
			permiso = "Necesitarías el carnet B o A1";
		} else if (m.getCilindrada() > 125 && m.getCilindrada() <= 500) {
			permiso = "Necesitarías un carnet A";
		} else {
			System.out.println("Dato inválido");
		}
		
		return permiso;

	}
	/**
	 * Indica el número de ruta de autobús que pertenece al usuario. Devuelve un integer.
	 * @param a
	 * @return
	 */
	public int numRuta(Autobus a) {
		System.out.println("Geolocalizando...");
		System.out.println("Geolocalizando...");
		System.out.println("Geolocalizando...");
		System.out.println("Geolocalizando...");
		System.out.println("Geolocalizando...");

		int num = (int) Math.floor(Math.random() * (600 - 500 + 1) + 500);
		return num;

	}
	/**
	 * Indica al usuario la velocidad máxima permitida para un camión en función de la vía. Devuelve un tipo String.
	 * @param cam
	 * @return
	 */
	public String velocidad(Camion cam) {
		Scanner sc = new Scanner(System.in);
		String aux = "";
		String def = "";

		System.out.println("____MENU____");
		System.out.println("- Autopista");
		System.out.println("- Autovia");
		System.out.println("- Carretera");
		System.out.println("- Vía urbana");
		System.out.println("- Zona peatonal");
		System.out.print("Escribe la via de la que quieras saber su velocidad: ");
		aux = sc.nextLine();

		if (aux.equalsIgnoreCase("autopista")) {
			def = "La velocidad es 110 km";
		} else if (aux.equalsIgnoreCase("autovia")) {
			def = "La velocidad es 110km";
		} else if (aux.equalsIgnoreCase("carretera")) {
			def = "La velocidad es 80km";
		} else if (aux.equalsIgnoreCase("via urbana")) {
			def = "La velocidad es 40km";
		} else if (aux.equalsIgnoreCase("zona peatonal")) {
			def = "La velocidad es 20km";
		} else {
			System.out.println("No te he entendido");
		}
		
		return def;
	}
	/**
	 * Este método es el principal agente intermediario entre el controlador y la vista. No devuelve ningún valor.
	 */
	public void menu() {
		Scanner sc = new Scanner(System.in);
		Formulario f = new Formulario();
		Coche miCoche = new Coche();
		Moto miMoto = new Moto();
		Autobus miAutobus = new Autobus();
		Camion miCamion = new Camion();

		int opcion;
		do {
			System.out.println("_________MENU_________");
			System.out.println("1. ¿Cuánto me queda para la ITV?");
			System.out.println("2. Calculador de kilómetros de mi coche");
			System.out.println("3. ¿Qué permiso de moto necesito?");
			System.out.println("4. La ruta de mi autobús");
			System.out.println("5. Velocidad de mi camión");
			System.out.println("6. Salir");
			System.out.print("Introduce la opción: ");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				f.calculaITV();
				break;
			case 2:
				int km = f.calculaKm(miCoche);
				System.out.println("Has realizado " + km + " kilómetros.");
				break;
			case 3:
				String moto = f.permisoMoto(miMoto);
				System.out.println(moto);
				break;
			case 4:
				int ruta = f.numRuta(miAutobus);
				System.out.println("Coge la ruta " + ruta);
				break;
			case 5:
				String camion = f.velocidad(miCamion);
				System.out.println(camion);
				break;
			case 6:
				System.out.println("¡Hasta Pronto!");
				break;
			default:
				System.out.println("Opción inválida. Vuelve a probar.");
			}
			
		} while (opcion != 6);
		sc.close();
	}	

}
