package controlador;

import vista.Formulario;
/**
 * Clase principal del controlador.
 * @author grupo
 *
 */
public class Main {
	/**
	 * Su funci�n es traer el men� al usuario.
	 * @param args
	 */
	public static void main(String[] args) {
		Formulario miFormulario = new Formulario();
		miFormulario.menu();

	}

}
